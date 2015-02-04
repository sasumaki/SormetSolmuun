package Sormetsolmuun.testipakkaus;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import Sormetsolmuun.Sormetsolmuun.Pelaaja;

/**
 *
 * @author sasumaki
 */
public class Pelaajatesti {

    Pelaaja pelaaja;

    public Pelaajatesti() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        pelaaja = new Pelaaja("Sasu");
    }

    @After
    public void tearDown() {
    }

    @Test
    public void konstruktoriToimiiOikein() {
        int pisteet = 0;
        int oikeatpisteet = pelaaja.getPisteet();

        assertEquals(pisteet, oikeatpisteet);
    }

    @Test
    public void lisaaPisteetToimiiOikein1() {
        pelaaja.lisaaPisteet(1000);
        pelaaja.lisaaPisteet(10);

        assertEquals(1010, pelaaja.getPisteet());
    }

    @Test
    public void lisaaPisteetToimiiOikein2() {
        pelaaja.lisaaPisteet(1000);
        pelaaja.lisaaPisteet(-10);

        assertEquals(1000, pelaaja.getPisteet());
    }

    @Test
    public void nollaaPisteetToimiiOikein() {
        pelaaja.lisaaPisteet(1000);
        pelaaja.nollaaPisteet();

        assertEquals(0, pelaaja.getPisteet());
    }

}
