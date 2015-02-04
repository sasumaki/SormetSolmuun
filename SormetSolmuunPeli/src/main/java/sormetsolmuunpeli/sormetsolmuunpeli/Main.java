package sormetsolmuunpeli.sormetsolmuunpeli;

import Kayttoliittyma.Kayttoliittyma;
import java.util.List;
import java.util.Scanner;
import javax.swing.SwingUtilities;
import sormetsolmuunpeli.sormetsolmuunpeli.Pelaaja;
import sormetsolmuunpeli.sormetsolmuunpeli.Aakkospeli;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Pelaaja pelaaja = new Pelaaja("Pelaaja Pelityyppi");
        Aakkospeli aakkospeli = new Aakkospeli(pelaaja, lukija);
        Invokerpeli invokerpeli = new Invokerpeli(pelaaja, lukija);
        aakkospeli.luoAakkosto();
        
        SwingUtilities.invokeLater(new Kayttoliittyma(aakkospeli, invokerpeli));

    }

}
