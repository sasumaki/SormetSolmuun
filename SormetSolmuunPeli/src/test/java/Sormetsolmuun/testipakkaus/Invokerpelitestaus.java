/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sormetsolmuun.testipakkaus;

import Sormetsolmuun.Logiikka.Invokerpelilogiikka.Invokerpeli;
import Sormetsolmuun.Sormetsolmuun.Pelaaja.Pelaaja;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sasumaki
 */
public class Invokerpelitestaus {

    Pelaaja pelaaja;
    Scanner lukija;
    Invokerpeli peli;
    List<Enum> spellit;

    public Invokerpelitestaus() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        peli = new Invokerpeli(pelaaja, lukija);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testaaOrbinVaihto() {
        peli.orbinvaihto(1);
        peli.orbinvaihto(1);
        peli.orbinvaihto(1);

        int[] kokeilu = {1, 1, 1};
        String kokeilustring = "";

        for (int a : kokeilu) {
            kokeilustring += a;
        }
        String pelistring = "";
        for (int a : peli.getOrbit()) {
            pelistring += a;
        }

        assertEquals(pelistring, kokeilustring);
    }

    @Test
    public void testaaOrbinVaihtoYliKolmella() {
        peli.orbinvaihto(1);
        peli.orbinvaihto(1);
        peli.orbinvaihto(1);
        peli.orbinvaihto(2);

        int[] kokeilu = {2, 1, 1};
        String kokeilustring = "";

        for (int a : kokeilu) {
            kokeilustring += a;
        }
        String pelistring = "";
        for (int a : kokeilu) {
            pelistring += a;
        }

        assertEquals(pelistring, kokeilustring);
    }

    @Test
    public void testaaInvoke111() {
        peli.orbinvaihto(1);
        peli.orbinvaihto(1);
        peli.orbinvaihto(1);

        String invokettu = peli.invoke().name();

        assertEquals(invokettu, "COLDSNAP");
    }

    @Test
    public void testaaInvoke112() {
        peli.orbinvaihto(1);
        peli.orbinvaihto(1);
        peli.orbinvaihto(2);

        String invokettu = peli.invoke().name();

        assertEquals(invokettu, "GHOSTWALK");
    }

    @Test
    public void testaaInvoke121() {
        peli.orbinvaihto(1);
        peli.orbinvaihto(2);
        peli.orbinvaihto(1);

        String invokettu = peli.invoke().name();

        assertEquals(invokettu, "GHOSTWALK");
    }

    @Test
    public void testaaInvoke211() {
        peli.orbinvaihto(2);
        peli.orbinvaihto(1);
        peli.orbinvaihto(1);

        String invokettu = peli.invoke().name();

        assertEquals(invokettu, "GHOSTWALK");
    }

    @Test
    public void testaaInvoke113() {
        peli.orbinvaihto(1);
        peli.orbinvaihto(1);
        peli.orbinvaihto(3);

        String invokettu = peli.invoke().name();

        assertEquals(invokettu, "ICEWALL");
    }

    @Test
    public void testaaInvoke131() {
        peli.orbinvaihto(1);
        peli.orbinvaihto(3);
        peli.orbinvaihto(1);

        String invokettu = peli.invoke().name();

        assertEquals(invokettu, "ICEWALL");
    }

    @Test
    public void testaaInvoke311() {
        peli.orbinvaihto(3);
        peli.orbinvaihto(1);
        peli.orbinvaihto(1);

        String invokettu = peli.invoke().name();

        assertEquals(invokettu, "ICEWALL");
    }

    @Test
    public void testaaInvoke222() {
        peli.orbinvaihto(2);
        peli.orbinvaihto(2);
        peli.orbinvaihto(2);

        String invokettu = peli.invoke().name();

        assertEquals(invokettu, "EMP");
    }

    @Test
    public void testaaInvoke221() {
        peli.orbinvaihto(2);
        peli.orbinvaihto(2);
        peli.orbinvaihto(1);

        String invokettu = peli.invoke().name();

        assertEquals(invokettu, "TORNADO");
    }

    @Test
    public void testaaInvoke223() {
        peli.orbinvaihto(2);
        peli.orbinvaihto(2);
        peli.orbinvaihto(3);

        String invokettu = peli.invoke().name();

        assertEquals(invokettu, "ALACRITY");
    }

    @Test
    public void testaaInvoke212() {
        peli.orbinvaihto(2);
        peli.orbinvaihto(1);
        peli.orbinvaihto(2);

        String invokettu = peli.invoke().name();

        assertEquals(invokettu, "TORNADO");
    }

