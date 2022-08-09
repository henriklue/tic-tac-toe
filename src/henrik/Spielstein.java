package henrik;

public class Spielstein {

    String stein;

    public Spielstein(String stein){
        this.stein = stein;
    }

    @Override
    public String toString() {
        return stein;
    }
}
