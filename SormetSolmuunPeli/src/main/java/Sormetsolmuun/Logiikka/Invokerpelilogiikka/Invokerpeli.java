/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sormetsolmuun.Logiikka.Invokerpelilogiikka;

import Sormetsolmuun.Logiikka.Aakkospelilogiikka.Aakkospeli;
import Sormetsolmuun.Sormetsolmuun.Pelaaja.Pelaaja;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import static Sormetsolmuun.Logiikka.Invokerpelilogiikka.Invokerpeli.spellit.*;
import java.util.Random;

/**
 *Logiikka invokerpeliin, käyttäjällä on kolmen alkion pituinen lista, 
 * jossa on aina arvo {1,2,3}, jotka kuvastavat eri orbeja, joista rakentuu
 * eri spellit.
 * lisätietoa
 * http://dota2.gamepedia.com/Invokerhttp://dota2.gamepedia.com/Invoker
 * 
 * @author sasumaki
 */
public class Invokerpeli extends Aakkospeli {

    private int[] orbit;
    private ArrayList<Enum> lista;

    public Invokerpeli(Pelaaja pelaaja, Scanner lukija) {
        super(pelaaja, lukija);
        this.orbit = new int[3];
        this.lista = new ArrayList<Enum>();
    }
/**
 * luo eri spelleille enumit
 */
    public enum spellit {

        COLDSNAP, TORNADO, EMP, METEOR, SUNSTRIKE, GHOSTWALK, ALACRITY, DEAFENINGBLAST,
        FORGESPIRIT, ICEWALL;
    }

    public String getSpell(String spelli) {
        
        Random random = new Random();
        String palautettava = lista.get(random.nextInt(lista.size())).name();
        while(palautettava.equals(spelli)){
            palautettava = lista.get(random.nextInt(lista.size())).name();
        }
        return palautettava;
    }
//    public void poistaSpelli(Enum poistettava){
//        lista.remove(poistettava);
//    }
    public ArrayList<Enum> getSpelliLista(){
        return lista;
    }
/**
 * tekee listan enumeista
 */
    public void luoSpelliLista() {
        lista.clear();
        lista.add(COLDSNAP);
        lista.add(TORNADO);
        lista.add(EMP);
        lista.add(METEOR);
        lista.add(SUNSTRIKE);
        lista.add(GHOSTWALK);
        lista.add(ALACRITY);
        lista.add(DEAFENINGBLAST);
        lista.add(FORGESPIRIT);
        lista.add(ICEWALL);

    }
    /**
     * aloittaa pelin alusta
     */
    public void restart(){
        luoSpelliLista();
        orbinvaihto(-1);
        orbinvaihto(-1);
        orbinvaihto(-1);
        
    }
/**
 * Siirtää indeksit eteenpäin poistaen 2. indeksin ja lisäen uuden 0. indeksiin
 * @param orbi 
 */
    public void orbinvaihto(int orbi) {
        if (orbi < 0 || orbi > 3) {
            return;
        }
        orbit[2] = orbit[1];
        orbit[1] = orbit[0];
        orbit[0] = orbi;
    }
/**
 * Palauttaa orbien "asennon" mukaisen spellin.
 *  
 */
    public spellit invoke() {
        if (orbit[0] == 1 && orbit[1] == 1 && orbit[2] == 1) {
            return COLDSNAP;
        }

        if (orbit[0] == 1 && orbit[1] == 1 && orbit[2] == 2) {
            return GHOSTWALK;
        }
        if (orbit[0] == 1 && orbit[1] == 1 && orbit[2] == 3) {
            return ICEWALL;
        }
        if (orbit[0] == 1 && orbit[1] == 2 && orbit[2] == 1) {
            return GHOSTWALK;
        }
        if (orbit[0] == 1 && orbit[1] == 3 && orbit[2] == 1) {
            return ICEWALL;
        }
        if (orbit[0] == 2 && orbit[1] == 1 && orbit[2] == 1) {
            return GHOSTWALK;
        }
        if (orbit[0] == 3 && orbit[1] == 1 && orbit[2] == 1) {
            return ICEWALL;
        }
        if (orbit[0] == 2 && orbit[1] == 2 && orbit[2] == 2) {
            return EMP;
        }
        if (orbit[0] == 2 && orbit[1] == 2 && orbit[2] == 1) {
            return TORNADO;
        }

        if (orbit[0] == 2 && orbit[1] == 2 && orbit[2] == 3) {
            return ALACRITY;
        }
        if (orbit[0] == 2 && orbit[1] == 1 && orbit[2] == 2) {
            return TORNADO;
        }
        if (orbit[0] == 2 && orbit[1] == 3 && orbit[2] == 2) {
            return ALACRITY;
        }
        if (orbit[0] == 1 && orbit[1] == 2 && orbit[2] == 2) {
            return TORNADO;
        }
        if (orbit[0] == 3 && orbit[1] == 2 && orbit[2] == 2) {
            return ALACRITY;
        }

        if (orbit[0] == 3 && orbit[1] == 3 && orbit[2] == 3) {
            return SUNSTRIKE;
        }
        if (orbit[0] == 3 && orbit[1] == 3 && orbit[2] == 1) {
            return FORGESPIRIT;
        }
        if (orbit[0] == 3 && orbit[1] == 3 && orbit[2] == 2) {
            return METEOR;
        }
        if (orbit[0] == 3 && orbit[1] == 1 && orbit[2] == 3) {
            return FORGESPIRIT;
        }
        if (orbit[0] == 3 && orbit[1] == 2 && orbit[2] == 3) {
            return METEOR;
        }
        if (orbit[0] == 1 && orbit[1] == 3 && orbit[2] == 3) {
            return FORGESPIRIT;
        }
        if (orbit[0] == 2 && orbit[1] == 3 && orbit[2] == 3) {
            return METEOR;
        }
        if (orbit[0] == 1 && orbit[1] == 2 && orbit[2] == 3) {
            return DEAFENINGBLAST;
        }
        if (orbit[0] == 3 && orbit[1] == 2 && orbit[2] == 1) {
            return DEAFENINGBLAST;
        }
        if (orbit[0] == 2 && orbit[1] == 3 && orbit[2] == 1) {
            return DEAFENINGBLAST;
        }
        if (orbit[0] == 1 && orbit[1] == 3 && orbit[2] == 2) {
            return DEAFENINGBLAST;
        }
        if (orbit[0] == 3 && orbit[1] == 1 && orbit[2] == 2) {
            return DEAFENINGBLAST;
        }
        if (orbit[0] == 2 && orbit[1] == 1 && orbit[2] == 3) {
            return DEAFENINGBLAST;
        }
        return null;

    }

    public int[] getOrbit() {
        return orbit;
    }

}
