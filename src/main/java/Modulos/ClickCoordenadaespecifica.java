package Modulos;

import HelperCore.inicializaDriver;
import PageObject.Menu;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

import static io.appium.java_client.touch.offset.PointOption.point;

public class ClickCoordenadaespecifica extends inicializaDriver
{

    @Before
    public void iniciaTeste() throws MalformedURLException {
        inicializa();
    }

    @Test
    public void CoordenacaEspecifica() throws InterruptedException {

        Menu.selecionaMenu("Alertas");
        Menu.selecionaMenu("ALERTA SIMPLES");
        int x=457;
        int y=431;

        Thread.sleep(2000);
        new TouchAction(driver).tap(point(x, y)).perform();

    }

    @After
    public void finalizaTeste() throws MalformedURLException {
        driver.quit();
    }
}
