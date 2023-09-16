package tests.api;

import baseEntities.BaseApiTest;
import com.google.gson.Gson;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import models.Cases;
import models.Project;
import models.Sections;
import org.apache.http.HttpStatus;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Endpoints;

import static io.restassured.RestAssured.given;

public class CasesTests extends BaseApiTest {

    static Logger logger = LogManager.getLogger(CasesTests.class);
    private int case_id;
    private Cases actualCase;

    @Test(priority = 1)
    public void addCaseTest() {

        Gson gson = new Gson();

        String endpoint = "/index.php?/api/v2/add_project";

        Project expectedProject = Project.builder()
                .projectName("New test project")
                .announcement("Random test description")
                .projectType(1)
                .flag(true)
                .build();

        Response actualProject = given()
                .body(expectedProject, ObjectMapperType.GSON)
                .log().all()
                .when()
                .post(endpoint)
                .then()
                .log().body()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .response();

        int project_id = actualProject.getBody().jsonPath().getInt("id");

        Sections expectedSection = Sections.builder()
                .sectionName("Test section name")
                .build();

        Response actualSection = given()
                .pathParam("project_id", project_id)
                .body(expectedSection, ObjectMapperType.GSON)
                .log().all()
                .when()
                .post(Endpoints.ADD_SECTION)
                .then()
                .log().body()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .response();

        int section_id = actualSection.getBody().jsonPath().getInt("id");

        Cases expectedCase = Cases.builder()
                .caseTitle("Random Case Title")
                .build();

        Response response = given()
                .pathParam("section_id", section_id)
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

    @Test(priority = 2)
    public void getCaseTest() {

        Gson gson = new Gson();

        Response response = given()
                .pathParam("case_id", case_id)
                .when()
                .get(Endpoints.GET_CASE);

        Cases getCase = gson.fromJson(response.getBody().asString(), Cases.class);
        System.out.println(getCase.toString());
        Assert.assertTrue(actualCase.equals(getCase));

    }

    @Test(priority = 3)
    public void updateCaseTest() {

        Gson gson = new Gson();

        Cases infoToUpdateCase = Cases.builder()
                .caseTitle("New Case Title")
                .build();

        Response response = given()
                .pathParam("case_id", case_id)
                .body(infoToUpdateCase, ObjectMapperType.GSON)
                .post(Endpoints.UPDATE_CASE)
                .then()
                .log().body()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .response();

        Cases updatedCase = gson.fromJson(response.getBody().asString(), Cases.class);
        System.out.println(updatedCase.toString());
        Assert.assertTrue(infoToUpdateCase.equals(updatedCase));
    }

    @Test(priority = 4)
    public void deleteCaseTest() {

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
