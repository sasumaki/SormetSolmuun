/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sormetsolmuun.Kayttoliittymat.InvokerpeliKayttoliittyma;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import Sormetsolmuun.Logiikka.Invokerpelilogiikka.Invokerpeli;
import javax.swing.JTextField;

/**
 * Tapahtumakuuntelija Invokerpeliin.
 *
 * @author sasumaki
 */
public class TapahtumakuuntelijaInvokerpeliin implements KeyListener {

    Invokerpeli peli;
    Component paivitettava;
    JTextField invokettava;
    private int pisteet;
    private long aloitusaika;

    public TapahtumakuuntelijaInvokerpeliin(Invokerpeli peli, Component paivitettava, JTextField invokettava, long aloitusaika) {
        this.peli = peli;
        this.paivitettava = paivitettava;
        this.invokettava = invokettava;
        this.pisteet = 0;
        this.aloitusaika = aloitusaika;
    }

    /**
     * Painaessa q,w tai e peli vaihtaa listan alkioiden arvoja ja painaessa r,
     * peli kutsuu metodia invoke, joka palauttaa listan alkioiden mukaisen
     * spellin.
     */
    @Override
    public void keyPressed(KeyEvent ke) {
        String syotetty = "" + ke.getKeyChar();

        if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
            peli.restart();
            pisteet = 0;
            invokettava.setText(peli.getSpell(""));
            aloitusaika = System.currentTimeMillis();
        }

        if (syotetty.equals("q")) {
            peli.orbinvaihto(1);
        }
        if (syotetty.equals("w")) {
            peli.orbinvaihto(2);
        }
        if (syotetty.equals("e")) {
            peli.orbinvaihto(3);
        }
        if (syotetty.equals("r")) {
            if (invokettava.getText().equals(peli.invoke().name())) {
                pisteet++;
                if (pisteet == 10) {
                    long lopetusaika = System.currentTimeMillis();
                    long sekunnit = ((lopetusaika - aloitusaika) / 1000) % 60;
                    long millisekunnit = (lopetusaika - aloitusaika) % 1000;
                    invokettava.setText("You Wonnered!" + "\n" + sekunnit + ":" + millisekunnit);

                } else {
                    invokettava.setText(peli.getSpell(invokettava.getText().toString()));
                }
            } else {
                if (invokettava.getText().startsWith("You Wonnered!")) {

                } else {
                    invokettava.setText("This magic...disappoints");
                }

            }

        }
        paivitettava.repaint();
    }

    @Override
    public void keyReleased(KeyEvent ke) {
    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }

}
