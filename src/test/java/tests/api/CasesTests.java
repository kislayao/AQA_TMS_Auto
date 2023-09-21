package tests.api;

import baseEntities.BaseApiTest;
import com.google.gson.Gson;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import models.Cases;
import org.apache.http.HttpStatus;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import services.CasesService;
import utils.Endpoints;

import static io.restassured.RestAssured.given;

public class CasesTests extends BaseApiTest {

    static Logger logger = LogManager.getLogger(CasesTests.class);
    private int case_id;
    private Cases actualCase;
    private Cases expectedCase;

    @Test
    public void addCaseTest() {

        SectionTests expectedSection = new SectionTests();
        expectedSection.addSectionTest();

        Gson gson = new Gson();

        CasesService casesService = new CasesService();
        expectedCase = casesService.findAllCases().get(0);

        Response response = given()
                .pathParam("section_id", expectedSection.getSection_id())
                .body(expectedCase, ObjectMapperType.GSON)
                .post(Endpoints.ADD_CASE)
                .then()
                .log().body()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .response();

        actualCase = gson.fromJson(response.getBody().asString(), Cases.class);
        System.out.println(actualCase.toString());
        System.out.println(expectedCase.toString());
        Assert.assertTrue(expectedCase.equals(actualCase));

        case_id = response.getBody().jsonPath().getInt("id");

        logger.info(case_id);
    }

    @Test
    public void getCaseTest() {

        addCaseTest();

        Gson gson = new Gson();

        Response response = given()
                .pathParam("case_id", case_id)
                .when()
                .get(Endpoints.GET_CASE);

        Cases getCase = gson.fromJson(response.getBody().asString(), Cases.class);
        System.out.println(getCase.toString());
        Assert.assertTrue(actualCase.equals(getCase));

    }

    @Test
    public void updateCaseTest() {

        getCaseTest();

        Gson gson = new Gson();

        CasesService casesService = new CasesService();
        expectedCase = casesService.findAllCases().get(1);

        Response response = given()
                .pathParam("case_id", case_id)
                .body(expectedCase, ObjectMapperType.GSON)
                .post(Endpoints.UPDATE_CASE)
                .then()
                .log().body()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .response();

        Cases updatedCase = gson.fromJson(response.getBody().asString(), Cases.class);
        System.out.println(updatedCase.toString());
        Assert.assertTrue(expectedCase.equals(updatedCase));
    }

    @Test
    public void deleteCaseTest() {

        getCaseTest();

        Response response = given()
                .pathParam("case_id", case_id)
                .when()
                .post(Endpoints.DELETE_CASE)
                .then()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .response();

    }




}
