package henrik;

public class Tictactoe {

    public static void main(String[] args) {

        Spieler spieler1 = new Spieler();
        Spieler spieler2 = new Spieler();

        SpielFeld feld = new SpielFeld();
        feld.ausgabeKoordinaten();
        Spielstein x = new Spielstein("x");
        Spielstein o = new Spielstein("o");
        feld.setzeSpielstein(x,1,1);
        feld.ausgabeKoordinaten();


    }

}

