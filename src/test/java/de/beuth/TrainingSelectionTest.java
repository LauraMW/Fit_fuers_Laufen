package de.beuth;
import static org.junit.Assert.assertEquals;

import com.itextpdf.text.Chapter;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Section;
import de.beuth.TrainingSelection;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

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
} 

/** 
* 
* Method: selectTraining(String strecke, String zeit, String stand, String aufwand, Section doc) 
* 
*/ 
@Test
public void testSelectTraining() throws Exception { 
//TODO: Test goes here...
    Chapter testCh = new Chapter(new Paragraph("TestChPar"),1);
    Section test = testCh.addSection("TestChSec");
    String[]Zustand= {"untrainiert","grundausdauer","gut trainiert"};
    for (int min= 20;min<=35;min=+5){
        for (int i=0; i<Zustand.length;i++){
            if ((min==35 && Zustand[i]=="grundausdauer")||(min==35 && Zustand[i]=="gut trainiert")||(min==30 && Zustand[i]=="gut trainiert")){
                assertEquals(false, trainingSelection.selectTraining("5", Integer.toString(min), Zustand[i], "1", test));
            }
             else{
                assertEquals(true, trainingSelection.selectTraining("5", Integer.toString(min), Zustand[i], "1", test));
            }
            }

    }
    for (int min= 40;min<=60;min=+5){
        for (int i=0; i<Zustand.length;i++){
            if ((min==60 && Zustand[i]=="grundausdauer")||(min==60 && Zustand[i]=="gut trainiert")||(min==50 && Zustand[i]=="gut trainiert")||(min==55 && Zustand[i]=="gut trainiert")){
                assertEquals(false, trainingSelection.selectTraining("10", Integer.toString(min), Zustand[i], "1", test));

            }
            else{
                assertEquals(true, trainingSelection.selectTraining("10", Integer.toString(min), Zustand[i], "1", test));
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
