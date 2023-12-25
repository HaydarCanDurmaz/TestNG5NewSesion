package Gun02;

import Utlity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _02_Soru extends BaseDriver {
    @Test
    void LoginTest(){

        driver.get("https://opencart.abstracta.us/index.php?route=account/login");

        WebElement login = driver.findElement(By.id("input-email"));
        login.sendKeys("zorbey@gmail.com");

        WebElement password = driver.findElement(By.id("input-password"));
        password.sendKeys("1234567");

        WebElement submit = driver.findElement(By.cssSelector("input[class='btn btn-primary']"));
        submit.click();

        //Assert.assertTrue(driver.getTitle().equals("My Account"));
        //Assert.assertEquals(driver.getTitle(),"My Account", "Login olamadı");
        Assert.assertTrue(driver.getCurrentUrl().contains("account/account"));
    }
}
