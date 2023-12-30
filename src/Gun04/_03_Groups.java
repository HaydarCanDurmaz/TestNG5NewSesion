package Gun04;

import org.testng.annotations.Test;

public class _03_Groups {
    @Test(groups = {"SmokeTest"})
    void Test1(){System.out.println("Test1");}// Smoke
    @Test(groups = {"Regression"})
    void Test2(){System.out.println("Test2");}// Regression
    @Test(groups = {"SmokeTest"})
    void Test3(){System.out.println("Test3");}//Smoke
    @Test(groups = {"Regression"})
    void Test4(){System.out.println("Test4");}// Regression
    @Test(groups = {"SmokeTest"})
    void Test5(){System.out.println("Test5");}
    @Test(groups = {"Regression"})
    void Test6(){System.out.println("Test6");}
    @Test(groups = {"Regression"})
    void Test7(){System.out.println("Test7");}
    @Test(groups = {"SmokeTest"})
    void Test8(){System.out.println("Test8");}

}
