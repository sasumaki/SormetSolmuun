package sormetsolmuunpeli.sormetsolmuunpeli;

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

public class Kayttoliittyma implements Runnable {
    
    private JFrame frame;
    private Peli peli;
    
    public Kayttoliittyma(Peli peli) {
        this.peli = peli;
    }
    
    @Override
    public void run() {
        frame = new JFrame("Aakkospeli");
        frame.setPreferredSize(new Dimension(300, 150));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        luoKomponentit(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
    }
    
    private void luoKomponentit(Container container) {
        
        frame.setLayout(new GridLayout(1, 1));
        JTextField painettavakirjain = new JTextField(peli.getKirjain(peli.getAakkosto()).toUpperCase());
        Font font = new Font("Helvetica", Font.PLAIN, 24);
        painettavakirjain.setFont(font);
        painettavakirjain.setForeground(Color.BLACK);
        painettavakirjain.setHorizontalAlignment(SwingConstants.CENTER);
       
        container.add(painettavakirjain);
        painettavakirjain.setEditable(false);
        
        
        Tapahtumakuuntelija kasittelija = new Tapahtumakuuntelija(peli, painettavakirjain);
        
        painettavakirjain.addKeyListener(kasittelija);
    }
    
    public JFrame getFrame() {
        return frame;
    }
}
