package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

import static base.setup.PACKAGE_ID;

public class calculationScreen {
    @FindBy(id=PACKAGE_ID+":id/digit_1")
    AndroidElement digit_1;
    @FindBy(id=PACKAGE_ID+":id/digit_2")
    AndroidElement digit_2;
    @FindBy(id=PACKAGE_ID+":id/digit_3")
    AndroidElement digit_3;
    @FindBy(id=PACKAGE_ID+":id/digit_4")
    AndroidElement digit_4;
    @FindBy(id=PACKAGE_ID+":id/digit_5")
    AndroidElement digit_5;
    @FindBy(id=PACKAGE_ID+":id/digit_6")
    AndroidElement digit_6;
    @FindBy(id=PACKAGE_ID+":id/digit_7")
    AndroidElement digit_7;
    @FindBy(id=PACKAGE_ID+":id/digit_8")
    AndroidElement digit_8;
    @FindBy(id=PACKAGE_ID+":id/digit_9")
    AndroidElement digit_9;
    @FindBy(id=PACKAGE_ID+":id/digit_0")
    AndroidElement digit_0;
    @FindBy(id=PACKAGE_ID+":id/op_add")
    AndroidElement btnPlus;
    @FindBy(id=PACKAGE_ID+":id/eq")
    AndroidElement btnEqual;
    @FindBy(id=PACKAGE_ID+":id/result_final")
    AndroidElement lblResult;

    public calculationScreen (AndroidDriver driver) throws IOException, InterruptedException
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public String doSum() throws InterruptedException {
        Thread.sleep(1000);
        digit_5.click();
        Thread.sleep(1000);
        btnPlus.click();
        Thread.sleep(1000);
        digit_7.click();
        Thread.sleep(1000);
        digit_1.click();
        Thread.sleep(1000);
        btnEqual.click();
        return lblResult.getText();
    }

}
