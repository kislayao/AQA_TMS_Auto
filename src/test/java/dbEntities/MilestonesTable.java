package dbEntities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import services.DataBaseService;

import java.sql.ResultSet;

public class MilestonesTable {
    static Logger logger = LogManager.getLogger(MilestonesTable.class);

    DataBaseService dataBaseService;

    public MilestonesTable(DataBaseService dataBaseService) {
        this.dataBaseService = dataBaseService;
    }

    public void dropTable() {
        logger.info("Удаляем milestones таблицу");
        String dropTableMilestonesSQL = "DROP TABLE Milestones;";

        dataBaseService.executeSQL(dropTableMilestonesSQL);
    }

    public void createTable() {
        logger.info("Создаем milestones таблицу");

        String createTableSQL = "CREATE TABLE Milestones (" +
                "ID SERIAL PRIMARY KEY, " +
                "Name CHARACTER VARYING(30), " +
                "Description CHARACTER VARYING(130) " +
                ");";

        dataBaseService.executeSQL(createTableSQL);
    }

    public void addMilestone(String name, String description) {
        logger.info("Добавляем запись в таблицу");

        String insertTableSQL = "INSERT INTO public.Milestones(" +
                "firstname, lastname, email, age)" +
                "VALUES ('" + name + "', '" + description + "');";

        dataBaseService.executeSQL(insertTableSQL);
    }

    public ResultSet getAllMilestones() {
        String selectSQL = "SELECT * FROM public.Milestones ORDER BY id ASC;";

        return dataBaseService.executeQuery(selectSQL);
    }

    public ResultSet getById(int id) {
        String selectSQL = "SELECT * FROM public.Milestones WHERE id = " + id + ";";

        return dataBaseService.executeQuery(selectSQL);
    }
}
