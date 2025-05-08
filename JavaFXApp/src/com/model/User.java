package JavaFXApp.src.com.model;

public class User {
    private int ID;
    private String nome;
    private String cognome;
    private String email;
    private String password;
    private Boolean isAdmin;

    public int getID() {
        return ID;
    }
    public String getNome() {
        return nome;
    }
    public String getCognome() {
        return cognome;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public Boolean getAdmin() {
        return isAdmin;
    }


    public User(int ID, String nome, String cognome, String email, String password, Boolean isAdmin) {
        this.ID = ID;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    @Override
    public String toString() {
        return "User{" +
                "ID=" + ID +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", isAdmin=" + isAdmin +
                '}';
    }

}
