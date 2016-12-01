package my;

import java.sql.*;

public class JdbcLoad {

    public static void loadAll() throws SQLException {
        System.out.println("------- load all ------");
        Connection conn = DB.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from books");
        while (rs.next()) {
            Long id = rs.getLong("id");
            String title = rs.getString("title");
            String description = rs.getString("description");
            System.out.println("Book #" + id + ", title=" + title + ", description=" + description);
        }
        rs.close();
        stmt.close();
        conn.close();
    }

    public static void main(String[] args) throws SQLException {
        loadAll();
    }

}
