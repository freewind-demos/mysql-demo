package my;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        DB.createTable();

        JdbcInsert.insert();
        JdbcLoad.loadAll();

        JdbcQuery.queryById(1L);

        JdbcUpdate.update(1L);
        JdbcLoad.loadAll();

        JdbcDelete.deleteById(1L);
        JdbcLoad.loadAll();
    }
}
