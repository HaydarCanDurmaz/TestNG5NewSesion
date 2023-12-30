package Gun03;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _01_Dependency {
    @Test
    void StartCar(){
        System.out.println("StartCar");
      //  Assert.fail();
    }
    @Test(dependsOnMethods ={"StartCar"} )
    void DriveCar(){
        System.out.println("DriveCar");
    }
    @Test(dependsOnMethods = {"DriveCar","StartCar"})
    void ParkCar(){
        System.out.println("ParkCar");
    }
    @Test(dependsOnMethods = {"ParkCar"},alwaysRun = true)
    void StopCar(){
        System.out.println("StopCar");
    }
}
// aynı seviyedeki testleri için priority verilebilir.
// bağımlı testler, direk metodundan çalıştırdığınızda bağımlı olduğu metod zincirinde
// 1 üste kadar ototmatik çağırıp çalışabilir.