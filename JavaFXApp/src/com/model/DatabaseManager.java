package JavaFXApp.src.com.model;

import java.sql.*;

@FunctionalInterface
interface ResultSetProcessor<T> {
    T process(ResultSet rs) throws SQLException;
}

public class DatabaseManager {
    private final String dbUrl = "jdbc:sqlite:" + "src/resource/database/Telemedicina.db";

    public DatabaseManager() {
        try {
            Connection conn = DriverManager.getConnection(dbUrl);

        } catch (SQLException e) {
            System.out.println("❌ Errore di connessione: " + e.getMessage());
        }
    }


    public <T> void executeQuery(String sql, ResultSetProcessor<T> processor, Object... params) {
        try (Connection conn = DriverManager.getConnection(dbUrl);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            for (int i = 0; i < params.length; i++) {
                pstmt.setObject(i + 1, params[i]);
            }
            try (ResultSet rs = pstmt.executeQuery()) {
                processor.process(rs);
            }

        } catch (SQLException e) {
            System.err.println("❌ Errore di esecuzione della query: " + e.getMessage());
        }
    }


    public static void main(String[] args) {
        UserRepository test = new UserRepository();
        System.out.println(test.toString());
    }
}
