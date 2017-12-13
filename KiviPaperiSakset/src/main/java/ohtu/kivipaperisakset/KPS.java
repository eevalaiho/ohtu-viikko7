package ohtu.kivipaperisakset;

import java.util.Scanner;

public abstract class KPS {

    public KPS() {}

    public static KPS luo(String aly) {
        if (aly.equals("a")) {
            return new KPSPelaajaVsPelaaja();
        } else if (aly.equals("b")) {
            return new KPSTekoaly();
        }
        return new KPSParempiTekoaly();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public void pelaa() {

        Tuomari tuomari = new Tuomari();

        while (true) {

            String ekanSiirto = asetaEkanSiirto();
            String tokanSiirto = asetaTokanSiirto();

            if (!onkoOkSiirto(ekanSiirto) || !onkoOkSiirto(tokanSiirto))
                break;

            tuomari.kirjaaSiirto(ekanSiirto, tokanSiirto);
            System.out.println(tuomari);
            System.out.println();

        }

        System.out.println();
        System.out.println("Kiitos!");
        System.out.println(tuomari);
    }

    String asetaEkanSiirto() {
        System.out.print("Ensimmäisen pelaajan siirto: ");
        return scanner.nextLine();
    }

    protected abstract String asetaTokanSiirto();

    protected static boolean onkoOkSiirto(String siirto) {
        return "k".equals(siirto) || "p".equals(siirto) || "s".equals(siirto);
    }
}
