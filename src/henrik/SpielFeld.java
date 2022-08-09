package henrik;

public class SpielFeld {

    int koordinaten[][] = new int[3][3];

    public void ausgabeKoordinaten() {

        for (int x = 0; x < koordinaten.length; x++) {
            System.out.println();

            for (int y = 0; y < koordinaten.length; y++)
            System.out.print(koordinaten[x][y]);
        }


    }
}