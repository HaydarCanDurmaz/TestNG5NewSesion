package Gun02;

import Utlity.BaseDriver;
import Utlity.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _04_SubscribeNewsLetter extends BaseDriver {
    /*
  Senaryo
  1- Siteyi açınız.
  2- Newsletter  Subscribe işlemini abone lunuz(YES)
  3- Ayrı bir test ile Newsletter  Subscribe işlemini abonelikten çıkınız(NO)
  4- Ayrı bir test ile Newsletter  Subscribe durumunu kontrol ediniz YES ise NO, NO ise YES yapınız.
 */

    By link = By.linkText("Newsletter");
    By newLetterYESs = By.xpath("(//input[@name='newsletter'])[1]");
    By contineButton = By.cssSelector("input[value='Continue']");
    By newLetterNoo = By.xpath("(//input[@name='newsletter'])[2]");

    @Test(priority = 1)
    void NewsletterSubscribeYes() {


        WebElement newLetter = driver.findElement(link);
        newLetter.click();

        WebElement newLetterYES = driver.findElement(newLetterYESs);
        newLetterYES.click();

        WebElement continuee = driver.findElement(contineButton);
        continuee.click();
        Tools.SuccesSmsTrue();


    }

    @Test(priority = 2)
    void NewsletterSubscribeNo() {
        WebElement newLetter = driver.findElement(link);
        newLetter.click();

        WebElement newLetterNo = driver.findElement(newLetterNoo);
        newLetterNo.click();

        WebElement continuee = driver.findElement(contineButton);
        continuee.click();

        Tools.SuccesSmsTrue();


    }

    @Test(priority = 3)
    void NewsletterSubscribeNoandYes() {

        WebElement newLetter = driver.findElement(link);
        newLetter.click();

        WebElement newLetterYES = driver.findElement(newLetterYESs);
        WebElement newLetterNo = driver.findElement(newLetterNoo);

        if (newLetterYES.isSelected())
            newLetterNo.click();
        else
            newLetterYES.click();

        WebElement continuee = driver.findElement(contineButton);
        continuee.click();
    }
}
