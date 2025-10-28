package agurchu.codewithritmo.usermanager;

public class StaffUser extends User {
    private String username;
    private String email;
    private int age;
    private final String role = "Staff";

    public StaffUser() {
        // TODO: initialise default values
    }

    public StaffUser(String username, String email, int age) {
        // TODO: initialise with supplied values
    }

    @Override
    public String getUsername() {
        // TODO: return username
        return null;
    }

    @Override
    public void setUsername(String username) {
        // TODO: set username
    }

    @Override
    public String getEmail() {
        // TODO: return email
        return null;
    }

    @Override
    public void setEmail(String email) {
        // TODO: set email
    }

    @Override
    public int getAge() {
        // TODO: return age
        return 0;
    }

    @Override
    public void setAge(int age) {
        // TODO: set age (must be >= 0)
    }

    @Override
    public String getRole() {
        // TODO: return fixed role "Staff"
        return null;
    }
}