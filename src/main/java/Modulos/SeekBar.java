package Modulos;

import HelperCore.inicializaDriver;
import PageObject.Menu;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;

public class SeekBar extends inicializaDriver
{

    @Before
    public void iniciaTeste() throws MalformedURLException {
        inicializa();
    }

    @Test
    public void seekBar() throws InterruptedException {

        Menu.selecionaMenu("Formulário");

        //TODO -FAZER!!!

    }

    @After
    public void finalizaTeste() throws MalformedURLException {
        driver.quit();
    }
}
