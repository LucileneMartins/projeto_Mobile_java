package Modulos;

import HelperCore.inicializaDriver;
import PageObject.Menu;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

import static Helper.MethodBasic.retornaMensagem;
import static io.appium.java_client.touch.offset.ElementOption.element;


public class Cliques extends inicializaDriver
{
    @Before
    public void iniciaTeste() throws MalformedURLException {
        inicializa();
    }

    @Test
    public void CliqueLongo() throws InterruptedException {

       Menu.selecionaMenu("Cliques");
                new TouchAction(driver)
                .longPress(element(driver.findElement(By.xpath("//android.widget.TextView[@text='Clique Longo']")))).perform();
              Assert.assertEquals("Clique Longo",driver.findElement(By.xpath("//android.widget.TextView[2][@text='Clique Longo']")).getText());

    }
    @Test
    public void CliqueDuplo() throws InterruptedException {

        Menu.selecionaMenu("Cliques");
        new TouchAction(driver)
                .press(element(driver.findElement(By.xpath("//android.widget.TextView[@text='Clique duplo']"))))
                .press(element(driver.findElement(By.xpath("//android.widget.TextView[@text='Clique duplo']"))))
                .perform();
        Assert.assertEquals("Clique duplo",driver.findElement(By.xpath("//android.widget.TextView[1][@text='Clique duplo']")).getText());

    }
    @After
    public void finalizaTeste() throws MalformedURLException {
        driver.quit();
    }
}
