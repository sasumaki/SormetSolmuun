package Sormetsolmuun.Kayttoliittymat.MenuKayttoliittyma;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import Sormetsolmuun.Logiikka.Aakkospelilogiikka.Aakkospeli;
import Sormetsolmuun.Logiikka.Invokerpelilogiikka.Invokerpeli;
import Sormetsolmuun.Sormetsolmuun.Pelaaja.Pelaaja;
import java.util.Scanner;

/**
 * Pelin käyttöliittymä
 * @author sasumaki
 */
public class Kayttoliittyma implements Runnable {

    private JFrame frame;
    Aakkospeli aakkospeli;
    Invokerpeli invokerpeli;

    public Kayttoliittyma() {
        
        Scanner lukija = new Scanner(System.in);
        Pelaaja pelaaja = new Pelaaja("Pelaaja Pelityyppi");
        this.aakkospeli = new Aakkospeli(pelaaja, lukija);
        this.invokerpeli = new Invokerpeli(pelaaja, lukija);
        aakkospeli.luoAakkosto();
        invokerpeli.luoSpelliLista();
    }

    @Override
    public void run() {
        frame = new JFrame("Sormet Solmuun");
        frame.setPreferredSize(new Dimension(300, 150));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        luoKomponentitMenu(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void luoKomponentitMenu(Container container) {
        frame.setLayout(new GridLayout(2, 1));
        JButton aakkospelinappi = new JButton("Aakkospeli");
        JButton invokerpelinappi = new JButton("Invoker game");
        TapahtumakuuntelijaMenu kasittelija = new TapahtumakuuntelijaMenu(aakkospeli,invokerpeli, frame, aakkospelinappi, invokerpelinappi);

        container.add(aakkospelinappi);
        container.add(invokerpelinappi);

        aakkospelinappi.addActionListener(kasittelija);
        invokerpelinappi.addActionListener(kasittelija);
        aakkospelinappi.setActionCommand("aakkospeli");
        invokerpelinappi.setActionCommand("invokerpeli");

    }

    public JFrame getFrame() {
        return frame;
    }
}
