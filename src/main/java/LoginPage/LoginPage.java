package LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

    public static void GoTo() {
        Driver driver = new Driver();
        driver.getDriver().get("https://wordpress.com/log-in");
    }

    public static LoginFlow loginAs(String username){
        return new LoginFlow(username);
    }
}

