package testRunner;

import base.setup;
import org.testng.Assert;
import screens.calculationScreen;

import java.io.IOException;

public class calculationTestRunner extends setup {

    public void doSum() throws IOException, InterruptedException {

        calculationScreen calculationScreen = new calculationScreen(driver);
        String res = calculationScreen.doSum();
        Assert.assertEquals(res,"12");
    }
}
