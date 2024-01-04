package MentoringTestNG;

import org.testng.annotations.Test;

public class _03_Dependency {
    @Test(dependsOnMethods = {"Test13","Test2"})
    void Test1(){
        System.out.println("Test1Case");
    }
    @Test
    void Test2(){
        System.out.println("Test2Case");
    }
    @Test
    void Test13(){
        System.out.println("Test3Case");
    }
}
