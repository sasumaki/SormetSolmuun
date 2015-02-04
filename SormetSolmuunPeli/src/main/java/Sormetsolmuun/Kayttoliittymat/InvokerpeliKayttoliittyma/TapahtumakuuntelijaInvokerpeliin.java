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
 *
 * @author sasumaki
 */
public class TapahtumakuuntelijaInvokerpeliin implements KeyListener {

    Invokerpeli peli;
    Component paivitettava;
    JTextField invokettava;
    private int pisteet;

    public TapahtumakuuntelijaInvokerpeliin(Invokerpeli peli, Component paivitettava, JTextField invokettava) {
        this.peli = peli;
        this.paivitettava = paivitettava;
        this.invokettava = invokettava;
        this.pisteet = 0;
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
            if(invokettava.getText().equals(peli.invoke().name())){
                pisteet++;
               if(pisteet == 10){
                   invokettava.setText("You Wonnered!");
               }else{
                invokettava.setText(peli.getSpell());
               }
            }
            else{
                invokettava.setText("This magic...disappoints");
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
