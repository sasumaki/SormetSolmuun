/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sormetsolmuun.Kayttoliittymat.MenuKayttoliittyma;

import Sormetsolmuun.Kayttoliittymat.AakkospeliKayttoliittyma.AakkospeliGUI;
import Sormetsolmuun.Kayttoliittymat.InvokerpeliKayttoliittyma.InvokerpeliGUI;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import Sormetsolmuun.Logiikka.Aakkospelilogiikka.Aakkospeli;
import Sormetsolmuun.Logiikka.Invokerpelilogiikka.Invokerpeli;

/**
 *
 * @author sasumaki
 */
public class TapahtumakuuntelijaMenu implements ActionListener{

    Aakkospeli peli;
    Invokerpeli invokerpeli;
    JButton aakkospelinappi;
    JButton invokerpelinappi;
    JFrame frame;
    

    public TapahtumakuuntelijaMenu(Aakkospeli peli,Invokerpeli invokerpeli, JFrame frame, JButton aakkospelinappi, JButton invokerpelinappi) {
        this.peli = peli;
        this.invokerpeli = invokerpeli;
        this.frame = frame;
        this.aakkospelinappi = aakkospelinappi;
        this.invokerpelinappi = invokerpelinappi;
    }

    


    @Override
    public void actionPerformed(ActionEvent ae) {
        String cmd = ae.getActionCommand();

        if (cmd.equals("aakkospeli")) {
            frame.remove(aakkospelinappi);
            frame.remove(invokerpelinappi);
            AakkospeliGUI aakkospeliGUI = new AakkospeliGUI(peli, frame);

        }
        if (cmd.equals("invokerpeli")){
            frame.remove(aakkospelinappi);
            frame.remove(invokerpelinappi);
            InvokerpeliGUI invokerpeliGUI = new InvokerpeliGUI(invokerpeli, frame);
        }
    }

}
