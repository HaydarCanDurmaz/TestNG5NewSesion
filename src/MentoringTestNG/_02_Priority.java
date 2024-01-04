package MentoringTestNG;

import org.testng.annotations.Test;

public class _02_Priority {
    @Test
    void apple(){// priority önceleliklendimre
        System.out.println("apple");
    }
    @Test(priority = 2)
    void mango(){
        System.out.println("mango");
    }
    @Test(priority = 1)
    void JavaTNG(){
        System.out.println("JavaTNG");
    }
}

