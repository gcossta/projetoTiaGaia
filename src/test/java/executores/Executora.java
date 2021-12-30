package executores;

import robos.GaiaRobo;
import robos.JonasRobo;

public class Executora {
    public static void main(String[] args) {
        GaiaRobo umaGaiaRobo = new GaiaRobo();

        umaGaiaRobo.acessarUmSiteChamado("http://www.juliodelima.com.br/taskit");
        umaGaiaRobo.fazerLogin("Gabriel", "1234");
        umaGaiaRobo.lancarNota();

        GaiaRobo umaOutraGaiaRobo = new GaiaRobo();
        umaOutraGaiaRobo.acessarUmSiteChamado("http://www.google.com.br");
    }
}
