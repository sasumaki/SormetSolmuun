/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sormetsolmuunpeli.sormetsolmuunpeli;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import static sormetsolmuunpeli.sormetsolmuunpeli.Invokerpeli.spellit.*;

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

        coldsnap, tornado, emp, meteor, sunstrike, ghostwalk, alacrity, deafeningblast,
        forgespirit, icewall;
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
            return coldsnap;
        }

        if (orbit[0] == 1 && orbit[1] == 1 && orbit[2] == 2) {
            return ghostwalk;
        }
        if (orbit[0] == 1 && orbit[1] == 1 && orbit[2] == 3) {
            return icewall;
        }
        if (orbit[0] == 1 && orbit[1] == 2 && orbit[2] == 1) {
            return ghostwalk;
        }
        if (orbit[0] == 1 && orbit[1] == 3 && orbit[2] == 1) {
            return icewall;
        }
        if (orbit[0] == 2 && orbit[1] == 1 && orbit[2] == 1) {
            return ghostwalk;
        }
        if (orbit[0] == 3 && orbit[1] == 1 && orbit[2] == 1) {
            return icewall;
        }
        if (orbit[0] == 2 && orbit[1] == 2 && orbit[2] == 2) {
            return emp;
        }
        if (orbit[0] == 2 && orbit[1] == 2 && orbit[2] == 1) {
            return tornado;
        }

        if (orbit[0] == 2 && orbit[1] == 2 && orbit[2] == 3) {
            return alacrity;
        }
        if (orbit[0] == 2 && orbit[1] == 1 && orbit[2] == 2) {
            return tornado;
        }
        if (orbit[0] == 2 && orbit[1] == 3 && orbit[2] == 2) {
            return alacrity;
        }
        if (orbit[0] == 1 && orbit[1] == 2 && orbit[2] == 2) {
            return tornado;
        }
        if (orbit[0] == 3 && orbit[1] == 2 && orbit[2] == 2) {
            return alacrity;
        }

        if (orbit[0] == 3 && orbit[1] == 3 && orbit[2] == 3) {
            return sunstrike;
        }
        if (orbit[0] == 3 && orbit[1] == 3 && orbit[2] == 1) {
            return forgespirit;
        }
        if (orbit[0] == 3 && orbit[1] == 3 && orbit[2] == 2) {
            return meteor;
        }
        if (orbit[0] == 3 && orbit[1] == 1 && orbit[2] == 3) {
            return forgespirit;
        }
        if (orbit[0] == 3 && orbit[1] == 2 && orbit[2] == 3) {
            return meteor;
        }
        if (orbit[0] == 1 && orbit[1] == 3 && orbit[2] == 3) {
            return forgespirit;
        }
        if (orbit[0] == 2 && orbit[1] == 3 && orbit[2] == 3) {
            return meteor;
        }
        if (orbit[0] == 1 && orbit[1] == 2 && orbit[2] == 3) {
            return deafeningblast;
        }
        if (orbit[0] == 3 && orbit[1] == 2 && orbit[2] == 1) {
            return deafeningblast;
        }
        if (orbit[0] == 2 && orbit[1] == 3 && orbit[2] == 1) {
            return deafeningblast;
        }
        if (orbit[0] == 1 && orbit[1] == 3 && orbit[2] == 2) {
            return deafeningblast;
        }
        if (orbit[0] == 3 && orbit[1] == 1 && orbit[2] == 2) {
            return deafeningblast;
        }
        if (orbit[0] == 2 && orbit[1] == 1 && orbit[2] == 3) {
            return deafeningblast;
        }
        return null;

    }
    public int[] getOrbit(){
        return orbit;
    }

}
