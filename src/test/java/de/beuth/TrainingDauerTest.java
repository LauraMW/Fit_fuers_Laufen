package de.beuth;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Lenovo on 14.01.2017.
 */
public class TrainingDauerTest {

    private static TrainingDauer trainingDauer;

    @Before
    public void setUp() throws Exception {
        trainingDauer = new TrainingDauer();
    }

    @After
    public void tearDown() throws Exception {
        trainingDauer = null;
    }

    @Test
    public void dauerUntrainirt() throws Exception {
        String[] strecke = {"5","10"};
        String[] zeit5 = {"20", "25", "30", "35"};
        String[] zeit10 = {"40", "45", "50", "55", "60"};
        // Test of method dauerUntrainirt
        int[] test1Zeiten5 = {74,42,42,23};
        for(int m = 0; m<zeit5.length; m++){
            assertEquals(test1Zeiten5[m], trainingDauer.dauerUntrainirt(strecke[0], zeit5[m]));
        }
        int[] test1Zeiten10 = {122,76,70,35,31};
        for(int m = 0; m<zeit10.length; m++){
            assertEquals(test1Zeiten10[m], trainingDauer.dauerUntrainirt(strecke[1], zeit10[m]));
        }
    }

    @Test
    public void dauerGrundausdauer() throws Exception {
        String[] strecke = {"5","10"};
        String[] zeit5 = {"20", "25", "30", "35"};
        String[] zeit10 = {"40", "45", "50", "55", "60"};
        // Test of method dauerGrundausdauer
        int[] test2Zeiten5 = {51,19,19,0};
        for(int m = 0; m<zeit5.length; m++){
            assertEquals(test2Zeiten5[m], trainingDauer.dauerGrundausdauer(strecke[0], zeit5[m]));
        }
        int[] test2Zeiten10 = {91,41,39,35,0};
        for(int m = 0; m<zeit10.length; m++){
            assertEquals(test2Zeiten10[m], trainingDauer.dauerGrundausdauer(strecke[1], zeit10[m]));
        }
    }

    @Test
    public void dauerGuteAausdauer() throws Exception {
        String[] strecke = {"5","10"};
        String[] zeit5 = {"20", "25", "30", "35"};
        String[] zeit10 = {"40", "45", "50", "55", "60"};
        // Test of method dauerGuteAausdauer
        int[] test3Zeiten5 = {32,19,0,0};
        for(int m = 0; m<zeit5.length; m++){
            assertEquals(test3Zeiten5[m], trainingDauer.dauerGuteAausdauer(strecke[0], zeit5[m]));
        }
        int[] test3Zeiten10 = {52,41,0,0,0};
        for(int m = 0; m<zeit10.length; m++){
            assertEquals(test3Zeiten10[m], trainingDauer.dauerGuteAausdauer(strecke[1], zeit10[m]));
        }
    }

    @Test
    public void printDauer() throws Exception {

    }

}