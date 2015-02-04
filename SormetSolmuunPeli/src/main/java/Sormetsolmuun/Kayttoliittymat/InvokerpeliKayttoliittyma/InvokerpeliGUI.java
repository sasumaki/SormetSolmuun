/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sormetsolmuun.Kayttoliittymat.InvokerpeliKayttoliittyma;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JFrame;
import Sormetsolmuun.Logiikka.Invokerpelilogiikka.Invokerpeli;

/**
 *
 * @author sasumaki
 */
public class InvokerpeliGUI {

    private JFrame frame;
    private Invokerpeli peli;
    private Piirtoalusta piirtoalusta;

    public InvokerpeliGUI(Invokerpeli peli, JFrame frame) {

        this.peli = peli;
        this.frame = frame;

        luoKomponentitInvokerpeliin(frame);
        frame.pack();
        frame.setVisible(true);

    }

    public void luoKomponentitInvokerpeliin(Container container) {
        frame.setLayout(new GridLayout(1, 1));

        piirtoalusta = new Piirtoalusta(peli);
        frame.addKeyListener(new TapahtumakuuntelijaInvokerpeliin(peli, piirtoalusta));

        container.add(piirtoalusta);

        piirtoalusta.setEnabled(true);

    }

}
