package Modulos;

import java.net.MalformedURLException;
import java.net.URL;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.remote.DesiredCapabilities;

public class appCalculadora {


    private AndroidDriver driver;

    @Before
    public void setUp() throws MalformedURLException {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("deviceName", "emulator-5554");
        desiredCapabilities.setCapability("automationName", "uiautomator2");
        desiredCapabilities.setCapability("appPackage", "com.android.calculator2");
        desiredCapabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
        desiredCapabilities.setCapability(MobileCapabilityType.APP,"C:\\Users\\Stefanini\\IdeaProjects\\ProjetoMinhaOi_V19_oficial_semHash\\ProjetoMinhaOi_V19_oficial_semHash\\testeMobile\\src\\main\\resources");

        URL remoteUrl = new URL("http://localhost:4723/wd/hub");

        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
    }

    @Test
    public void sampleTest() {
        MobileElement el6 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_2");
        el6.click();
        MobileElement el7 = (MobileElement) driver.findElementByAccessibilityId("plus");
        el7.click();
        MobileElement el8 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_2");
        el8.click();
        MobileElement el9 = (MobileElement) driver.findElementById("com.android.calculator2:id/result");
        el9.click();

        if (el9.getText().equals("4")){
            System.out.println("Teste Passou!");
        }
        else{
            System.out.println("Falhou!");
        }
    }

    @After
    public void tearDown() {
        driver.quit();
    }

}
