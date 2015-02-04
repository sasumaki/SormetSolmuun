package Sormetsolmuun.Sormetsolmuun;

public class Pelaaja {

    private String nimi;
    private int pisteet;

    public Pelaaja(String nimi) {
        this.nimi = nimi;
        this.pisteet = 0;
    }

    public String getNimi() {
        return nimi;
    }

    public int getPisteet() {
        return pisteet;
    }

    public void lisaaPisteet(int pistemaara) {
        if (pistemaara > 0) {
            pisteet += pistemaara;
        }
    }

    public void nollaaPisteet() {
        pisteet = 0;
    }
}
