package henrik;

import java.util.Scanner;

public class Tictactoe {

    private Spieler aktiverSpieler;
    static final String spielStein1 = "x";
    static final String spielStein2 = "o";

    public static void main(String[] args) {

        Spielstein x = new Spielstein(spielStein1);
        Spielstein o = new Spielstein(spielStein2);

        Scanner input = new Scanner(System.in);

        System.out.println("Spieler 1 wähle deinen Namen");
        Spieler spieler1 = new Spieler(x, input.nextLine());
        System.out.println("Spieler 2 wähle deinen Namen");
        Spieler spieler2 = new Spieler(o, input.nextLine());

        System.out.println();

        SpielFeld feld = new SpielFeld();

        Tictactoe aktuellesSpiel = new Tictactoe();

        while (!aktuellesSpiel.gibtEsDreiGleiche(feld) && !aktuellesSpiel.istDasFeldVoll(feld)) {

            aktuellesSpiel.wechsleAktivenSpieler(spieler1, spieler2);

            System.out.println();
            System.out.println(aktuellesSpiel.aktiverSpieler + " gib deine Koordinaten für den Spielzug an, von 0 - 2.");

            System.out.println("x-Koordinate?");
            int userInputX = input.nextInt();

            System.out.println("y-Koordinate");
            int userInputY = input.nextInt();

            while (aktuellesSpiel.liegtHierSchonEinStein(feld, userInputX, userInputY)) {

                System.out.println("Hier liegt bereits ein Stein, wähle eine andere Position");

                System.out.println("x-Koordinate?");
                userInputX = input.nextInt();

                System.out.println("y-Koordinate");
                userInputY = input.nextInt();

            }

            System.out.println("(" + userInputX + "/" + userInputY + ")");
            Spielstein spielstein = aktuellesSpiel.aktiverSpieler.getSpielstein();
            feld.setzeSpielstein(spielstein, userInputX, userInputY);
            feld.ausgabeKoordinaten();

            System.out.println();


        }

        System.out.println();

        if (aktuellesSpiel.gibtEsDreiGleiche(feld)) {

            System.out.println(aktuellesSpiel.aktiverSpieler + " hat das Spiel gewonnen!");
        }else {
            System.out.println("Das Spiel endet mit einem Unentschieden");
        }


    }

    public boolean gibtEsDreiGleiche(SpielFeld feld) {

        return

                sindDreiSteineGleich(feld, 0, 0, 0, 1, 0, 2) ||
                        sindDreiSteineGleich(feld, 1, 0, 1, 1, 1, 2) ||
                        sindDreiSteineGleich(feld, 2, 0, 2, 1, 2, 2) ||
                        sindDreiSteineGleich(feld, 0, 0, 1, 0, 2, 0) ||
                        sindDreiSteineGleich(feld, 0, 1, 1, 1, 2, 1) ||
                        sindDreiSteineGleich(feld, 0, 2, 1, 2, 2, 2) ||
                        sindDreiSteineGleich(feld, 0, 0, 1, 1, 2, 2) ||
                        sindDreiSteineGleich(feld, 0, 2, 1, 1, 2, 0);


    }

    private void wechsleAktivenSpieler(Spieler spieler1, Spieler spieler2) {

        if (aktiverSpieler == null) {

            aktiverSpieler = spieler1;

        } else if (aktiverSpieler == spieler1) {

            aktiverSpieler = spieler2;

        } else {

            aktiverSpieler = spieler1;

        }
    }

    public boolean istDasFeldVoll(SpielFeld feld) {

        Spielstein[][] koordinaten = feld.getKoordinaten();

        for (Spielstein[] spielstein : koordinaten) {

            for (int y = 0; y < koordinaten.length; y++) {
                Spielstein spielsteinAnPositionxy = spielstein[y];

                if (spielsteinAnPositionxy == null) {

                    return false;
                }
            }

        }

        System.out.println();

        return true;
    }

    public boolean sindDreiSteineGleich(SpielFeld feld, int x1, int y1, int x2, int y2, int x3, int y3) {

        Spielstein[][] koordinaten = feld.getKoordinaten();

        Spielstein spielstein1 = koordinaten[x1][y1];
        Spielstein spielstein2 = koordinaten[x2][y2];
        Spielstein spielstein3 = koordinaten[x3][y3];

        if (spielstein1 == null) {
            return false;
        }
        if (spielstein2 == null) {
            return false;
        }
        if (spielstein3 == null) {
            return false;
        }

        return spielstein1.getStein().equals(spielstein2.getStein()) &&
                spielstein2.getStein().equals(spielstein3.getStein());


    }

    public boolean liegtHierSchonEinStein(SpielFeld feld, int x1, int y1) {

        Spielstein[][] koordinaten = feld.getKoordinaten();

        Spielstein spielstein1 = koordinaten[x1][y1];

        return spielstein1 != null;
    }

}