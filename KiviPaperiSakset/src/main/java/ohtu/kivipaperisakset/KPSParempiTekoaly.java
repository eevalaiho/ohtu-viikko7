package ohtu.kivipaperisakset;

import java.util.Scanner;

import java.util.Scanner;

// Kivi-Paperi-Sakset, jossa voidaan valita pelataanko vastustajaa
// vastaan vai ei
public class KPSParempiTekoaly extends KPSTekoaly {

    Tekoaly aly = null;

    public KPSParempiTekoaly() {
        aly = new TekoalyParannettu(20);
    }
}
