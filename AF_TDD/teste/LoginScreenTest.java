package teste;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class LoginScreenTest {
    private LoginScreen loginScreen;

    @Before
    public void setUp() {
        loginScreen = new LoginScreen();
    }

    @Test
    public void testLoginWithValidCredentials() {
        boolean result = loginScreen.login("validUser", "validPass");
        assertTrue(result);
    }

    @Test
    public void testLoginWithInvalidCredentials() {
        boolean result = loginScreen.login("invalidUser", "invalidPass");
        assertFalse(result);
    }

    @Test
    public void testLoginWithEmptyUsername() {
        boolean result = loginScreen.login("", "anyPass");
        assertFalse(result);
    }

    @Test
    public void testLoginWithEmptyPassword() {
        boolean result = loginScreen.login("anyUser", "");
        assertFalse(result);
    }
}
