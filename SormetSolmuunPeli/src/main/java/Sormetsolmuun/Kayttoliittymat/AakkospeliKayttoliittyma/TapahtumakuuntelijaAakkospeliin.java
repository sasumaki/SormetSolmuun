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

/**
 *
 * @author sasumaki
 */
public class TapahtumakuuntelijaAakkospeliin implements KeyListener {

    private JTextField painettavakirjain;

    private Aakkospeli peli;

    public TapahtumakuuntelijaAakkospeliin(Aakkospeli peli, JTextField painettavakirjain) {
        this.painettavakirjain = painettavakirjain;

        this.peli = peli;

    }

    @Override
    public void keyPressed(KeyEvent ke) {
        String painettava = painettavakirjain.getText();
        String syotetty = "" + ke.getKeyChar();

        if (peli.testaaMerkki(syotetty, painettava) == true) {
            peli.poistaKirjain(painettavakirjain.getText().toLowerCase());
            if (peli.getAakkosto().isEmpty()) {
                painettavakirjain.setText("Voitit Pelin!");

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
