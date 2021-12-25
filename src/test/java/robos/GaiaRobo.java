package robos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class GaiaRobo {

    public ChromeDriver julioDriver;

    public void abrirChome() {
        WebDriverManager.chromedriver().setup();
        julioDriver = new ChromeDriver();
    }

    public void acessarUmSite() {
        julioDriver.get("http://juliodelima.com.br/taskit");
    }

    public void fazerLogin() {
        System.out.println("Vou fazer login.");
    }

    public void lancarNota() {
        System.out.println("Vou lançar nota.");
    }
}
