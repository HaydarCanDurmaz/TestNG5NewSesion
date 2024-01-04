package MentoringTestNG;

import org.testng.annotations.Test;

public class _01_Enable {
    @Test
    void cLanguage(){
        System.out.println("cLanguage");
    }
    @Test(enabled = false)// true oldugunda calısıcaktır , if false change true is work
    void SeleniumNG(){
        System.out.println("SeleniumNG");
    }
    @Test
    void JavaTNG(){
        System.out.println("JavaTNG");
    }
}
