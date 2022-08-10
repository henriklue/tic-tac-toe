package henrik;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Tictactoe {

    private Spieler aktiverSpieler;

    public static void main(String[] args) {

        Spielstein x = new Spielstein("x");
        Spielstein o = new Spielstein("o");

        Spieler spieler1 = new Spieler(x);
        Spieler spieler2 = new Spieler(o);

        SpielFeld feld = new SpielFeld();
        feld.ausgabeKoordinaten();


        System.out.println();

        Scanner input = new Scanner(System.in);

        Tictactoe aktuellesSpiel = new Tictactoe();

        while (true) {

            aktuellesSpiel.wechsleAktivenSpieler(spieler1, spieler2);

            System.out.println();
            System.out.println("Gib deine Koordinaten für den Spielzug an, von 0 - 2.");

            System.out.println("x Koordinate?");
            int userInputX = input.nextInt();

            System.out.println("y Koordinate");
            int userInputY = input.nextInt();

            System.out.println();
            System.out.println("(" + userInputX + "/" + userInputY + ")");

            feld.setzeSpielstein(spieler1.getSpielstein(), userInputX, userInputY);
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
}



