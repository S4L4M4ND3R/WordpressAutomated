package TestLogin;

import LoginPage.LoginPage;
import org.junit.Assert;
import org.junit.Test;

public class TestLogin {

    @Test
    public void testLoginAdmin() throws InterruptedException {

        LoginPage.GoTo();
        LoginPage.loginAs("foxyka15001").withPass("valid password").login();
//        ProfilePage.GoTo();
//
//        Assert.assertTrue("Wrong user login.", ProfilePage.profileName() == "foxyka15001");

    }

}
