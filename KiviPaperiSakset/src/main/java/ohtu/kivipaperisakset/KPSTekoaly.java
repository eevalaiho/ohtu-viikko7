package ohtu.kivipaperisakset;

import java.util.Scanner;

public class KPSTekoaly extends KPS {

    Tekoaly aly = null;

    public KPSTekoaly() {
        aly = new Tekoaly();
    }

    protected String asetaTokanSiirto() {
        String tokanSiirto = aly.annaSiirto();
        System.out.println("Tietokone valitsi: " + tokanSiirto);
        aly.asetaSiirto(tokanSiirto);
        return tokanSiirto;
    }
}