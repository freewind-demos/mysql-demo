package my;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DB {

    public static final String PASSWORD = "demo";
    public static final String USERNAME = "demo";
    public static final String URL = "jdbc:mysql://localhost:3306/mysql-demo?autoReconnect=true&useSSL=false";

    public static void createTable() throws SQLException {
        System.out.println("------- creating table ------");
        Connection conn = getConnection();
        Statement stmt = conn.createStatement();
        stmt.execute("DROP TABLE IF EXISTS `books`");
        stmt.execute("CREATE TABLE `books` (\n" +
                "  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,\n" +
                "  `title` varchar(40) DEFAULT NULL,\n" +
                "  `description` text,\n" +
                "  PRIMARY KEY (`id`)\n" +
                ") ENGINE=InnoDB DEFAULT CHARSET=utf8;");
        stmt.close();
        conn.close();
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB.URL, USERNAME, PASSWORD);
    }

}
