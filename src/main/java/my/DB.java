package my;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {
    public static final String URL = "jdbc:h2:mem:demo;MODE=MYSQL;LOCK_MODE=0;DB_CLOSE_DELAY=-1";

    //    public static final String PASSWORD = "demo";
    //    public static final String USERNAME = "demo";
    //    public static final String URL = "jdbc:mysql://localhost:3306/jdbc-demo";


    public static void createTable() throws SQLException {
        System.out.println("------- creating table ------");
        Connection conn = DriverManager.getConnection(DB.URL);
        Statement stmt = conn.createStatement();
        stmt.execute("create table books(" +
                "  id int auto_increment primary key, " +
                "  title varchar(40), " +
                "  description varchar(200)" +
                ")");
        stmt.close();
        conn.close();
    }

}
