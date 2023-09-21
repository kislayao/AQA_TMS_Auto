package tests.api;

import baseEntities.BaseApiTest;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import models.Milestone;
import org.apache.http.HttpStatus;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import services.MilestoneService;
import utils.Endpoints;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class MilestonesTests extends BaseApiTest {

    static Logger logger = LogManager.getLogger(MilestonesTests.class);
    private int milestone_id;
    private Milestone expectedMilestone;

    @Test
    public void addMilestoneTest() {

        ProjectTests expectedProject = new ProjectTests();
        expectedProject.addProjectTest();

        MilestoneService milestoneService = new MilestoneService();
        expectedMilestone = milestoneService.findAllMilestones().get(1);

        Response response_milestone = given()
                .pathParam("project_id", expectedProject.getProject_id())
                .body(expectedMilestone, ObjectMapperType.GSON)
                .log().all()
                .when()
                .post(Endpoints.ADD_MILESTONE)
                .then()
                .log().body()
                .statusCode(HttpStatus.SC_OK)
                .body("name", is(expectedMilestone.getName()))
                .extract()
                .response();

        milestone_id = response_milestone.getBody().jsonPath().getInt("id");
        logger.info(milestone_id);

    }

    @Test
    public void getMilestoneTest() {

        addMilestoneTest();

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

    @Test
    public void updateMilestoneTest() {

        getMilestoneTest();

        MilestoneService milestoneService = new MilestoneService();
        expectedMilestone.setDescription("New desc The Newest");
        milestoneService.updateMilestone(expectedMilestone);

        Response response_milestone = given()
                .body(expectedMilestone, ObjectMapperType.GSON)
                .pathParam("milestone_id", milestone_id)
                .log().all()
                .when()
                .post(Endpoints.UPDATE_MILESTONE)
                .then()
                .log().body()
                .statusCode(HttpStatus.SC_OK)
                .body("description", is(expectedMilestone.getDescription()))
                .extract()
                .response();
    }

    @Test
    public void deleteMilestoneTest() {

        getMilestoneTest();

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
