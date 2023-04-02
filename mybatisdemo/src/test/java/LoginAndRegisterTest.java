import junitTest.LoginAndRegister;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author:Su HangFei
 * @Date:2023-04-02 16 31
 * @Project:LiGongSSM
 */
public class LoginAndRegisterTest {
    private LoginAndRegister lr;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
    }

    @BeforeEach
    void setUp() throws Exception {
        lr = new LoginAndRegister();
        lr.register("testuser", "testpassword");
    }

    @AfterEach
    void tearDown() throws Exception {
    }

    @Test
    public void testRegister() {
        assertTrue(lr.register("newuser", "newpassword"));
        assertFalse(lr.register("testuser", "testpassword2"));
        assertThrows(IllegalArgumentException.class, () -> lr.register(null, "password"));
        assertThrows(IllegalArgumentException.class, () -> lr.register("username", null));
    }

    @Test
    public void testLogin() {
        assertTrue(lr.login("testuser", "testpassword"));
        assertFalse(lr.login("testuser", "wrongpassword"));
        assertFalse(lr.login("wronguser", "testpassword"));
    }

    @Test
    public void testResetPassword() {
        lr.resetPassword("testuser", "testpassword", "newpassword");
        assertFalse(lr.login("testuser", "testpassword"));
        assertTrue(lr.login("testuser", "newpassword"));
        assertThrows(IllegalArgumentException.class, () -> lr.resetPassword("testuser", "wrongpassword", "newpassword"));
    }

    @Test
    public void testDeleteUser() {
        lr.deleteUser("testuser", "testpassword");
        assertFalse(lr.login("testuser", "testpassword"));
        assertTrue(lr.register("testuser", "newpassword"));
        assertThrows(IllegalArgumentException.class, () -> lr.deleteUser("testuser", "wrongpassword"));
    }

}
