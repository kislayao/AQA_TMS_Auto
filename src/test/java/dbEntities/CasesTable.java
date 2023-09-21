package dbEntities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import services.DataBaseService;

import java.sql.ResultSet;

public class CasesTable {
    static Logger logger = LogManager.getLogger(CasesTable.class);

    DataBaseService dataBaseService;

    public CasesTable(DataBaseService dataBaseService) {
        this.dataBaseService = dataBaseService;
    }

    public void dropTable() {
        logger.info("Удаляем cases таблицу");
        String dropTableCasesSQL = "DROP TABLE Cases;";

        dataBaseService.executeSQL(dropTableCasesSQL);
    }

    public void createTable() {
        logger.info("Создаем cases таблицу");

        String createTableSQL = "CREATE TABLE Cases (" +
                "ID SERIAL PRIMARY KEY, " +
                "Title CHARACTER VARYING(30) " +
                ");";

        dataBaseService.executeSQL(createTableSQL);
    }

    public void addCase(String title) {
        logger.info("Добавляем запись в таблицу");

        String insertTableSQL = "INSERT INTO public.Cases(" +
                "firstname, lastname, email, age)" +
                "VALUES ('" + title + "');";

        dataBaseService.executeSQL(insertTableSQL);
    }

    public ResultSet getAllCases() {
        String selectSQL = "SELECT * FROM public.Cases ORDER BY id ASC;";

        return dataBaseService.executeQuery(selectSQL);
    }

    public ResultSet getById(int id) {
        String selectSQL = "SELECT * FROM public.Cases WHERE id = " + id + ";";

        return dataBaseService.executeQuery(selectSQL);
    }
}
