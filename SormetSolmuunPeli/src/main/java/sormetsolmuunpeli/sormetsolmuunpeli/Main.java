package sormetsolmuunpeli.sormetsolmuunpeli;


import java.util.List;
import java.util.Scanner;
import sormetsolmuunpeli.sormetsolmuunpeli.Pelaaja;
import sormetsolmuunpeli.sormetsolmuunpeli.Peli;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Pelaaja pelaaja = new Pelaaja("Pelaaja Pelityyppi");
        Peli peli = new Peli(pelaaja, lukija);

        kaynnista(peli, lukija);

    }

    public static void kaynnista(Peli peli, Scanner lukija) {

        peli.kaynnistys(lukija);

    }

}
