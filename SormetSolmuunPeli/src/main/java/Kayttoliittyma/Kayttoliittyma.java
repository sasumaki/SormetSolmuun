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
import sormetsolmuunpeli.sormetsolmuunpeli.Peli;

public class Kayttoliittyma implements Runnable {

    private JFrame frame;
    Peli peli;

    public Kayttoliittyma(Peli peli) {
        this.peli = peli;
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
        JButton aakkospeli = new JButton("Aakkospeli");
        JButton invokerpeli = new JButton("Invoker game");
        TapahtumakuuntelijaMenu kasittelija = new TapahtumakuuntelijaMenu(peli, frame);

        container.add(aakkospeli);
        container.add(invokerpeli);
        
        aakkospeli.addActionListener(kasittelija);

        invokerpeli.addActionListener(kasittelija);
        aakkospeli.setActionCommand("aakkospeli");
        invokerpeli.setActionCommand("invokerpeli");

//        luoKomponentitAakkospeliin(container);
    }

//    private void luoKomponentitAakkospeliin(Container container) {
//        frame.setLayout(new GridLayout(1, 1));
//        JTextField painettavakirjain = new JTextField(peli.getKirjain(peli.getAakkosto()).toUpperCase());
//        Font font = new Font("Helvetica", Font.PLAIN, 24);
//        painettavakirjain.setFont(font);
//        painettavakirjain.setForeground(Color.BLACK);
//        painettavakirjain.setHorizontalAlignment(SwingConstants.CENTER);
//       
//        container.add(painettavakirjain);
//        painettavakirjain.setEditable(false);
//        
//        
//        TapahtumakuuntelijaAakkospeliin kasittelija = new TapahtumakuuntelijaAakkospeliin(peli, painettavakirjain);
//        
//        painettavakirjain.addKeyListener(kasittelija);
//    }
    public JFrame getFrame() {
        return frame;
    }
}
