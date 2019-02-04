package Modulos;

import HelperCore.inicializaDriver;
import PageObject.Menu;
import io.appium.java_client.MobileBy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import java.net.MalformedURLException;


public class FormularioTeste extends inicializaDriver {



    @Before
    public void InstalacaoAPP() throws MalformedURLException {
       inicializa();
    }


    @Test
    public void Formulario() throws MalformedURLException {

        //Seleciona Formulario

        Menu.selecionaMenu("Formulário");
        driver.findElement(MobileBy.AccessibilityId("nome")).sendKeys("Lucilene");
        driver.findElement(MobileBy.AccessibilityId("console")).click();
        Menu.selecionaOpcao(By.className("android.widget.CheckedTextView"),"PS4");

        //Clicando na CheckBox

        driver.findElement(MobileBy.AccessibilityId("check")).click();

        if(!driver.findElement(MobileBy.AccessibilityId("switch")).isSelected()) {
            driver.findElement(MobileBy.AccessibilityId("switch")).click();
        }

        driver.findElement(By.xpath("//android.widget.TextView[@text='SALVAR DEMORADO']")).click();



    }


    @After
    public void FinalizaTeste() throws MalformedURLException {
        driver.quit();
    }

}
