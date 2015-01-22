package sormetsolmuunpeli.testipakkaus;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import sormetsolmuunpeli.sormetsolmuunpeli.Pelaaja;
import sormetsolmuunpeli.sormetsolmuunpeli.Peli;

/**
 *
 * @author sasumaki
 */
public class Pelitesti {

    Pelaaja pelaaja;
    Scanner lukija;
    Peli peli;
    List kokeilu;

    public Pelitesti() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        peli = new Peli(pelaaja, lukija);

    }

    @After
    public void tearDown() {
    }

    @Test
    public void luoAakkostonOikein() {
        peli.luoAakkosto();
        List vastaus = peli.getAakkosto();
        List kokeilu = new ArrayList<String>();
        kokeilu.add("a");
        kokeilu.add("b");
        kokeilu.add("c");
        kokeilu.add("d");

        assertEquals(kokeilu, vastaus);

    }

    @Test
    public void poistaKirjainToimiiOikein1() {
        peli.luoAakkosto();
        peli.poistaKirjain("a");
        List kokeilu = new ArrayList<String>();
        kokeilu.add("b");
        kokeilu.add("c");
        kokeilu.add("d");

        assertEquals(kokeilu, peli.getAakkosto());
    }

    @Test
    public void poistaKirjainToimiiOikein2() {
        peli.luoAakkosto();
        peli.poistaKirjain("Kappanator666");
        List kokeilu = new ArrayList<String>();
        kokeilu.add("a");
        kokeilu.add("b");
        kokeilu.add("c");
        kokeilu.add("d");

        assertEquals(kokeilu, peli.getAakkosto());
    }

    @Test
    public void testaaMerkkiToimii1() {
        String syote = "a";
        String vastaus = "a";
        Boolean testi = peli.testaaMerkki(syote, vastaus);

        assertEquals(true, testi);

    }

    @Test
    public void testaaMerkkiToimii2() {
        String syote = "a";
        String vastaus = "b";
        Boolean testi = peli.testaaMerkki(syote, vastaus);

        assertEquals(false, testi);

    }

}
