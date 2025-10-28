package agurchu.codewithritmo.usermanager;

public abstract class User {
    public abstract String getUsername();
    public abstract void setUsername(String username);
    public abstract String getEmail();
    public abstract void setEmail(String email);
    public abstract int getAge();
    public abstract void setAge(int age);
    public abstract String getRole();
}
