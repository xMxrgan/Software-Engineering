package JavaFXApp.src.com.model;

import java.io.File;
import java.sql.*;

public class DatabaseManager {
    private final String dbUrl = "jdbc:sqlite:" + "JavaFXApp/src/resource/database/Telemedicina.db";
    String query = "SELECT ID, Nome, Cognome FROM User";

    public DatabaseManager() {
        File dbFile = new File(dbUrl);

        try {
            /*  connessione al DB   */
            Connection conn = DriverManager.getConnection(dbUrl);


            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();

            /*while (rs.next()) {
                System.out.println("ID: " + rs.getString("ID") +
                        ", Nome: " + rs.getString("Nome") +
                        ", Cognome: " + rs.getString("Cognome"));
            }*/

        } catch (SQLException e) {
            System.out.println("❌ Errore di connessione: " + e.getMessage());
        }
    }

    /**
     * Execute a query and process the results with a ResultSetProcessor
     */


    public static void main(String[] args) {
        new DatabaseManager();
    }
}
