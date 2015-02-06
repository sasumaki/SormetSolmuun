/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sormetsolmuun.Kayttoliittymat.AakkospeliKayttoliittyma;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import Sormetsolmuun.Logiikka.Aakkospelilogiikka.Aakkospeli;

/**
 * Graafinen käyttöliittymä aakkospeliin
 * @author sasumaki
 */
public class AakkospeliGUI {

    private JFrame frame;
    private Aakkospeli peli;

    public AakkospeliGUI(Aakkospeli peli, JFrame frame) {

        this.peli = peli;
        this.frame = frame;
        
        luoKomponentitAakkospeliin(frame);
        frame.pack();
        frame.setVisible(true);

    }

    private void luoKomponentitAakkospeliin(Container container) {
        frame.setLayout(new GridLayout(1, 1));
        JTextField painettavakirjain = new JTextField(peli.getKirjain(peli.getAakkosto()).toUpperCase());
        Font font = new Font("Helvetica", Font.PLAIN, 24);
        painettavakirjain.setFont(font);
        painettavakirjain.setForeground(Color.BLACK);
        painettavakirjain.setHorizontalAlignment(SwingConstants.CENTER);

        container.add(painettavakirjain);
        painettavakirjain.setEditable(false);

        TapahtumakuuntelijaAakkospeliin kasittelija = new TapahtumakuuntelijaAakkospeliin(peli, painettavakirjain);

        painettavakirjain.addKeyListener(kasittelija);
    }

}
