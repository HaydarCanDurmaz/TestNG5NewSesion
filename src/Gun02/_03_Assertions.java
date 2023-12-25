package Gun02;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _03_Assertions {
    @Test
    void EqualsOrnek() {
        String s1 = "Merhaba";
        String s2 = "Merhaba1";

        Assert.assertEquals(s1, s2, "Karşılastırma başarısız oldu");

    }

    @Test
    void notEqualsOrnek() {
        String s1 = "Merhaba";
        String s2 = "Merhaba1";

        Assert.assertNotEquals(s1, s2, "Oluşan ve Beklenen eşit oldu");

    }

    @Test
    void TrueOrnek() {
        int s1 = 41;
        int s2 = 40;

        Assert.assertTrue(s1== s2, "Oluşan ve Beklenen eşit olmadı");

    }
    @Test
    void NullOrnek() {
        String s1 = null;

        Assert.assertNull(s1, "Oluşan Null olmadı");

    }
    @Test
    void FailOrnek() {
        int s1 = 41;

        if(s1==41);
        Assert.fail();// Hata Oluştu

    }
}
