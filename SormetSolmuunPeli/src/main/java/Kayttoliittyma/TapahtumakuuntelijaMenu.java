/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kayttoliittyma;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import sormetsolmuunpeli.sormetsolmuunpeli.Peli;

/**
 *
 * @author sasumaki
 */
public class TapahtumakuuntelijaMenu implements ActionListener{

    Peli peli;
    JButton aakkospeli;
    JButton invokerpeli;
    JFrame frame;
    

    public TapahtumakuuntelijaMenu(Peli peli, JFrame frame) {
        this.peli = peli;
        this.frame = frame;
        this.aakkospeli = aakkospeli;
    }

    


    @Override
    public void actionPerformed(ActionEvent ae) {
        String cmd = ae.getActionCommand();

        if (cmd.equals("aakkospeli")) {
            frame.setVisible(false);
            aakkospeliGUI aakkospeliGUI = new aakkospeliGUI(peli, frame);

        }
    }

}
