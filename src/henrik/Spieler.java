package henrik;

public class Spieler {

    private final Spielstein spielstein;
    private final String nameSpieler;

    public Spieler(Spielstein spielstein, String nameSpieler) {
        this.spielstein = spielstein;
        this.nameSpieler = nameSpieler;
    }

    public Spielstein getSpielstein() {
        return spielstein;
    }

    @Override
    public String toString() {
        return nameSpieler;
    }
}
