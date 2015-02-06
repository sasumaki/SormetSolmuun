package Sormetsolmuun.Sormetsolmuun;

import Sormetsolmuun.Sormetsolmuun.Pelaaja.Pelaaja;
import Sormetsolmuun.Logiikka.Invokerpelilogiikka.Invokerpeli;
import Sormetsolmuun.Kayttoliittymat.MenuKayttoliittyma.Kayttoliittyma;
import java.util.List;
import java.util.Scanner;
import javax.swing.SwingUtilities;
import Sormetsolmuun.Logiikka.Aakkospelilogiikka.Aakkospeli;
import Sormetsolmuun.Logiikka.Aakkospelilogiikka.Aakkospeli;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Pelaaja pelaaja = new Pelaaja("Pelaaja Pelityyppi");
        Aakkospeli aakkospeli = new Aakkospeli(pelaaja, lukija);
        Invokerpeli invokerpeli = new Invokerpeli(pelaaja, lukija);
        aakkospeli.luoAakkosto();
        invokerpeli.luoSpelliLista();
        
        SwingUtilities.invokeLater(new Kayttoliittyma(aakkospeli, invokerpeli));

    }

}
