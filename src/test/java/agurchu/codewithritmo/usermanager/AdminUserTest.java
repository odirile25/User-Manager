package agurchu.codewithritmo.usermanager;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AdminUserTest {
    @Test void defaultValues() {
        AdminUser u = new AdminUser();
        assertEquals("AdminUser", u.getUsername());
        assertEquals("admin@example.com", u.getEmail());
        assertEquals(25, u.getAge());
        assertEquals("Admin", u.getRole());
    }

    @Test void parameterizedConstructor() {
        // TODO: use parameterized Constructor
    }

    @Test void setters() {
        AdminUser u = new AdminUser();
        // TODO: test setUsername, setEmail & setAge

    }

    @Test void negativeAge() {
        // TODO: test setAge with negative value
    }
}