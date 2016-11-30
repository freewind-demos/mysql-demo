package my;

import java.sql.*;

public class JdbcQuery {

    public static void queryById(Long bookId) throws SQLException {
        System.out.println("------- query by id ------");
        Connection conn = DriverManager.getConnection(DB.URL);
        PreparedStatement stmt = conn.prepareStatement("select * from books where id=?");
        stmt.setLong(1, bookId);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Long id = rs.getLong("id");
            String title = rs.getString("title");
            String description = rs.getString("description");
            System.out.println("Book #" + id + ", title=" + title + ", description=" + description);
        }
        stmt.close();
        conn.close();
    }

    public static void main(String[] args) throws SQLException {
        queryById(1L);
    }

}
