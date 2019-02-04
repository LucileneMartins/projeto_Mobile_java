package Modulos;

import Helper.MethodBasic;
import HelperCore.inicializaDriver;
import PageObject.Menu;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;

import static Helper.MethodBasic.retornaMensagem;

public class Alert extends inicializaDriver {

    @Before
    public void iniciaTeste() throws MalformedURLException {
        inicializa();
    }

    @Test
    public void Alert() throws InterruptedException {
       //Thread.sleep(3000); driver.findElement(By.xpath("//*[@text='Alertas']")).click();

        Menu.selecionaMenu("Alertas");
        Menu.selecionaMenu("ALERTA CONFIRM");
        Assert.assertTrue("Confirma a operação?", retornaMensagem("Confirma a operação?"));
        MethodBasic.clicaBotaoAlert("CONFIRMAR");
        Assert.assertTrue("Confirmado", retornaMensagem("Confirmado"));
        MethodBasic.clicaBotaoAlert("SAIR");

    }

    @After
    public void finalizaTeste() throws MalformedURLException {
        driver.quit();
    }
}
