/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sormetsolmuunpeli.sormetsolmuunpeli;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author sasumaki
 */
public class Peli {

    private Pelaaja pelaaja;
    private List aakkosto;

    public Peli(Pelaaja pelaaja, Scanner lukija) {
        this.pelaaja = pelaaja;
        this.aakkosto = aakkosto;
    }

    public void luoAakkosto() {
        String[] aakkosto = {"a", "b", "c", "d"};

        List<String> aakkostolista = new ArrayList<String>(Arrays.asList(aakkosto));
        this.aakkosto = aakkostolista;
    }

    public void poistaKirjain(String kirjain) {
        aakkosto.remove(kirjain);
    }

    public List getAakkosto() {
        return aakkosto;
    }

    public String getKirjain(List lista) {
        String kirjain = "";
        Random randomi = new Random();
        kirjain = (String) lista.get(randomi.nextInt(lista.size()));

        return kirjain;
    }

    public Boolean testaaMerkki(String syote, String vastaus) {
        if (syote.equals(vastaus)) {
            return true;
        }

        return false;
    }
}
