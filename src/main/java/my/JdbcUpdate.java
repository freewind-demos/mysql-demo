package my;

import java.sql.*;

public class JdbcUpdate {


    public static void update(Long bookId) throws SQLException {
        System.out.println("------- update by id ------");
        Connection conn = DriverManager.getConnection(DB.URL);
        PreparedStatement stmt = conn.prepareStatement("update books set description=? where id=?");
        stmt.setString(1, "new-description");
        stmt.setLong(2, bookId);
        int updatedCount = stmt.executeUpdate();
        stmt.close();
        conn.close();
        System.out.println("Updated " + updatedCount + " rows");
    }

    public static void main(String[] args) throws SQLException {
        update(1L);
    }

}
