package Sormetsolmuun.Kayttoliittymat.InvokerpeliKayttoliittyma;

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
            graphics.fillOval(180, 20, 40, 40);
        } else if (orbit[2] == 2) {
            graphics.setColor(Color.MAGENTA);
            graphics.fillOval(180, 20, 40, 40);
        } else if (orbit[2] == 3) {
            graphics.setColor(Color.ORANGE);
            graphics.fillOval(180, 20, 40, 40);
        } else {
            graphics.setColor(Color.GRAY);
            graphics.fillOval(180, 20, 40, 40);

        }
    }

    private void piirraToinenPallo(int[] orbit, Graphics graphics) {
        if (orbit[1] == 1) {
            graphics.setColor(Color.BLUE);
            graphics.fillOval(130, 20, 40, 40);
        } else if (orbit[1] == 2) {
            graphics.setColor(Color.MAGENTA);
            graphics.fillOval(130, 20, 40, 40);
        } else if (orbit[1] == 3) {
            graphics.setColor(Color.ORANGE);
            graphics.fillOval(130, 20, 40, 40);
        } else {
            graphics.setColor(Color.GRAY);
            graphics.fillOval(130, 20, 40, 40);
        }
    }

    private void piirraEnsimmainenPallo(int[] orbit, Graphics graphics) {
        if (orbit[0] == 1) {
            graphics.setColor(Color.BLUE);
            graphics.fillOval(80, 20, 40, 40);
        } else if (orbit[0] == 2) {
            graphics.setColor(Color.MAGENTA);
            graphics.fillOval(80, 20, 40, 40);
        } else if (orbit[0] == 3) {
            graphics.setColor(Color.ORANGE);
            graphics.fillOval(80, 20, 40, 40);
        } else {
            graphics.setColor(Color.GRAY);
            graphics.fillOval(80, 20, 40, 40);
        }
    }
}
