package Modulos;

import HelperCore.inicializaDriver;
import PageObject.Menu;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

import static Helper.MethodBasic.IsMessage;
import static Helper.MethodBasic.retornaMensagemBY;

public class aba extends inicializaDriver {


    @Before
    public void iniciaTeste() throws MalformedURLException {
        inicializa();
    }

    @Test
    public void Abas() throws InterruptedException {

        Menu.selecionaMenu("Abas");
        Assert.assertEquals("Este é o conteúdo da Aba 1", IsMessage(By.xpath("//*[@class='android.widget.TextView']"),"Este é o conteúdo da Aba 1"));
        //clicar na aba 2
        Menu.selecionaOpcao(By.xpath("//[@class='android.view.ViewGroup']/[@class='android.widget.TextView']"), "ABA 2");
        Assert.assertEquals("Este é o conteúdo da Aba 2", IsMessage(By.xpath("//*[@class='android.widget.TextView']"),"Este é o conteúdo da Aba 2"));
    }

    @After
    public void finalizaTeste() throws MalformedURLException {
        driver.quit();
    }
}
