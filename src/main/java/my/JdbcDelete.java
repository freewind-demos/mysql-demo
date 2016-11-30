package my;

import java.sql.*;

public class JdbcDelete {

    public static void deleteById(Long bookId) throws SQLException {
        System.out.println("------- delete by id ------");
        Connection conn = DriverManager.getConnection(DB.URL);
        PreparedStatement stmt = conn.prepareStatement("delete from books where id=?");
        stmt.setLong(1, bookId);
        int deletedCount = stmt.executeUpdate();
        stmt.close();
        conn.close();

        System.out.println("Delete " + deletedCount + " rows");
    }

    public static void main(String[] args) throws SQLException {
        deleteById(1L);
    }

}
