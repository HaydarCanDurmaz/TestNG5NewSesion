package Utlity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Tools {

    public static void Bekle(int sn){

        try {
            Thread.sleep(sn*1000l);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    public static void SuccesSmsTrue(){
        WebElement msjTrue = BaseDriver.driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible']"));
        Assert.assertTrue(msjTrue.getText().toLowerCase().contains("success"));
    }

}
