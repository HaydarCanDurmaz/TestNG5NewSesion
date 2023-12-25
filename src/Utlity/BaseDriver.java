package Utlity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver {
    public static WebDriverWait wait;
    public static WebDriver driver;

    @BeforeClass
    public void BaslangicIslemleri() {
        System.out.println(" Başlangıç İşlemleri Başladı...");
        Logger logger = Logger.getLogger(""); // output yapılan logları al.
        logger.setLevel(Level.SEVERE); // sadece ERROR ları göster

        driver = new ChromeDriver(); // jenkins deyken : sen head olmadan yani hafızada çalış
        driver.manage().window().maximize(); // Ekranı max yapıyor.
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // 20 sn mühlet: sayfayı yükleme mühlet
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  // 20 sn mühlet: elementi bulma mühleti
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        LoginTest();
    }

    @AfterClass
    public void bitisIslemleri() {
        System.out.println("Bitiş İşlemleri yapılıyor...");
        Tools.Bekle(5);
        driver.quit();

    }

    @Test
    void LoginTest() {

        driver.get("https://opencart.abstracta.us/index.php?route=account/login");

        WebElement login = driver.findElement(By.id("input-email"));
        login.sendKeys("zorbey@gmail.com");

        WebElement password = driver.findElement(By.id("input-password"));
        password.sendKeys("1234567");

        WebElement submit = driver.findElement(By.cssSelector("input[class='btn btn-primary']"));
        submit.click();

    }
}
