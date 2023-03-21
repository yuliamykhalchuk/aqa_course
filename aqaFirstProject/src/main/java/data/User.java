package data;

public class User {
    private String username;
    private String password;
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void createUser(User user) {
        setUsername("Yullia");
        setPassword("kkkk");
        System.out.println("Added a new user: " + username + ", " + password);
    }
    public void deleteUser(User user) {
        user = null;
        System.out.println("Deleted user: " + user);
    }
}
