package henrik;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Tictactoe {

    public static void main(String[] args) {

        Spieler spieler1 = new Spieler();
        Spieler spieler2 = new Spieler();

        SpielFeld feld = new SpielFeld();
        feld.ausgabeKoordinaten();
        Spielstein x = new Spielstein("x");
        Spielstein o = new Spielstein("o");

        System.out.println();

        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println();
            System.out.println("Gib deine Koordinaten für den Spielzug an, von 0 - 2.");

            System.out.println("x Koordinate?");
            int userInputX = input.nextInt();

            System.out.println("y Koordinate");
            int userInputY = input.nextInt();

            System.out.println();
            System.out.println("(" + userInputX + "/" + userInputY + ")");

            feld.setzeSpielstein(new Spielstein("x"), userInputX, userInputY);
            feld.ausgabeKoordinaten();
        }

    }

}

