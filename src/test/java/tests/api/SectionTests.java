package tests.api;

import baseEntities.BaseApiTest;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import models.Sections;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;
import utils.Endpoints;

import static io.restassured.RestAssured.given;

public class SectionTests extends BaseApiTest {

    private ProjectTests expectedProject = new ProjectTests();

    public int getSection_id() {
        return section_id;
    }

    private int section_id;

    @Test
    public void addSectionTest() {

        expectedProject.addProjectTest();

        Sections expectedSection = Sections.builder()
                .sectionName("Test section name")
                .build();

        Response actualSection = given()
                .pathParam("project_id", expectedProject.getProject_id())
                .body(expectedSection, ObjectMapperType.GSON)
                .log().all()
                .when()
                .post(Endpoints.ADD_SECTION)
                .then()
                .log().body()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .response();

        section_id = actualSection.getBody().jsonPath().getInt("id");


    }

}
