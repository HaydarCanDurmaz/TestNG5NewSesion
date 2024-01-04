package Utlity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

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
    public static int RandomGenerator(int max){ //4
        return (int)(Math.random()*max); // 0,1,2,3
    }
    public static void listContainsString(List<WebElement> list, String aranacakKelime){

        boolean bulundu=false;
        for(WebElement e: list){
            if (e.getText().toLowerCase().contains(aranacakKelime.toLowerCase()))
            {
                bulundu=true;
                break;
            }
        }

        if (bulundu==false)
            Assert.fail();

    }
}
