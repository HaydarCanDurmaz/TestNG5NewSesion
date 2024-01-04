package Gun07;


import Gun06._04_PlaceOrderElements;
import Utlity.BaseDriver;
import Utlity.Tools;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _01_WishListPOM extends BaseDriver {

    @Test
    @Parameters("searchText")
    void addToWishList(String text){

        _04_PlaceOrderElements poe=new _04_PlaceOrderElements();

        poe.searchInput.sendKeys(text);
        poe.searchButton.click();

        _02_WishListElements wle=new _02_WishListElements();

        int randomSecim= Tools.RandomGenerator(wle.searhResult.size());
        String wishItemText=wle.searhResult.get(randomSecim).getText();
        wle.wishBtnList.get(randomSecim).click();
        wle.btnWisthProducts.click();
        Tools.listContainsString(wle.wishTableNames, wishItemText);

    }

}
