package Gun02;

import Utlity.Tools;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class _01_Enable {
    @Test
    void Test1(){
        System.out.println("test 1");
    }
    @Test(enabled = false)
    void Test2(){
        System.out.println("test 2");
    }
    @Test
    void Test3(){
        System.out.println("test 3");
    }

    public static WebDriverWait wait;
    public static WebDriver driver;
    @BeforeClass
    void BaslangicIslemleri(){
        System.out.println(" Başlangıç İşlemleri Başladı...");
        Logger logger= Logger.getLogger(""); // output yapılan logları al.
        logger.setLevel(Level.SEVERE); // sadece ERROR ları göster

        driver = new ChromeDriver(); // jenkins deyken : sen head olmadan yani hafızada çalış
        //driver.manage().window().maximize(); // Ekranı max yapıyor.
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // 20 sn mühlet: sayfayı yükleme mühlet
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  // 20 sn mühlet: elementi bulma mühleti
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }
    @AfterClass
    void bitisIslemleri(){
        System.out.println("Bitiş İşlemleri yapılıyor...");
        Tools.Bekle(5);
        driver.quit();

    }
}
