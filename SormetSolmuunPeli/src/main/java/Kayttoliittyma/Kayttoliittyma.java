package Kayttoliittyma;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import sormetsolmuunpeli.sormetsolmuunpeli.Aakkospeli;
import sormetsolmuunpeli.sormetsolmuunpeli.Invokerpeli;

public class Kayttoliittyma implements Runnable {

    private JFrame frame;
    Aakkospeli aakkospeli;
    Invokerpeli invokerpeli;

    public Kayttoliittyma(Aakkospeli aakkospeli, Invokerpeli invokerpeli) {
        this.aakkospeli = aakkospeli;
        this.invokerpeli = invokerpeli;
    }

    @Override
    public void run() {
        frame = new JFrame("Sormet Solmuun");
        frame.setPreferredSize(new Dimension(300, 150));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        luoKomponentitMenu(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void luoKomponentitMenu(Container container) {
        frame.setLayout(new GridLayout(2, 1));
        JButton aakkospelinappi = new JButton("Aakkospeli");
        JButton invokerpelinappi = new JButton("Invoker game");
        TapahtumakuuntelijaMenu kasittelija = new TapahtumakuuntelijaMenu(aakkospeli,invokerpeli, frame, aakkospelinappi, invokerpelinappi);

        container.add(aakkospelinappi);
        container.add(invokerpelinappi);

        aakkospelinappi.addActionListener(kasittelija);
        invokerpelinappi.addActionListener(kasittelija);
        aakkospelinappi.setActionCommand("aakkospeli");
        invokerpelinappi.setActionCommand("invokerpeli");

    }

    public JFrame getFrame() {
        return frame;
    }
}
