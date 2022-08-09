package henrik;

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
        System.out.println("Gib deine Koordinaten für den Spielzug an.");

        System.out.println("x Koordinate?");
        int userInputX = input.nextInt();

        System.out.println("y Koordinate");
        int userInputY = input.nextInt();


        System.out.println("(" + userInputX + "/" + userInputY + ")");

        feld.setzeSpielstein(new Spielstein("x"), userInputX, userInputY);
        feld.ausgabeKoordinaten();
    }

}

