/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sormetsolmuun.Kayttoliittymat.InvokerpeliKayttoliittyma;

/**
 *
 * @author sasumaki
 */
import java.awt.Color;
import java.awt.Graphics;
import java.util.Arrays;
import javax.swing.JPanel;
import Sormetsolmuun.Logiikka.Invokerpelilogiikka.Invokerpeli;

public class Piirtoalusta extends JPanel {

    Invokerpeli peli;

    public Piirtoalusta(Invokerpeli peli) {
        super.setBackground(Color.WHITE);
        this.peli = peli;
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        int[] orbit;
        orbit = Arrays.copyOf(peli.getOrbit(), 3);
        

        piirraEnsimmainenPallo(orbit, graphics);
        piirraToinenPallo(orbit, graphics);
        piirraKolmasPallo(orbit, graphics);

    }

    private void piirraKolmasPallo(int[] orbit, Graphics graphics) {
        if (orbit[2] == 1) {
            graphics.setColor(Color.BLUE);
            graphics.fillOval(210, 100, 25, 25);
        }
        else if (orbit[2] == 2) {
            graphics.setColor(Color.MAGENTA);
            graphics.fillOval(210, 100, 25, 25);
        }
        else if (orbit[2] == 3) {
            graphics.setColor(Color.ORANGE);
            graphics.fillOval(210, 100, 25, 25);
        } else {
            graphics.setColor(Color.GRAY);
            graphics.fillOval(210, 100, 25, 25);

        }
    }

    private void piirraToinenPallo(int[] orbit, Graphics graphics) {
        if (orbit[1] == 1) {
            graphics.setColor(Color.BLUE);
            graphics.fillOval(135, 100, 25, 25);
        }
        else if (orbit[1] == 2) {
            graphics.setColor(Color.MAGENTA);
            graphics.fillOval(135, 100, 25, 25);
        }
        else if (orbit[1] == 3) {
            graphics.setColor(Color.ORANGE);
            graphics.fillOval(135, 100, 25, 25);
        } else {
            graphics.setColor(Color.GRAY);
            graphics.fillOval(135, 100, 25, 25);
        }
    }

    private void piirraEnsimmainenPallo(int[] orbit, Graphics graphics) {
        if (orbit[0] == 1) {
            graphics.setColor(Color.BLUE);
            graphics.fillOval(60, 100, 25, 25);
        }
        else if (orbit[0] == 2) {
            graphics.setColor(Color.MAGENTA);
            graphics.fillOval(60, 100, 25, 25);
        }
        else if (orbit[0] == 3) {
            graphics.setColor(Color.ORANGE);
            graphics.fillOval(60, 100, 25, 25);
        } else {
            graphics.setColor(Color.GRAY);
            graphics.fillOval(60, 100, 25, 25);
        }
    }
}
