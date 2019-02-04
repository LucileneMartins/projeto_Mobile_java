package PageObject;

import HelperCore.inicializaDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.By;

import java.util.List;

import static io.appium.java_client.touch.offset.PointOption.point;


public class Menu extends inicializaDriver {

    public static void selecionaMenu(String selecaoMenu){

        List<MobileElement> listaMenus = driver.findElements(By.xpath("//*[@class='android.widget.TextView']"));
        for (int i=0; i<listaMenus.size(); i++) {
            String nomeBotao = listaMenus.get(i).getText();
            if(nomeBotao.equals(selecaoMenu)){
                listaMenus.get(i).click();
                break;
            }


        }
    }

    public static void selecionaOpcao(By by, String selecaoCheck){

        List<MobileElement> listaMenus = driver.findElements(by);
        for (int i=0; i<listaMenus.size(); i++) {
            if(listaMenus.get(i).getText().equals(selecaoCheck)){
                listaMenus.get(i).click();
                break;
            }

        }
    }

    public void tap(int x, int y) {
        new TouchAction(driver).tap(point(x, y)).perform();
    }

    public static void selecionaOpcao(String selecaoMenu){

        List<MobileElement> listaMenus = driver.findElements(By.xpath("//*[@class='android.widget.TextView']"));
        for (int i=0; i<listaMenus.size(); i++) {
            String nomeBotao = listaMenus.get(i).getText();
            if(nomeBotao.equals(selecaoMenu)){
                listaMenus.get(i).click();
                break;
            }


        }
    }


}
