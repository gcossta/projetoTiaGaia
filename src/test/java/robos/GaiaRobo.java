package robos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class GaiaRobo {
    public void abrirChome() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver julioDriver = new ChromeDriver();

        julioDriver.get("http://juliodelima.com.br/taskit");
    }

    public void fazerLogin() {
        System.out.println("Vou fazer login.");
    }

    public void lancarNota() {
        System.out.println("Vou lançar nota.");
    }
}
