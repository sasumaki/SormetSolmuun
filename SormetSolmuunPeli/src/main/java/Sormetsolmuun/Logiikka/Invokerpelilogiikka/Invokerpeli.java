/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sormetsolmuun.Logiikka.Invokerpelilogiikka;

import Sormetsolmuun.Logiikka.Aakkospelilogiikka.Aakkospeli;
import Sormetsolmuun.Sormetsolmuun.Pelaaja;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import static Sormetsolmuun.Logiikka.Invokerpelilogiikka.Invokerpeli.spellit.*;

/**
 *
 * @author sasumaki
 */
public class Invokerpeli extends Aakkospeli {

    private int[] orbit;

    public Invokerpeli(Pelaaja pelaaja, Scanner lukija) {
        super(pelaaja, lukija);
        this.orbit = new int[3];
    }

    public enum spellit {

        COLDSNAP, TORNADO, EMP, METEOR, SUNSTRIKE, GHOSTWALK, ALACRITY, DEAFENINGBLAST,
        FORGESPIRIT, ICEWALL;
    }
    public String getSpell(){
        
        return COLDSNAP.name();
    }
    

    public void orbinvaihto(int orbi) {
        if (orbi < 0 || orbi > 3) {
            return;
        }
        orbit[2] = orbit[1];
        orbit[1] = orbit[0];
        orbit[0] = orbi;
    }

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
    public int[] getOrbit(){
        return orbit;
    }

}
