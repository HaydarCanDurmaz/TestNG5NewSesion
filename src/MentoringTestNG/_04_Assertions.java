package MentoringTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _04_Assertions {
    @Test
    void TestCase(){
        String text1 = "Java is a programa's Language";
        String text2 = "Java is a programa's Language";

        Assert.assertTrue(text1==text2);

    }
    @Test
    void TestCase1() {
        String s1 = "Java";
        String s2 = new String("Jav1a");

        Assert.assertEquals(s1 , s2,"icerik aynı degil");
    }
}
