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
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

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
        frame.setLayout(new GridLayout(2, 1));
        frame.requestFocus();
        JTextField invokettava = new JTextField(peli.getSpell());
        Font font = new Font("Comic Sans", Font.PLAIN, 24);
        invokettava.setFont(font);
        invokettava.setForeground(Color.BLACK);
        invokettava.setHorizontalAlignment(SwingConstants.CENTER);
        invokettava.setEditable(false);
        container.add(invokettava);
        piirtoalusta = new Piirtoalusta(peli);
        frame.addKeyListener(new TapahtumakuuntelijaInvokerpeliin(peli, piirtoalusta));
        container.add(piirtoalusta);

        piirtoalusta.setEnabled(true);

    }

}
