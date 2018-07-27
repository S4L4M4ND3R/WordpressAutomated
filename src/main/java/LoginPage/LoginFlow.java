package LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginFlow {

    String username;
    String password;

    public LoginFlow(String username){
        this.username = username;
    }

    public LoginFlow withPass(String password){
        this.password = password;
        return this;
    }

    public void login() throws InterruptedException {
        Thread.sleep(500);
        Driver driver = new Driver();
        WebElement username = driver.getDriver().findElement(By.cssSelector("[id='usernameOrEmail']"));
        username.sendKeys(this.username);
        WebElement submit_button = driver.getDriver().findElement(By.xpath("//button[@type='submit']"));
        submit_button.click();
        driver.wait(5);
        WebElement password = driver.getDriver().findElement(By.cssSelector("[id='password']"));
        password.sendKeys(this.password);
        WebElement login_button = driver.getDriver().findElement(By.xpath("//button[@type='submit']"));
        login_button.click();
    }

}
