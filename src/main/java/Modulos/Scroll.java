package Modulos;

import Helper.MethodBasic;
import HelperCore.inicializaDriver;
import PageObject.Menu;
import io.appium.java_client.TouchAction;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

import static io.appium.java_client.touch.offset.ElementOption.element;

public class Scroll extends inicializaDriver {

    @Before
    public void iniciaTeste() throws MalformedURLException {
        inicializa();
    }


    @Test
    public void ScrollDown() throws InterruptedException {


        Menu.selecionaMenu("Cliques");
        new TouchAction(driver)
                .press(element(driver.findElement(By.xpath("//android.widget.TextView[@text='Clique duplo']"))))
                .perform();
        Assert.assertEquals("Clique duplo",driver.findElement(By.xpath("//android.widget.TextView[1][@text='Clique duplo']")).getText());

    }

    @Test
    public void ScrollUP() throws InterruptedException {

        MethodBasic.scroll(0.9,0.1);
        Menu.selecionaMenu("Opção bem escondida");

    }
    @After
    public void finalizaTeste() throws MalformedURLException {
        driver.quit();
    }
}
