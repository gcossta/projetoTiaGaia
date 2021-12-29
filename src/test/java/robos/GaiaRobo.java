package robos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

//Classe:
public class GaiaRobo {

    //Propriedade: modificador + tipo + nome da propriedade
    private ChromeDriver julioDriver;

    //Construtor: modificador + nome da classe + ()
    public GaiaRobo(){
        //O que está aqui será executado no new
        WebDriverManager.chromedriver().setup();
        julioDriver = new ChromeDriver();
    }

    //Método: modificador + tipo de retorno + nome do método + ()
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
