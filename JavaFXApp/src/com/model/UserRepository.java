package JavaFXApp.src.com.model;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    private final DatabaseManager dbManager;
    private Map<Integer, User> userCache = new HashMap<>();

    @Override
    public String toString() {
        return "UserRepository{" +
                "userCache=" + userCache +
                '}';
    }

    public UserRepository() {
        this.dbManager = new DatabaseManager();
        refreshUserCache();
    }

    private void refreshUserCache() {
        userCache.clear();          /* POTREBBE NON SERVIRE*/
        dbManager.executeQuery(
                "SELECT ID, Nome, Cognome, Email, Password, Amministratore FROM User",
                rs -> {
                    while (rs.next()) {
                        int ID = rs.getInt("ID");
                        String Nome = rs.getString("nome");
                        String Cognome = rs.getString("cognome");
                        String Email = rs.getString("email");
                        String Password = rs.getString("password");
                        boolean isAdmin = rs.getBoolean("Amministratore");

                        User user = new User(ID, Nome, Cognome, Email, Password, isAdmin);
                        userCache.put(ID, user);
                    }
                    return null;
                }
        );
    }

}
