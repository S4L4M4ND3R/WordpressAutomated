package LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    WebDriver driver;

    public Driver(){
        String exePath = "D:\\Downloads\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        this.driver = new ChromeDriver();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
