package henrik;

public class Tictactoe {

    public static void main(String[] args) {

        Spieler spieler1 = new Spieler();
        Spieler spieler2 = new Spieler();

        SpielFeld feld = new SpielFeld();
        feld.ausgabeKoordinaten();
        Spielstein x = new Spielstein();
        Spielstein o = new Spielstein();
        feld.setzeSpielstein(x,1,1);
        feld.ausgabeKoordinaten();


    }

}

