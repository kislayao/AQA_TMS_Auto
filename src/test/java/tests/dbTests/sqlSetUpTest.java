package tests.dbTests;

import baseEntities.BaseDBTest;
import dbEntities.CasesTable;
import dbEntities.MilestonesTable;
import models.Cases;
import models.Milestone;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import services.CasesService;
import services.MilestoneService;

public class sqlSetUpTest extends BaseDBTest {

    static Logger logger = LogManager.getLogger(sqlSetUpTest.class);

    @Test
    public void createMilestonesTableTest() {

        MilestonesTable milestonesTable = new MilestonesTable(dataBaseService);
        milestonesTable.dropTable();
        milestonesTable.createTable();

        MilestoneService milestoneService = new MilestoneService();
        Milestone milestone = new Milestone("Milestone Name 1", "Description Of Milestone 1");
        milestoneService.saveMilestone(milestone);
        Milestone milestone2 = new Milestone("Milestone Name 2", "Description Of Milestone 2");
        milestoneService.saveMilestone(milestone2);

    }

    @Test
    public void createCasesTableTest() {

        CasesTable casesTable = new CasesTable(dataBaseService);
        casesTable.dropTable();
        casesTable.createTable();

        CasesService casesService = new CasesService();
        Cases case1 = new Cases("Test Case Title");
        casesService.saveCase(case1);
        Cases case2 = new Cases("Random Title for TC");
        casesService.saveCase(case2);

    }

}
