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

/**
 *
 * @author sasumaki
 */
public class TapahtumakuuntelijaInvokerpeliin implements KeyListener {

    Invokerpeli peli;
    Component paivitettava;

    public TapahtumakuuntelijaInvokerpeliin(Invokerpeli peli, Component paivitettava) {
        this.peli = peli;
        this.paivitettava = paivitettava;
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        String syotetty = "" + ke.getKeyChar();
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
            peli.invoke();
        }
        paivitettava.repaint();
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
