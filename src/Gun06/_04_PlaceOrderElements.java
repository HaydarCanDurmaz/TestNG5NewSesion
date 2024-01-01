package Gun06;

import Utlity.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _04_PlaceOrderElements {
    public _04_PlaceOrderElements() {
        PageFactory.initElements(BaseDriver.driver,this);
    }

    @FindBy(css = "[name='search']")
    public WebElement searchInput;

    @FindBy(css = "[class='btn btn-default btn-lg']")
    public WebElement searchButton;

    @FindBy(xpath = "//span[text()='Add to Cart']")
    public WebElement addToChart;

    @FindBy(linkText = "Shopping Cart")
    public WebElement shoppingChart;

    @FindBy(css = "a[class='btn btn-primary']")
    public WebElement Checkout;

    @FindBy(id = "button-payment-address")
    public WebElement Continue;

    @FindBy(id = "button-shipping-address")
    public WebElement Continue1;

    @FindBy(id = "button-shipping-method")
    public WebElement Continue2;

    @FindBy(name = "agree")
    public WebElement ContinueClick;

    @FindBy(id = "button-payment-method")
    public WebElement Continue3;

    @FindBy(id = "button-confirm")
    public WebElement Continue4;
}
