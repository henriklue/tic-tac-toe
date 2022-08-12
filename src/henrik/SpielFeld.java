package henrik;

public class SpielFeld {

    private final Spielstein[][] koordinaten = new Spielstein[3][3];

    public void ausgabeKoordinaten() {

        for (Spielstein[] spielsteins : koordinaten) {
            System.out.println();

            for (int y = 0; y < koordinaten.length; y++) {
                Spielstein spielsteinAnPositionxy = spielsteins[y];
                if (spielsteinAnPositionxy == null)
                    System.out.print(".");
                else
                    System.out.print(spielsteins[y]);

            }
        }


    }

    public void setzeSpielstein(Spielstein spielstein, int x, int y) {

        koordinaten[x][y] = spielstein;
    }

    public Spielstein[][] getKoordinaten() {
        return koordinaten;
    }
}
