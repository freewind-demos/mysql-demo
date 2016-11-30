package my;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class JdbcInsert {

    public static void insert() throws SQLException {
        System.out.println("------- inserting ------");
        Connection conn = DriverManager.getConnection(DB.URL);
        Map<String, String> books = new HashMap<String, String>();
        books.put("Java", "一本好书");
        books.put("JavaScript", "另一本好书");
        for (String title : books.keySet()) {
            String description = books.get(title);
            PreparedStatement stmt = conn.prepareStatement("insert into books(title, description) values(?, ?)");
            stmt.setString(1, title);
            stmt.setString(2, description);
            stmt.execute();
            stmt.close();
        }
        conn.close();
    }

    public static void main(String[] args) throws SQLException {
        insert();
    }

}
