package Gun03;

import Utlity.BaseDriver;
import Utlity.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class _02_AddressFunctionality extends BaseDriver {
    /*
       Senaryo;
       1- Siteyi açınız.
       2- Adress Ekleyiniz.
       3- En son adresi edit yaparak ad ve soyadı değiştirip kaydediniz.
       4- En sondan 2. adresi siliniz.
 */
    @Test
    void addAdressBook() {
        WebElement adressBook = driver.findElement(By.linkText("Address Book"));
        adressBook.click();

        WebElement NewaddAdress = driver.findElement(By.linkText("New Address"));
        NewaddAdress.click();

        WebElement firsname = driver.findElement(By.id("input-firstname"));
        firsname.sendKeys("Zorbey");

        WebElement lastname = driver.findElement(By.id("input-lastname"));
        lastname.sendKeys("Durmaz");

        WebElement company = driver.findElement(By.id("input-company"));
        company.sendKeys("TechnoStudy");

        /***********/
        WebElement adresss1 = driver.findElement(By.id("input-address-1"));
        adresss1.sendKeys("Bagcılar/İstanbul");

        WebElement city = driver.findElement(By.id("input-city"));
        city.sendKeys("Istanbul");

        WebElement postcode = driver.findElement(By.id("input-postcode"));
        postcode.sendKeys("34034");

        WebElement country = driver.findElement(By.id("input-country"));
        Select select = new Select(country);
        select.selectByVisibleText("Turkey");

        WebElement state = driver.findElement(By.id("input-zone"));
        Select select1 = new Select(state);
        select1.selectByVisibleText("İstanbul");
        //   select1.selectByIndex(7);
        // select1.selectByValue("3321");

        // stale element hatası : tez buldum erken kaybettim

        //selectByVisibleText, selectByValue : findElement gibi çalıştığından
        //                                     implictly wait i kullanır.
        // selectByIndex : implicitlyWait ie çalışMIYOR. ancak ExplicitWait ile çalışır
        WebElement Yes = driver.findElement(By.xpath("(//input[@name='default'])[1]"));
        Yes.click();

        WebElement continebutton = driver.findElement(By.cssSelector("input[class='btn btn-primary']"));
        continebutton.click();
        Tools.SuccesSmsTrue();

    }


    @Test(dependsOnMethods = {"addAdressBook"})
    void addAdressEdit() {


        WebElement adressBook = driver.findElement(By.linkText("Address Book"));
        adressBook.click();

        List<WebElement>  EditButton = driver.findElements(By.linkText("Edit"));
         WebElement sonEdit = EditButton.get(EditButton.size()-1);
         sonEdit.click();

        WebElement firsname = driver.findElement(By.id("input-firstname"));
        firsname.clear();
        firsname.sendKeys("ZORBEY");


          WebElement lastname = driver.findElement(By.id("input-lastname"));
          lastname.clear();
          lastname.sendKeys("DURMAZ");

          WebElement continebutton = driver.findElement(By.cssSelector("input[class='btn btn-primary']"));
         continebutton.click();

         Tools.SuccesSmsTrue();


    }

    @Test(dependsOnMethods = {"addAdressEdit"})
    void DeleteaddAdress() {
        WebElement adressBook = driver.findElement(By.linkText("Address Book"));
        adressBook.click();

        List<WebElement>  DeleteButton = driver.findElements(By.linkText("Delete"));
        WebElement DeleteEdit = DeleteButton.get(DeleteButton.size()-2);
        DeleteEdit.click();

        Tools.SuccesSmsTrue();

    }
}
