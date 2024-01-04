package Gun06;

import Utlity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _03_PlaceOrder extends BaseDriver {
    @Test
    void Test(){
        _04_PlaceOrderElements elements = new _04_PlaceOrderElements();

        elements.searchInput.sendKeys("samsung");
        elements.searchButton.click();
        elements.addToChart.click();
        elements.shoppingChart.click();
        elements.Checkout.click();


        wait.until(ExpectedConditions.elementToBeClickable(elements.Continue)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.Continue1)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.Continue2)).click();
        elements.ContinueClick.click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.Continue3)).click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.Continue4)).click();



        wait.until(ExpectedConditions.urlContains("success"));

        WebElement texttrue = driver.findElement(By.cssSelector("div[id='content']>h1"));
        Assert.assertEquals(texttrue.getText(),"Your order has been placed!");
    }
}


