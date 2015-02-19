/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sormetsolmuun.Logiikka.Aakkospelilogiikka;

import Sormetsolmuun.Sormetsolmuun.Pelaaja.Pelaaja;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Luokalla on lista aakkosista jota peli käyttää.
 *
 * @author sasumaki
 */
public class Aakkospeli {

    private Pelaaja pelaaja;
    private List aakkosto;
    private Scanner lukija;
    private int virheet;

    public Aakkospeli(Pelaaja pelaaja, Scanner lukija) {
        this.pelaaja = pelaaja;
        this.aakkosto = aakkosto;
        this.lukija = lukija;
        this.virheet = virheet;
    }

    /**
     * Luo aakkoslistan, jota käytetään pelissä
     */
    public void luoAakkosto() {
        String[] aakkosto = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        List<String> aakkostolista = new ArrayList<String>(Arrays.asList(aakkosto));
        this.aakkosto = aakkostolista;
    }

    /**
     * poistaa kirjaimen listalta
     *
     * @param kirjain
     */

    public void poistaKirjain(String kirjain) {
        aakkosto.remove(kirjain);
    }

    public List getAakkosto() {
        return aakkosto;
    }

    public Scanner getLukija() {
        return lukija;
    }

    /**
     * hakee satunnaisen kirjaimen listalta
     *
     * @param lista
     * @return kirjain
     */
    public String getKirjain(List lista) {
        String kirjain = "";
        Random randomi = new Random();
        kirjain = (String) lista.get(randomi.nextInt(lista.size()));

        return kirjain;
    }

    /**
     * testaa onko merkki sama kuin toinen
     *
     * @param syote
     * @param vastaus
     * @return
     */
    public Boolean testaaMerkki(String syote, String vastaus) {
        if (syote.equalsIgnoreCase(vastaus)) {
            return true;
        }

        return false;
    }

    /**
     * lisää pelaajan tekemiä virheitä.
     */
    public void virheidenLisays() {
        virheet++;
    }

    public int getVirheet() {
        return virheet;
    }
    /**
     * nollaa virhelaskurin
     */
    public void nollaaVirheet(){
        virheet = 0;
    }

    /**
     * palauttaa totuusarvon true jos virheitä yli 3, muuten false
     *
     * @return
     */
    public boolean liikaaVirheita() {
        if (virheet > 3) {
            return true;
        }
        return false;
    }

}
