package de.beuth;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Section;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


/** 
* de.beuth.TrainingSelection Tester.
* 
* @author <Authors name> 
* @since <pre>Jan 9, 2017</pre> 
* @version 1.0 
*/ 
public class TrainingSelectionTest {
    TrainingSelection trainingSelection;
   @Before
public void before() throws Exception {
    trainingSelection = new TrainingSelection();
} 

@After
public void after() throws Exception {
       trainingSelection = null;
} 

/** 
* 
* Method: selectTraining(String strecke, String zeit, String stand, String aufwand, Section doc) 
* 
*/ 
@Test
public void testSelectTraining() throws Exception {
//TODO: Test goes here...
    // Test just for the method selectTraining, because this method is the only one with a return value in the Class TrainingSelection
    String[] level = {"untrainiert", "grundausdauer", "gut trainiert"};
    Chapter ChaTest = new Chapter("Test",1);
    Paragraph ParTest = new Paragraph("TestPar");
    Section SecTest = ChaTest.addSection(ParTest);
    boolean testCase = false;
    // Test with 5km
    for (int m = 20; m <= 35; m=m+5){
        for (int i = 0; i < level.length ; i++){
            testCase = trainingSelection.selectTraining("5", Integer.toString(m), level[i], "1", SecTest);
            if ((i == 1 && m == 35) || (i == 2 && m == 35) || (i == 2 && m == 30)){
                assertEquals(false, testCase );
            }else{
                assertEquals(true, testCase );
            }
        }
    }
    // Test with 10km
    for (int m = 40; m <= 60; m=m+5){
        for (int i = 0; i < level.length ; i++){
            testCase = trainingSelection.selectTraining("10", Integer.toString(m), level[i], "1", SecTest);
            if ((i == 1 && m == 60) || (i == 2 && m == 60) || (i == 2 && m == 55) || (i == 2 && m == 50)){
                assertEquals(false, testCase);
            }else{
                assertEquals(true, testCase);
            }
        }
    }
}

/** 
* 
* Method: selectionUntrainirt(String strecke, String Zeit, Section doc) 
* 
*/ 
@Test
public void testSelectionUntrainirt() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: selectionGrundausdauer(String strecke, String Zeit, Section doc) 
* 
*/ 
@Test
public void testSelectionGrundausdauer() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: selectionGuteAausdauer(String strecke, String Zeit, Section doc) 
* 
*/ 
@Test
public void testSelectionGuteAausdauer() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: addEmptyLine(Paragraph paragraph, int number) 
* 
*/ 
@Test
public void testAddEmptyLine() throws Exception { 
//TODO: Test goes here... 
} 


} 
