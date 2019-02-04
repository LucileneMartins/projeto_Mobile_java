package Helper;

import HelperCore.inicializaDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import java.time.Duration;
import java.util.List;


public class MethodBasic extends inicializaDriver {

    public static boolean retornaMensagem(String texto){
        boolean result = false;
        String obterTexto = driver.findElement(By.id("android:id/message")).getText();
        if(obterTexto.equals(texto)){
            result = true;
        }
        return result;
    }

    public static void clicaBotaoAlert(String texto){
       List<MobileElement> nomeBotao = driver.findElements(By.xpath("//*[@class='android.widget.Button']"));
       for(int i = 0; i< nomeBotao.size();i++ ) {
           String botao =nomeBotao.get(i).getText();
        if(botao.equals(texto)){
            nomeBotao.get(i).click();
            break;
        }
       }
    }

    public static boolean retornaMensagemBY(By by,String texto){
        boolean result = false;
        String obterTexto = driver.findElement(by).getText();
        if(obterTexto.equals(texto)){
            result = true;
        }
        return result;
    }

    public static boolean IsMessage(By by,String texto){
        boolean result = false;
        List<MobileElement> obterTexto = driver.findElements(by);
        for(int i=0; i< obterTexto.size();i++){
            String msg = obterTexto.get(i).getText();
            if(msg.equals(texto)){
                result = true;
                break;
            }
        }
        return result;
    }

    public static void scroll(double posicaoInicial, double posicaoFinal){

        Dimension tamanho = driver.manage().window().getSize();

        int tamanhoX = tamanho.width/2;
        int tamanhoYInicial = (int)(tamanho.height * posicaoInicial);
        int tamanhoYFinal = (int)(tamanho.height * posicaoFinal);

        new TouchAction(driver)
                .press(PointOption.point(tamanhoX,tamanhoYInicial))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(4)))
                .moveTo(PointOption.point(tamanhoX,tamanhoYFinal))
                .release()
                .perform();

    }

}
