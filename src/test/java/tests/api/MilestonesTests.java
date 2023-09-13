package tests.api;

import baseEntities.BaseApiTest;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import models.Milestone;
import models.Project;
import org.apache.http.HttpStatus;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import utils.Endpoints;
import static org.hamcrest.Matchers.*;

import static io.restassured.RestAssured.given;

public class MilestonesTests extends BaseApiTest {

    static Logger logger = LogManager.getLogger(MilestonesTests.class);
    private int milestone_id;

    @Test (priority = 1)
    public void addMilestoneTest() {

        String endpoint = "/index.php?/api/v2/add_project";

        Project expectedProject = Project.builder()
                .projectName("New test project")
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

        int project_id = response_project.getBody().jsonPath().getInt("id");

        Milestone expectedMilestone = new Milestone();
        expectedMilestone.setName("test milestone");

        Response response_milestone = given()
                .pathParam("project_id",project_id)
                .body(expectedMilestone, ObjectMapperType.GSON)
                .log().all()
                .when()
                .post(Endpoints.ADD_MILESTONE)
                .then()
                .log().body()
                .statusCode(HttpStatus.SC_OK)
                .body("name", is(expectedMilestone.getName()) )
                .extract()
                .response();

        milestone_id = response_milestone.getBody().jsonPath().getInt("id");
        logger.info(milestone_id);

    }

    @Test (priority = 2)
    public void getMilestoneTest() {

        Response response_milestone = given()
                .pathParam("milestone_id", milestone_id)
                .log().all()
                .when()
                .get(Endpoints.GET_MILESTONE)
                .then()
                .log().body()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .response();

    }

    @Test (priority = 3)
    public void updateMilestoneTest() {

        Milestone expectedMilestone = new Milestone();
        expectedMilestone.setDescription("New desc");

        Response response_milestone = given()
                .body(expectedMilestone, ObjectMapperType.GSON)
                .pathParam("milestone_id", milestone_id)
                .log().all()
                .when()
                .post(Endpoints.UPDATE_MILESTONE)
                .then()
                .log().body()
                .statusCode(HttpStatus.SC_OK)
                .body("description", is(expectedMilestone.getDescription()) )
                .extract()
                .response();
    }

    @Test (priority = 4)
    public void deleteMilestoneTest() {

        Response response_milestone = given()
                .pathParam("milestone_id", milestone_id)
                .log().all()
                .when()
                .post(Endpoints.DELETE_MILESTONE)
                .then()
                .log().body()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .response();
    }

}
