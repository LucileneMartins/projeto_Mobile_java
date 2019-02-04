package Modulos;

import HelperCore.inicializaDriver;
import PageObject.Menu;
import io.appium.java_client.MobileElement;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

import static Helper.MethodBasic.IsMessage;

public class Accordion extends inicializaDriver {

    @Before
    public void iniciaTeste() throws MalformedURLException {
        inicializa();
    }

    @Test
    public void Accordion() throws InterruptedException {

        Menu.selecionaMenu("Accordion");
        Menu.selecionaMenu("Opção 1");

        Thread.sleep(3000);

        MobileElement campoOpcaoAccordion = driver.findElement(By.xpath("//*[@class[1]='android.view.ViewGroup']//[@class='android.widget.TextView']"));
        campoOpcaoAccordion.getText();
        String msgAccordion="Este é a descrição da opção 1";

        System.out.println("Texto = " + campoOpcaoAccordion.getText());
        if( campoOpcaoAccordion.getText().equals(msgAccordion)){
            System.out.println("Passou");
        }

    //    Assert.assertEquals("Este é a descrição da opção 1",IsMessage(By.xpath("//*[@class='android.widget.TextView']//*[@class='android.view.ViewGroup']"),"Este é a descrição da opção 1"));
    }

    @After
    public void finalizaTeste() throws MalformedURLException {
        driver.quit();
    }
}
