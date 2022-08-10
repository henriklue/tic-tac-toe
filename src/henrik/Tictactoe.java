package henrik;

import java.util.Scanner;

public class Tictactoe {

    private Spieler aktiverSpieler;

    public static void main(String[] args) {

        Spielstein x = new Spielstein("x");
        Spielstein o = new Spielstein("o");

        Scanner input = new Scanner(System.in);

        System.out.println("Spieler 1 wähle deinen Namen");
        Spieler spieler1 = new Spieler(x, input.nextLine());
        System.out.println("Spieler 2 wähle deinen Namen");
        Spieler spieler2 = new Spieler(o, input.nextLine());

        System.out.println();


        SpielFeld feld = new SpielFeld();

        Tictactoe aktuellesSpiel = new Tictactoe();

        while (!aktuellesSpiel.feldVollCheck(feld) && !aktuellesSpiel.hatSpielerGewonnenCheck()) {

            aktuellesSpiel.wechsleAktivenSpieler(spieler1, spieler2);

            System.out.println();
            System.out.println(aktuellesSpiel.aktiverSpieler + " " + "Gib deine Koordinaten für den Spielzug an, von 0 - 2.");

            System.out.println("x Koordinate?");
            int userInputX = input.nextInt();

            System.out.println("y Koordinate");
            int userInputY = input.nextInt();

            System.out.println("(" + userInputX + "/" + userInputY + ")");
            Spielstein spielstein = aktuellesSpiel.aktiverSpieler.getSpielstein();
            System.out.println(aktuellesSpiel.aktiverSpieler + " " + "ist am Zug");
            feld.setzeSpielstein(spielstein, userInputX, userInputY);
            feld.ausgabeKoordinaten();

            System.out.println();

        }


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

    public boolean feldVollCheck(SpielFeld feld) {

        Spielstein[][] koordinaten = feld.getKoordinaten();

        for (int x = 0; x < koordinaten.length; x++) {

            for (int y = 0; y < koordinaten.length; y++) {
                Spielstein spielsteinAnPositionxy = koordinaten[x][y];

                if (spielsteinAnPositionxy == null) {

                    return false;
                }
            }

        }

        return true;
    }

    public boolean hatSpielerGewonnenCheck() {

        return false;
    }

}


