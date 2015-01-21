
import java.util.List;
import java.util.Scanner;
import sormetsolmuunpeli.sormetsolmuunpeli.Pelaaja;
import sormetsolmuunpeli.sormetsolmuunpeli.Peli;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Pelaaja pelaaja = new Pelaaja("Jäbä", 0);
        Peli peli = new Peli(pelaaja, lukija);

        kaynnista(peli, lukija);

    }

    public static void kaynnista(Peli peli, Scanner lukija) {

        System.out.println("Aakkospelihis: ");
        peli.luoAakkosto();

        kierros(peli, lukija, peli.getAakkosto());

    }

    public static void kierros(Peli peli, Scanner lukija, List aakkosto) {
        String vastaus = peli.getKirjain(aakkosto);
        peli.poistaKirjain(vastaus);
        System.out.println("Paina: " + vastaus);
        String syote = lukija.nextLine();
        while (peli.testaaMerkki(syote, vastaus) == false) {
            System.out.println("Väärin meni los retardos, yritä uudelleen: " + vastaus);
            syote = lukija.nextLine();
        }
        if (aakkosto.isEmpty()) {
            System.out.println("Voitit pelin!");

        } else {
            kierros(peli, lukija, peli.getAakkosto());
        }

    }

}
