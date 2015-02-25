package Sormetsolmuun.Sormetsolmuun;

import Sormetsolmuun.Kayttoliittymat.MenuKayttoliittyma.Kayttoliittyma;
import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {
        
        
        SwingUtilities.invokeLater(new Kayttoliittyma());

    }

}
