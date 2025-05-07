package JavaFXApp.src.com.model;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    private final DatabaseManager dbManager;
    private Map<String, User> userCache = new HashMap<>();

    public UserRepository() {
        this.dbManager = new DatabaseManager();
        refreshUserCache();
    }

    private void refreshUserCache() {
        userCache.clear();

        dbManager.executeQuery(
                "SELECT ID, Nome, Cognome, Email, Password, Amministratre FROM User",
                rs -> {
                    while (rs.next()) {
                        String username = rs.getString("username");
                        String password = rs.getString("password");
                        boolean isAdmin = rs.getInt("is_admin") == 1;

                        User user = new User(username, password, isAdmin);
                        userCache.put(username, user);
                    }
                    return null;
                }
        );
    }

}
