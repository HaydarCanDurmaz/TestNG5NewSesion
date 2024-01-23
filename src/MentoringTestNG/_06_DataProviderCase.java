package MentoringTestNG;

import Utlity.BaseDriver;
import Utlity.BaseDriverParameter;
import net.bytebuddy.utility.RandomString;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _06_DataProviderCase extends BaseDriverParameter {
    @Test(dataProvider = "credentials")
    public void LoginTest(String username, String password) {
        driver.get("https://www.saucedemo.com/");
        WebElement userName = driver.findElement(By.id("user-name"));
        userName.sendKeys(username);

        WebElement passWord = driver.findElement(By.id("password"));
        passWord.sendKeys(password);

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();


        if (username.equals("standard_user") && passWord.equals("secret_sauce")) {
            WebElement burgerMenu = driver.findElement(By.id("react-burger-menu-btn"));
            burgerMenu.click();
            WebElement logOut = driver.findElement(By.id("logout_sidebar_link"));
            logOut.click();

        } else if (username.equals("problem_user") && passWord.equals("secret_sauce")) {

            WebElement burgerMenu = driver.findElement(By.id("react-burger-menu-btn"));
            burgerMenu.click();
            WebElement logOut = driver.findElement(By.id("logout_sidebar_link"));
            logOut.click();

        } else if (username.equals("performance_glitch_user") && passWord.equals("secret_sauce")) {
            WebElement burgerMenu = driver.findElement(By.id("react-burger-menu-btn"));
            burgerMenu.click();
            WebElement logOut = driver.findElement(By.id("logout_sidebar_link"));
            logOut.click();

        } else {
            WebElement error = driver.findElement(By.xpath("//h3[@data-test='error']"));
            Assert.assertTrue(error.isDisplayed());
            driver.findElement(By.cssSelector(".error-button")).click();
            userName.clear();
            passWord.clear();

        }


    }

    @DataProvider
    public Object[][] credentials() {
        Object[][] credenalList = new Object[8][2];
        credenalList[0] = new Object[]{"standard_user", "secret_sauce"};
        credenalList[1] = new Object[]{"problem_user", "secret_sauce"};
        credenalList[2] = new Object[]{"standard_user", randomString()};
        credenalList[3] = new Object[]{"performance_glitch_user", "secret_sauce"};
        credenalList[4] = new Object[]{"standard_user", randomString()};
        credenalList[5] = new Object[]{"visual_user", "secret_sauce"};
        credenalList[6] = new Object[]{"standard_user", randomString()};
        credenalList[7] = new Object[]{"standard_user", "secret_sauce"};

        return credenalList;
    }
    @DataProvider
    private Iterator<Object[]> getData(){
        List<Object[]> credenalList = new ArrayList<>();
        credenalList.add(new Object[]{"standard_user", "secret_sauce"});
        return credenalList.iterator();
    }

    public static String randomString() {
        return RandomString.hashOf(8);
    }
}