    @Test
    public void testaaInvoke232() {
        peli.orbinvaihto(2);
        peli.orbinvaihto(3);
        peli.orbinvaihto(2);

        String invokettu = peli.invoke().name();

        assertEquals(invokettu, "ALACRITY");
    }

    @Test
    public void testaaInvoke122() {
        peli.orbinvaihto(1);
        peli.orbinvaihto(2);
        peli.orbinvaihto(2);

        String invokettu = peli.invoke().name();

        assertEquals(invokettu, "TORNADO");
    }

    @Test
    public void testaaInvoke322() {
        peli.orbinvaihto(3);
        peli.orbinvaihto(2);
        peli.orbinvaihto(2);

        String invokettu = peli.invoke().name();

        assertEquals(invokettu, "ALACRITY");
    }

    @Test
    public void testaaInvoke333() {
        peli.orbinvaihto(3);
        peli.orbinvaihto(3);
        peli.orbinvaihto(3);

        String invokettu = peli.invoke().name();

        assertEquals(invokettu, "SUNSTRIKE");
    }

    @Test
    public void testaaInvoke331() {
        peli.orbinvaihto(3);
        peli.orbinvaihto(3);
        peli.orbinvaihto(1);

        String invokettu = peli.invoke().name();

        assertEquals(invokettu, "FORGESPIRIT");
    }

    @Test
    public void testaaInvoke332() {
        peli.orbinvaihto(3);
        peli.orbinvaihto(3);
        peli.orbinvaihto(2);

        String invokettu = peli.invoke().name();

        assertEquals(invokettu, "METEOR");
    }

    @Test
    public void testaaInvoke323() {
        peli.orbinvaihto(3);
        peli.orbinvaihto(2);
        peli.orbinvaihto(3);

        String invokettu = peli.invoke().name();

        assertEquals(invokettu, "METEOR");
    }

    @Test
    public void testaaInvoke313() {
        peli.orbinvaihto(3);
        peli.orbinvaihto(1);
        peli.orbinvaihto(3);

        String invokettu = peli.invoke().name();

        assertEquals(invokettu, "FORGESPIRIT");
    }

    @Test
    public void testaaInvoke133() {
        peli.orbinvaihto(1);
        peli.orbinvaihto(3);
        peli.orbinvaihto(3);

        String invokettu = peli.invoke().name();

        assertEquals(invokettu, "FORGESPIRIT");
    }

    @Test
    public void testaaInvoke233() {
        peli.orbinvaihto(2);
        peli.orbinvaihto(3);
        peli.orbinvaihto(3);

        String invokettu = peli.invoke().name();

        assertEquals(invokettu, "METEOR");
    }

    @Test
    public void testaaInvoke123() {
        peli.orbinvaihto(1);
        peli.orbinvaihto(2);
        peli.orbinvaihto(3);

        String invokettu = peli.invoke().name();

        assertEquals(invokettu, "DEAFENINGBLAST");
    }

    @Test
    public void testaaInvoke132() {
        peli.orbinvaihto(1);
        peli.orbinvaihto(3);
        peli.orbinvaihto(2);

        String invokettu = peli.invoke().name();

        assertEquals(invokettu, "DEAFENINGBLAST");
    }

    @Test
    public void testaaInvoke312() {
        peli.orbinvaihto(3);
        peli.orbinvaihto(1);
        peli.orbinvaihto(2);

        String invokettu = peli.invoke().name();

        assertEquals(invokettu, "DEAFENINGBLAST");
    }

    @Test
    public void testaaInvoke321() {
        peli.orbinvaihto(3);
        peli.orbinvaihto(2);
        peli.orbinvaihto(1);

        String invokettu = peli.invoke().name();

        assertEquals(invokettu, "DEAFENINGBLAST");
    }

    @Test
    public void testaaInvoke213() {
        peli.orbinvaihto(2);
        peli.orbinvaihto(1);
        peli.orbinvaihto(3);

        String invokettu = peli.invoke().name();

        assertEquals(invokettu, "DEAFENINGBLAST");
    }

    @Test
    public void testaaInvoke231() {
        peli.orbinvaihto(2);
        peli.orbinvaihto(3);
        peli.orbinvaihto(1);

        String invokettu = peli.invoke().name();

        assertEquals(invokettu, "DEAFENINGBLAST");
    }

    @Test
    public void testaaRestart() {
        peli.restart();

        int[] kokeilu = {0, 0, 0};
        String kokeilustring = "";

        for (int a : kokeilu) {
            kokeilustring += a;
        }
        String pelistring = "";
        for (int a : peli.getOrbit()) {
            pelistring += a;
        }
        
        assertEquals(pelistring, kokeilustring);

    }

}
