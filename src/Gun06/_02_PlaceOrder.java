package Gun06;

import Utlity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _02_PlaceOrder extends BaseDriver {
    /*
    Senaryo :
            1- Siteyi açınız.
            2- Sitede "ipod" kelimesini aratınız
   3- Çıkan sonuçlardan ilkini sepete atınız.
   4- Shopping Chart a tıklatınız.
            5- Checkout yapınız.
            6- Continue butonalarına tıklatıp bilgileri giriniz.
   7- En confirm ile siparişi verdiğinizi doğrulayınız.
    doğrulamayı çıkan sayfadaki "Your order has been placed" yazısı ile yapınız.
*/
    @Test
    void Test(){
        WebElement searchInput= driver.findElement(By.cssSelector("[name='search']"));
        searchInput.sendKeys("ıpod");

        WebElement searchButton= driver.findElement(
                By.cssSelector("[class='btn btn-default btn-lg']"));
        searchButton.click();

        WebElement addToChart=driver.findElement(By.xpath("//span[text()='Add to Cart']"));
        addToChart.click();

        WebElement shoppingChart=driver.findElement(By.linkText("Shopping Cart"));
        shoppingChart.click();

        WebElement Checkout = driver.findElement(By.cssSelector("a[class='btn btn-primary']"));
        Checkout.click();

        WebElement Continue = driver.findElement(By.id("button-payment-address"));
        Continue.click();

        WebElement Continue1 = driver.findElement(By.id("button-shipping-address"));
        Continue1.click();

        WebElement Continue2 = driver.findElement(By.id("button-shipping-method"));
        Continue2.click();

        WebElement ContinueClick = driver.findElement(By.name("agree"));
        ContinueClick.click();

        WebElement Continue3 = driver.findElement(By.id("button-payment-method"));
        Continue3.click();

        WebElement Continue4 = driver.findElement(By.id("button-confirm"));
        Continue4.click();

        wait.until(ExpectedConditions.urlContains("success"));

        WebElement texttrue = driver.findElement(By.cssSelector("div[id='content']>h1"));
        Assert.assertEquals(texttrue.getText(),"Your order has been placed!");
    }
}
