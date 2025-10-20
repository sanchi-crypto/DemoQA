package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void invalidLoginTest() {
        LoginPage login = new LoginPage(driver);
        login.login("wrongUser", "wrongPass");
        Assert.assertTrue(login.getErrorMessage().contains("Invalid username or password!"));
    }
}