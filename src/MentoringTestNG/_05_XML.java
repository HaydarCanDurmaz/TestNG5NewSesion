package MentoringTestNG;

import Utlity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class _05_XML extends BaseDriver {
    @Test(groups = "Smoke")
    public void Test(){
        driver.get("http://admin-demo.nopcommerce.com/");

        WebElement login = driver.findElement(By.cssSelector("button[type='submit']"));
        login.click();

    }
    @Test
    public void Test2(){
        driver.get("http://admin-demo.nopcommerce.com/");

        WebElement login = driver.findElement(By.cssSelector("button[type='submit']"));
        login.click();
        System.out.println("Test 2 Working");

    }
    @Test(groups = "Regession")
    public void Test3(){
        driver.get("http://admin-demo.nopcommerce.com/");

        WebElement logout = driver.findElement(By.linkText("Logout"));
        logout.click();
        System.out.println("Test 3 Working");

    }
    @Test
    public void Test4(){
        driver.get("http://admin-demo.nopcommerce.com/");

        WebElement search = driver.findElement(By.cssSelector("input[placeholder='Search']"));
        search.click();
        System.out.println("Test 4 Working");

    }
}
