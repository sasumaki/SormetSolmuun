package sormetsolmuunpeli.sormetsolmuunpeli;

import Kayttoliittyma.Kayttoliittyma;
import java.util.List;
import java.util.Scanner;
import javax.swing.SwingUtilities;
import sormetsolmuunpeli.sormetsolmuunpeli.Pelaaja;
import sormetsolmuunpeli.sormetsolmuunpeli.Peli;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Pelaaja pelaaja = new Pelaaja("Pelaaja Pelityyppi");
        Peli peli = new Peli(pelaaja, lukija);
        peli.luoAakkosto();
        
        SwingUtilities.invokeLater(new Kayttoliittyma(peli));

    }

}
