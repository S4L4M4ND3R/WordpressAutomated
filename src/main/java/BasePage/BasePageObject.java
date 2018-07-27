package BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePageObject{

    WebDriver driver;

    public BasePageObject(){
        String exePath = "D:\\Downloads\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        this.driver = new ChromeDriver();
    }

    public WebDriver getWebDriver() {
        return this.driver;
    }

}

