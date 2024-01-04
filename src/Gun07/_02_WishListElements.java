package Gun07;

import Utlity.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _02_WishListElements {
    public _02_WishListElements() {
        PageFactory.initElements(BaseDriver.driver,this);

    }
    @FindBy(css = "[name='search']")
    public WebElement searchInput;

    @FindBy(css = "[class='btn btn-default btn-lg']")
    public WebElement searchButton;


}
