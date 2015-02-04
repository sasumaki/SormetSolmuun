package Sormetsolmuun.testipakkaus;

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
import Sormetsolmuun.Sormetsolmuun.Pelaaja;
import Sormetsolmuun.Logiikka.Aakkospelilogiikka.Aakkospeli;

/**
 *
 * @author sasumaki
 */
public class Pelitesti {

    Pelaaja pelaaja;
    Scanner lukija;
    Aakkospeli peli;
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
        peli = new Aakkospeli(pelaaja, lukija);

    }

    @After
    public void tearDown() {
    }

    @Test
    @SuppressWarnings("empty-statement")
    public void luoAakkostonOikein() {
        peli.luoAakkosto();
        List vastaus = peli.getAakkosto();
        List kokeilu = new ArrayList<String>();
        for (char a = 'a'; a <= 'z'; a++) {
            kokeilu.add(a + "");
        }

        assertEquals(kokeilu, vastaus);

    }

    @Test
    public void poistaKirjainToimiiOikein1() {
        peli.luoAakkosto();
        peli.poistaKirjain("a");
        List kokeilu = new ArrayList<String>();
        for (char a = 'b'; a <= 'z'; a++) {
            kokeilu.add(a + "");
        }

        assertEquals(kokeilu, peli.getAakkosto());
    }

    @Test
    public void poistaKirjainToimiiOikein2() {
        peli.luoAakkosto();
        peli.poistaKirjain("Kappanator666");
        List kokeilu = new ArrayList<String>();
        for (char a = 'a'; a <= 'z'; a++) {
            kokeilu.add(a + "");
        }

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

    @Test
    public void testaaVirheidenLisays() {
        peli.virheidenLisays();

        assertEquals(1, peli.getVirheet());
    }

    @Test
    public void testaaLiikaaVirheita1() {
        peli.virheidenLisays();
        peli.virheidenLisays();
        peli.virheidenLisays();
        peli.virheidenLisays();

        assertEquals(true, peli.liikaaVirheita());
    }

    @Test
    public void testaaLiikaaVirheita2() {

        peli.virheidenLisays();
        peli.virheidenLisays();

        assertEquals(false, peli.liikaaVirheita());

    }
}
