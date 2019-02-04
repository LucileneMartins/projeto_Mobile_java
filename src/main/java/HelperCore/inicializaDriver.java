package HelperCore;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class inicializaDriver {


        public static AndroidDriver<MobileElement> driver = null;

        public static void inicializa () throws MalformedURLException {
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability("platformName", "Android");
            desiredCapabilities.setCapability("deviceName", "emulator-5554");
            desiredCapabilities.setCapability("automationName", "uiautomator2");
            desiredCapabilities.setCapability("appPackage", "com.ctappium");
            desiredCapabilities.setCapability("appActivity", "com.ctappium.MainActivity");
            //desiredCapabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\Stefanini\\IdeaProjects\\ProjetoMinhaOi_V19_oficial_semHash\\ProjetoMinhaOi_V19_oficial_semHash\\testeMobile\\src\\main\\resources\\CTAppium-1-1.apk");

            try {
                driver = new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);
            }
            catch(Exception e){
                e.printStackTrace();
            }
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        }
}
