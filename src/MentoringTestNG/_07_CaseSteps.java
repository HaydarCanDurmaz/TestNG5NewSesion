package MentoringTestNG;

import Utlity.BaseDriver;
import org.testng.annotations.Test;

public class _07_CaseSteps extends BaseDriver {
    //  Mentoring Wednesday’s task
    //  Test Case 1: Register Test
    //➢ https://cleverppc.com/prestashop4/ sitesine gidiniz.
    //          ➢ Sign In butonuna tıklayınız.
    //        ➢ Herhangi bir email adresi giriniz.
    //➢ Create an account butonuna tıklayınız.
    //➢ Açılan sayfada herhangi bir title seciniz.
    //          ➢ First name giriniz.
    //➢ Last name giriniz.
    //➢ Bir önceki sayfada girmiş oldunuz emailin bu sayfada olduğunu doğrulayınız.
    //          ➢ Password giriniz.
    //        ➢ Date of Birth seciniz.
    //      ➢ Register butonuna tıklayınız.
    //➢ Başarılı bir şekilde kayıt olduğunuzu doğrulayınız.
    //          ➢ Ayni zamanda siteye login olduğunuzu dogrulayiniz.
    //        ➢ Sign out butonuna tıklayarak çıkış yapınız.
    @Test
    public void Test1() {


        driver.get("https://cleverppc.com/prestashop4/");
        _07_CaseElements ls = new _07_CaseElements();
        ls.getLogin().click();
        ls.getEmailcreate().sendKeys("adhfdygfd@hotmail.com");
        ls.getSubmit().click();
        ls.getMr().click();
        ls.getFirstname().sendKeys("zorbey");
        ls.getLastname().sendKeys("durmaz");
        ls.getEmail1().click();
        ls.getPassword().sendKeys("123456775r");





    }
}

