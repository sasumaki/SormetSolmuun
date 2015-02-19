/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sormetsolmuun.Kayttoliittymat.AakkospeliKayttoliittyma;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JTextField;
import Sormetsolmuun.Logiikka.Aakkospelilogiikka.Aakkospeli;
import javax.swing.Timer;

/**
 * Tapahtumakuuntelija aakkospeliin.
 *
 * @author sasumaki
 */
public class TapahtumakuuntelijaAakkospeliin implements KeyListener {

    private JTextField painettavakirjain;
    private long alotusaika;
    private Aakkospeli peli;

    /**
     * konstruktori
     *
     * @param peli
     * @param painettavakirjain
     */
    public TapahtumakuuntelijaAakkospeliin(Aakkospeli peli, JTextField painettavakirjain, long alotusaika) {
        this.painettavakirjain = painettavakirjain;
        this.alotusaika = alotusaika;
        this.peli = peli;

    }

    /**
     * Painaessa ruudulla näkyvää näppäintä, peli antaa sinulle uuden
     * painettavan ja poistaa painetun painettavien listalta.
     *
     * @param ke
     */
    @Override
    public void keyPressed(KeyEvent ke) {
        String painettava = painettavakirjain.getText();
        String syotetty = "" + ke.getKeyChar();

        if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
            peli.luoAakkosto();
            peli.nollaaVirheet();
            painettavakirjain.setText(peli.getKirjain(peli.getAakkosto()).toUpperCase());
            alotusaika = System.currentTimeMillis();
        }
        if (peli.testaaMerkki(syotetty, painettava) == true) {
            peli.poistaKirjain(painettavakirjain.getText().toLowerCase());
            if (peli.getAakkosto().isEmpty()) {
                long lopetusaika = System.currentTimeMillis();
                long sekunnit = ((lopetusaika - alotusaika) / 1000) % 60;
                long millisekunnit = (lopetusaika-alotusaika) %1000;
                painettavakirjain.setText("Voitit Pelin!" + "\n" + sekunnit + ":" + millisekunnit);

            } else {

                painettavakirjain.setText(peli.getKirjain(peli.getAakkosto()).toUpperCase());

            }
        } else {
            peli.virheidenLisays();
            if (peli.liikaaVirheita() == true) {
                painettavakirjain.setText("Hävisit pelin!");
                painettavakirjain.setEnabled(true);
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {
    }

    @Override
    public void keyTyped(KeyEvent ke) {

    }

}
