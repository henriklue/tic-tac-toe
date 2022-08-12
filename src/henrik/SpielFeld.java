package henrik;

public class SpielFeld {

    private final Spielstein[][] koordinaten = new Spielstein[3][3];

    public void ausgabeKoordinaten() {

        for (int y = 0; y <= 2; y++) {
            System.out.println();

            for (int x = 0; x <= 2; x++) {
                Spielstein spielsteinAnPositionxy = koordinaten[x][y];
                if (spielsteinAnPositionxy == null)
                    System.out.print(".");
                else
                    System.out.print(koordinaten[x][y]);

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