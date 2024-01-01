package Gun05;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _03_DataProvider_CokluBoyut {
    @Test(dataProvider = "userData")
    void UsernameTest(String username , String password){
        System.out.println("user = " + username +" "+password);
    }
    @DataProvider
    public Object[][] userData(){
        Object[][]data={
                {"HaydarCan","1281"},
                {"Zorbey","1453"},
                {"Kayhan","1881"},
                {"Ayhna","1281"}


        };
        return data;
    }
}
