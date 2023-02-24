package tech.devinhouse.enumerations;

import static tech.devinhouse.enumerations.PontoCardeal.NORTE;
import static tech.devinhouse.enumerations.PontoCardeal.SUL;

public class Direcao {

    float latitude;
    float longitude;
    PontoCardeal pontoCardeal; // SUL, NORTE, LESTE, OESTE

    public static void main(String[] args) {

        Direcao direcao = new Direcao();

        direcao.pontoCardeal = NORTE;

    }

}
