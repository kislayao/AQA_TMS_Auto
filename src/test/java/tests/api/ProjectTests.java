package tests.api;

import baseEntities.BaseApiTest;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import models.Project;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ProjectTests extends BaseApiTest {

    public int getProject_id() {
        return project_id;
    }

    private int project_id;


    @Test
    public void addProjectTest() {

        String endpoint = "/index.php?/api/v2/add_project";

        Project expectedProject = Project.builder()
                .projectName("New test project NEW")
                .announcement("Random test description")
                .projectType(1)
                .flag(true)
                .build();

        Response response_project = given()
                .body(expectedProject, ObjectMapperType.GSON)
                .log().all()
                .when()
                .post(endpoint)
                .then()
                .log().body()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .response();

       project_id = response_project.getBody().jsonPath().getInt("id");
    }

}
