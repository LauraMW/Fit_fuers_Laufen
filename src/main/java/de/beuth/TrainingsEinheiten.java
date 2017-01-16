package de.beuth;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Section;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;


/**
 * The type Trainings einheiten.
 */
public class TrainingsEinheiten {

    /**
     * Create table 5 km 35 min.
     *
     * @param subPart the sub part
     * @throws BadElementException the bad element exception
     */
    public void createTable5km35min(Section subPart) throws BadElementException{
    	
    	PdfPTable table = new PdfPTable(2);    	    	
        PdfPCell c1 = new PdfPCell(new Phrase("Trainingseinheit"));
        c1.setHorizontalAlignment(Element.ALIGN_LEFT);
        table.addCell(c1);
        c1 = new PdfPCell(new Phrase("Beschreibung"));
        c1.setHorizontalAlignment(Element.ALIGN_LEFT);
        table.addCell(c1);

             
        table.setHeaderRows(1);
        
        table.addCell("Trainingseinheit 1");
        table.addCell("Ruhiger Dauerlauf 3 x 10 min mit je 1:30 min Gehpause");
        table.addCell("Trainingseinheit 2");
        table.addCell("Langsamer Dauerlauf Zeit: 20 min");
        table.addCell("Trainingseinheit 3");
        table.addCell("Ruhiger Dauerlauf 3 x 10 min mit je 1:30 min Gehpause");
        table.addCell("Trainingseinheit 4");
        table.addCell("Ruhiger Dauerlauf 2 x 15 min mit je 1:30 min Gehpause");
        table.addCell("Trainingseinheit 5");
        table.addCell("Langsamer Dauerlauf Zeit: 25 min");
        table.addCell("Trainingseinheit 6");
        table.addCell("Ruhiger Dauerlauf 2 x 15 min mit je 1:30 min Gehpause");
        table.addCell("Trainingseinheit 7");
        table.addCell("Ruhiger Dauerlauf 3 x 12 min mit je 1:30 min Gehpause");
        table.addCell("Trainingseinheit 8");
        table.addCell("Langsamer Dauerlauf Zeit: 30 min, anschlie�end 3 Steigerungen");
        table.addCell("Trainingseinheit 9");
        table.addCell("Ruhiger Dauerlauf 3 x 12 min mit je 1:30 min Gehpause");
        table.addCell("Trainingseinheit 10");
        table.addCell("Langsamer Dauerlauf Zeit: 30 min");
        table.addCell("Trainingseinheit 11");
        table.addCell("Ruhiger Dauerlauf Zeit: 20 min");
        table.addCell("Trainingseinheit 12");
        table.addCell("Langsamer Dauerlauf Zeit: 35 min");
        table.addCell("Trainingseinheit 13");
        table.addCell("Ruhiger Dauerlauf Zeit: 30 min");
        table.addCell("Trainingseinheit 14");
        table.addCell("Intervall-Training Einlaufen Zeit: 10 min, Tempol�ufe 4 x 2 min z�gig laufen mit je 2 min Trabpause, Auslaufen Zeit: 10 min");
        table.addCell("Trainingseinheit 15");
        table.addCell("Langsamer Dauerlauf Zeit: 40 min");
        table.addCell("Trainingseinheit 16");
        table.addCell("Ruhiger Dauerlauf Zeit: 30 min");
        table.addCell("Trainingseinheit 17");
        table.addCell("Intervall-Training Einlaufen, Zeit: 10 min, Tempol�ufe, 5 x 2 min z�gig laufen mit je 2 min Trabpause, Auslaufen, Zeit: 10 min");
        table.addCell("Trainingseinheit 18");
        table.addCell("Langsamer Dauerlauf Zeit: 50 min");
        table.addCell("Trainingseinheit 19");
        table.addCell("Ruhiger Dauerlauf Zeit: 30 min");
        table.addCell("Trainingseinheit 20");
        table.addCell("Intervall-Training Einlaufen, Zeit: 10 min, 6 x 1:30 min schnell laufen mit je 2 min Trabpause, Auslaufen, Zeit: 10 min");
        table.addCell("Trainingseinheit 21");
        table.addCell("Langsamer Dauerlauf Zeit: 55 min");
        table.addCell("Trainingseinheit 22");
        table.addCell("Intervall-Training Einlaufen, Zeit: 10 min, 3 x 3 min z�gig laufen mit je 2 min Trabpause, Auslaufen, Zeit: 10 min");
        table.addCell("Trainingseinheit 23");
        table.addCell("Langsamer Dauerlauf Zeit: 20 min, anschlie�end 3, Steigerungen");
        table.addCell("WETTKAMPF");
        table.addCell("Wettkampf 5-km-Renntempo 5-km-Lauf");
        subPart.add(table);
    }

    /**
     * Create table 5 km 30 min.
     *
     * @param subPart the sub part
     * @throws BadElementException the bad element exception
     */
    public void createTable5km30min(Section subPart) throws BadElementException{
	
	PdfPTable table = new PdfPTable(2);

    PdfPCell c1 = new PdfPCell(new Phrase("Trainingseinheit"));
    c1.setHorizontalAlignment(Element.ALIGN_LEFT);
    table.addCell(c1);

    c1 = new PdfPCell(new Phrase("Beschreibung"));
    c1.setHorizontalAlignment(Element.ALIGN_LEFT);
    table.addCell(c1);

         
    table.setHeaderRows(1);
    
    table.addCell("Trainingseinheit 1");
    table.addCell("Ruhiger Dauerlauf Zeit: 20 min");    
    table.addCell("Trainingseinheit 2");
    table.addCell("Langsamer Dauerlauf Zeit: 30 min");    
    table.addCell("Trainingseinheit 3");
    table.addCell("Intervall-Training Einlaufen, Tempol�ufe, 3 x 3 min schnell mit 2 min Trabpause, Auslaufen, Zeit: 5 min");    
    table.addCell("Trainingseinheit 4");
    table.addCell("Langsamer Dauerlauf Zeit: 30 min");    
    table.addCell("Trainingseinheit 5");
    table.addCell("Intervall-Training Einlaufen Zeit: 5 min, Tempol�ufe 5 x 1 min schnell mit 90 sek Trabpause, Auslaufen Zeit: 5 min");    
    table.addCell("Trainingseinheit 6");
    table.addCell("Langsamer Dauerlauf Zeit: 40 min");    
    table.addCell("Trainingseinheit 7");
    table.addCell("Ruhiger Dauerlauf Zeit: 30 min, 3x Steigerungen");    
    table.addCell("Trainingseinheit 8");
    table.addCell("Ruhiger Dauerlauf Zeit: 25 min, 3x Steigerungen");    
    table.addCell("Trainingseinheit 9");
    table.addCell("Z�giger Dauerlauf Einlaufen Zeit: 5 min, Z�giger Dauerlauf Zeit: 15 min, Auslaufen Zeit: 5 min");    
    table.addCell("Trainingseinheit 10");
    table.addCell("Ruhiger Dauerlauf Zeit: 40 min");    
    table.addCell("Trainingseinheit 11");
    table.addCell("Ruhiger Dauerlauf Zeit: 30 min");    
    table.addCell("Trainingseinheit 12");
    table.addCell("Intervall-Training Einlaufen Zeit: 5 min, Tempol�ufe 4 x 3 min schnell mit 3 min Trabpause, Auslaufen Zeit: 5 min");    
    table.addCell("Trainingseinheit 13");
    table.addCell("Ruhiger Dauerlauf Zeit: 40 min");    
    table.addCell("Trainingseinheit 14");
    table.addCell("Intervall-Training Einlaufen Zeit: 5 min, Tempol�ufe 7 x 1 min schnell mit 90 sek Trabpause, Auslaufen Zeit: 5 min");    
    table.addCell("Trainingseinheit 15");
    table.addCell("Langsamer Dauerlauf Zeit: 40 min");    
    table.addCell("Trainingseinheit 16");
    table.addCell("Intervall-Training Einlaufen Zeit: 5 min, Tempol�ufe 3 x 4 min schnell mit 2 min Trabpause, Auslaufen Zeit: 5 min");    
    table.addCell("Trainingseinheit 17");
    table.addCell("Langsamer Dauerlauf Zeit: 30 min");    
    table.addCell("Trainingseinheit 18");
    table.addCell("Intervall-Training Einlaufen Zeit: 5 min, Tempol�ufe 3 x 3 min schnell mit 2 min Trabpause, Auslaufen Zeit: 5 min");    
    table.addCell("Trainingseinheit 19");
    table.addCell("Langsamer Dauerlauf Zeit: 15 min, anschlie�end 3 Steigerungen");    
    table.addCell("WETTKAMPF");
    table.addCell("Wettkampf: Einlaufen Zeit: 10 min, Wettkampf Dist: 5 km, Auslaufen Zeit: 5 min");    
    subPart.add(table);
	}

    /**
     * Create table 5 km 25 min.
     *
     * @param subPart the sub part
     * @throws BadElementException the bad element exception
     */
    public void createTable5km25min(Section subPart) throws BadElementException{
	
	PdfPTable table = new PdfPTable(2);

    PdfPCell c1 = new PdfPCell(new Phrase("Trainingseinheit"));
    c1.setHorizontalAlignment(Element.ALIGN_LEFT);
    table.addCell(c1);

    c1 = new PdfPCell(new Phrase("Beschreibung"));
    c1.setHorizontalAlignment(Element.ALIGN_LEFT);
    table.addCell(c1);

         
    table.setHeaderRows(1);
    
    table.addCell("Trainingseinheit 1");
    table.addCell("Ruhiger Dauerlauf Zeit: 40 min");    
    table.addCell("Trainingseinheit 2");
    table.addCell("Langsamer Dauerlauf Zeit: 60 min");    
    table.addCell("Trainingseinheit 3");
    table.addCell("Intervall-Training Einlaufen Zeit: 10 min, Tempoläufe 6 x 3 min schnell mit je 2 min Trabpause, Auslaufen Zeit: 5 min");
    table.addCell("Trainingseinheit 4");
    table.addCell("Langsamer Dauerlauf Zeit: 60 min");    
    table.addCell("Trainingseinheit 5");
    table.addCell("Intervall-Training Einlaufen Zeit: 10 min, 12 x 1 min schnell mit je 90 sek Trabpause, Auslaufen Zeit: 10 min");    
    table.addCell("Trainingseinheit 6");
    table.addCell("Langsamer Dauerlauf Zeit: 50 min");    
    table.addCell("Trainingseinheit 7");
    table.addCell("Ruhiger Dauerlauf Zeit: 30 min, anschließend 3 Steigerungen");
    table.addCell("Trainingseinheit 8");
    table.addCell("Ruhiger Dauerlauf Zeit: 35 min, anschließend 3 Steigerungen");
    table.addCell("Trainingseinheit 9");
    table.addCell("Zügiger Dauerlauf Einlaufen Zeit: 10 min, Zügiger Dauerlauf Zeit: 30 min Auslaufen, Zeit: 10 min");
    table.addCell("Trainingseinheit 10");
    table.addCell("Ruhiger Dauerlauf Zeit: 40 min");    
    table.addCell("Trainingseinheit 11");
    table.addCell("Ruhiger Dauerlauf Zeit: 30 min");    
    table.addCell("Trainingseinheit 12");
    table.addCell("Intervall-Training Einlaufen Zeit: 10 min, Tempoläufe 7 x 3 min schnell mit je 3 min Trabpause, Auslaufen  Zeit: 10 min");
    table.addCell("Trainingseinheit 13");
    table.addCell("Ruhiger Dauerlauf Zeit: 60 min");    
    table.addCell("Trainingseinheit 14");
    table.addCell("Intervall-Training Einlaufen Zeit: 10 min, Tempoläufe 10 x 90 sek schnell mit je 90 sek Trabpause, Auslaufen Zeit: 10 min");
    table.addCell("Trainingseinheit 15");
    table.addCell("Langsamer Dauerlauf Zeit: 60 min");    
    table.addCell("Trainingseinheit 16");
    table.addCell("Intervall-Training Einlaufen Zeit: 10 min, Tempoläufe 5 x 4 min schnell mit je 2 min Trabpause, Auslaufen Zeit: 10 min");
    table.addCell("Trainingseinheit 17");
    table.addCell("Langsamer Dauerlauf Zeit: 60 min");    
    table.addCell("Trainingseinheit 18");
    table.addCell("Intervall-Training Einlaufen Zeit: 10 min, Tempoläufe 4 x 3 min schnell mit je 2 min Trabpause, Auslaufen Zeit: 5 min");
    table.addCell("Trainingseinheit 19");
    table.addCell("Langsamer Dauerlauf Zeit: 15 min, anschließend 3 Steigerungen");
    table.addCell("WETTKAMPF");
    table.addCell("Wettkampf Einlaufen Zeit: 10 min, Wettkampf Dist: 5 km, Auslaufen Zeit: 10 min");    
    subPart.add(table);
	}

    /**
     * Create table 5 km 20 min.
     *
     * @param subPart the sub part
     * @throws BadElementException the bad element exception
     */
    public void createTable5km20min(Section subPart) throws BadElementException{
	
	PdfPTable table = new PdfPTable(2);

    PdfPCell c1 = new PdfPCell(new Phrase("Trainingseinheit"));
    c1.setHorizontalAlignment(Element.ALIGN_LEFT);
    table.addCell(c1);

    c1 = new PdfPCell(new Phrase("Beschreibung"));
    c1.setHorizontalAlignment(Element.ALIGN_LEFT);
    table.addCell(c1);

         
    table.setHeaderRows(1);
    
    table.addCell("Trainingseinheit 1");
    table.addCell("Ruhiger Dauerlauf Zeit: 40 min");    
    table.addCell("Trainingseinheit 2");
    table.addCell("Intervall-Training Einlaufen Zeit: 10 min, Tempoläufe 7 x 400 m schnell mit 90 sek Trabpause, Auslaufen  Zeit: 10 min");
    table.addCell("Trainingseinheit 3");
    table.addCell("Ruhiger Dauerlauf Zeit: 40 min");    
    table.addCell("Trainingseinheit 4");
    table.addCell("Langsamer Dauerlauf Zeit: 60 min");    
    table.addCell("Trainingseinheit 5");
    table.addCell("Intervall-Training Einlaufen Zeit: 10 min, Tempoläufe 8 x 3 min schnell mit 2 min Trabpause, Auslaufen Zeit: 10 min");
    table.addCell("Trainingseinheit 6");
    table.addCell("Ruhiger Dauerlauf Zeit: 40 min");    
    table.addCell("Trainingseinheit 7");
    table.addCell("Fahrtspiel Einlaufen Zeit: 10 min, Fahrtspiel Zeit: 30 min, Auslaufen Zeit: 10 min");    
    table.addCell("Trainingseinheit 8");
    table.addCell("Langsamer Dauerlauf Zeit: 60 min");    
    table.addCell("Trainingseinheit 9");
    table.addCell("Ruhiger Dauerlauf Zeit: 40 min");    
    table.addCell("Trainingseinheit 10");
    table.addCell("Intervall-Training Einlaufen Zeit: 10 min, Tempoläufe 10 x 400 m schnell mit 90 sek Trabpause, Auslaufen Zeit: 10 min");
    table.addCell("Trainingseinheit 11");
    table.addCell("Ruhiger Dauerlauf Zeit: 40 min");    
    table.addCell("Trainingseinheit 12");
    table.addCell("Zügiger Dauerlauf: Einlaufen, Zügiger Dauerlauf: sehr zügig Zeit: 30 min, Auslaufen Zeit: 10 min");
    table.addCell("Trainingseinheit 13");
    table.addCell("Ruhiger Dauerlauf Zeit: 40 min");    
    table.addCell("Trainingseinheit 14");
    table.addCell("Intervall-Training: Einlaufen Zeit: 10 min,Tempoläufe 5 x 4 min schnell mit 2 min Trabpause, Auslaufen Zeit: 10 min");
    table.addCell("Trainingseinheit 15");
    table.addCell("Ruhiger Dauerlauf Zeit: 40 min");    
    table.addCell("Trainingseinheit 16");
    table.addCell("Langsamer Dauerlauf Zeit: 60 min, anschließend 5 Steigerungen");
    table.addCell("Trainingseinheit 17");
    table.addCell("Ruhiger Dauerlauf Zeit: 40 min");    
    table.addCell("Trainingseinheit 18");
    table.addCell("Intervall-Training Einlaufen Zeit: 10 min, Tempoläufe 10 x 500 m schnell mit 90 sek Trabpause, Auslaufen Zeit: 10 min");
    table.addCell("Trainingseinheit 19");
    table.addCell("Ruhetag (Alternativ-Training)");    
    table.addCell("Trainingseinheit 20");
    table.addCell("Ruhiger Dauerlauf Zeit: 45 min");    
    table.addCell("Trainingseinheit 21");
    table.addCell("Langsamer Dauerlauf Zeit: 60 min");    
    table.addCell("Trainingseinheit 22");
    table.addCell("Intervall-Training Einlaufen Zeit: 10 min, Tempoläufe 5 x 1000 m schnell mit 2 min Trabpause, Auslaufen Zeit: 10 min");
    table.addCell("Trainingseinheit 23");
    table.addCell("Ruhiger Dauerlauf Zeit: 35 min");    
    table.addCell("Trainingseinheit 24");
    table.addCell("Zügiger Dauerlauf Einlaufen Zeit: 10 min, Zügiger Dauerlauf 2 x 10 min sehr zügig mit 5 min Trabpause, Auslaufen Zeit: 10 min");
    table.addCell("Trainingseinheit 25");
    table.addCell("Langsamer Dauerlauf Zeit: 50 min");    
    table.addCell("Trainingseinheit 26");
    table.addCell("Intervall-Training Einlaufen Zeit: 10 min, Tempoläufe 10 x 200 m sehr schnell mit 1 min Gehpause, Auslaufen Zeit: 10 min");
    table.addCell("Trainingseinheit 27");
    table.addCell("Langsamer Dauerlauf Zeit: 40 min");    
    table.addCell("Trainingseinheit 28");
    table.addCell("Fahrtspiel Einlaufen Zeit: 10 min, Fahrtspiel Zeit: 40 min, Auslaufen Zeit: 10 min");
    table.addCell("Trainingseinheit 29");
    table.addCell("Ruhiger Dauerlauf Zeit: 30 min");    
    table.addCell("Trainingseinheit 30");
    table.addCell("Intervall-Training Einlaufen Zeit: 10 min, Tempoläufe 3 x 4 min schnell mit 2 min Trabpause, Auslaufen Zeit: 10 min");
    table.addCell("Trainingseinheit 31");
    table.addCell("Ruhiger Dauerlauf Zeit: 20 min");
    table.addCell("Trainingseinheit 32");
    table.addCell("Langsamer Dauerlauf Zeit: 10 min, anschließend 3 bis 5 Steigerungen");
    table.addCell("WETTKAMPF");
    table.addCell("Wettkampf Einlaufen Zeit: 10 min, Wettkampf Dist: 5 km, Auslaufen Zeit: 10 min");
    subPart.add(table);
	}

    /**
     * Create table 10 km 60 min.
     *
     * @param subPart the sub part
     * @throws BadElementException the bad element exception
     */
    public void createTable10km60min(Section subPart) throws BadElementException{
	
	PdfPTable table = new PdfPTable(2);

    PdfPCell c1 = new PdfPCell(new Phrase("Trainingseinheit"));
    c1.setHorizontalAlignment(Element.ALIGN_LEFT);
    table.addCell(c1);

    c1 = new PdfPCell(new Phrase("Beschreibung"));
    c1.setHorizontalAlignment(Element.ALIGN_LEFT);
    table.addCell(c1);

         
    table.setHeaderRows(1);
    
    table.addCell("Trainingseinheit 1");
    table.addCell("Fahrtspiel Einlaufen Zeit: 10 min,Fahrtspiel Zeit: 15 min, Auslaufen Zeit: 10 min");    
    table.addCell("Trainingseinheit 2");
    table.addCell("Langsamer Dauerlauf Zeit: 50 min");    
    table.addCell("Trainingseinheit 3");
    table.addCell("Ruhiger Dauerlauf Zeit: 40 min");    
    table.addCell("Trainingseinheit 4");
    table.addCell("Zügiger Dauerlauf Einlaufen Zeit: 10 min, Zügiger Dauerlauf Zeit: 20 min, Auslaufen Zeit: 10 min");
    table.addCell("Trainingseinheit 5");
    table.addCell("Langsamer Dauerlauf Zeit: 60 min");    
    table.addCell("Trainingseinheit 6");
    table.addCell("Ruhiger Dauerlauf Zeit: 40 min anschließend 3 Steigerungen");
    table.addCell("Trainingseinheit 7");
    table.addCell("Fahrtspiel Einlaufen Zeit: 10 min, Fahrtspiel Zeit: 18 min, Auslaufen Zeit: 10 min");    
    table.addCell("Trainingseinheit 8");
    table.addCell("Langsamer Dauerlauf Zeit: 60 min");    
    table.addCell("Trainingseinheit 9");
    table.addCell("Ruhiger Dauerlauf Zeit: 40 min");    
    table.addCell("Trainingseinheit 10");
    table.addCell("Fahrtspiel Einlaufen Zeit: 10 min, Fahrtspiel Zeit: 20 min, Auslaufen Zeit: 10 min");    
    table.addCell("Trainingseinheit 11");
    table.addCell("Langsamer Dauerlauf Zeit: 60 min");    
    table.addCell("Trainingseinheit 12");
    table.addCell("Ruhiger Dauerlauf Zeit: 45 min");    
    table.addCell("Trainingseinheit 13");
    table.addCell("Ruhiger Dauerlauf Zeit: 50 min, anschließend 3 Steigerungen");
    table.addCell("Trainingseinheit 14");
    table.addCell("Langsamer Dauerlauf Zeit: 70 min");    
    table.addCell("Trainingseinheit 15");
    table.addCell("Ruhiger Dauerlauf Zeit: 30 min");    
    table.addCell("Trainingseinheit 16");
    table.addCell("Fahrtspiel Einlaufen, Zeit: 10 min, Fahrtspiel Zeit: 22 min, Auslaufen Zeit: 10 min");    
    table.addCell("Trainingseinheit 17");
    table.addCell("Langsamer Dauerlauf Zeit: 60 min");    
    table.addCell("Trainingseinheit 18");
    table.addCell("Ruhiger Dauerlauf Zeit: 40 min");    
    table.addCell("Trainingseinheit 19");
    table.addCell("Fahrtspiel Einlaufen Zeit: 10 min, Fahrtspiel Zeit: 25 min, Auslaufen Zeit: 10 min");    
    table.addCell("Trainingseinheit 20");
    table.addCell("Langsamer Dauerlauf Zeit: 60 min");    
    table.addCell("Trainingseinheit 21");
    table.addCell("Ruhiger Dauerlauf Zeit: 30 min, anschließend 3 Steigerungen");
    table.addCell("Trainingseinheit 22");
    table.addCell("Ruhiger Dauerlauf Zeit: 40 min");    
    table.addCell("Trainingseinheit 23");
    table.addCell("Ruhiger Dauerlauf Zeit: 40 min");    
    table.addCell("Trainingseinheit 24");
    table.addCell("Fahrtspiel Einlaufen Zeit: 10 min, Fahrtspiel Zeit: 20 min, Auslaufen Zeit: 10 min");    
    table.addCell("Trainingseinheit 25");
    table.addCell("Ruhiger Dauerlauf Zeit: 40 min");    
    table.addCell("Trainingseinheit 26");
    table.addCell("Fahrtspiel Einlaufen Zeit: 10 min, Fahrtspiel Zeit: 25 min, Auslaufen Zeit: 10 min");    
    table.addCell("Trainingseinheit 27");
    table.addCell("Langsamer Dauerlauf Zeit: 60 min, anschließend 3 Steigerungen");
    table.addCell("Trainingseinheit 28");
    table.addCell("Fahrtspiel Einlaufen Zeit: 10 min, Fahrtspiel Zeit: 15 min, Auslaufen Zeit: 10 min");
    table.addCell("Trainingseinheit 29");
    table.addCell("Langsamer Dauerlauf Zeit: 50 min");    
    table.addCell("Trainingseinheit 30");
    table.addCell("Intervall-Training Einlaufen Zeit: 10 min, Tempoläufe 3 x 4 min schnell mit je 2 min Trabpause, Auslaufen Zeit: 5 min");
    table.addCell("Trainingseinheit 31");
    table.addCell("Langsamer Dauerlauf Zeit: 15 min anschließend 3 Steigerungen");
    table.addCell("WETTKAMPF");
    table.addCell("Wettkampf Einlaufen Zeit: 15 min, Wettkampf Dist: 10 km, Auslaufen Zeit: 15 min");
    subPart.add(table);
	}

    /**
     * Create table 10 km 55 min.
     *
     * @param subPart the sub part
     * @throws BadElementException the bad element exception
     */
    public void createTable10km55min(Section subPart) throws BadElementException{

	
	PdfPTable table = new PdfPTable(2);

    PdfPCell c1 = new PdfPCell(new Phrase("Trainingseinheit"));
    c1.setHorizontalAlignment(Element.ALIGN_LEFT);
    table.addCell(c1);

    c1 = new PdfPCell(new Phrase("Beschreibung"));
    c1.setHorizontalAlignment(Element.ALIGN_LEFT);
    table.addCell(c1);

         
    table.setHeaderRows(1);
    
    table.addCell("Trainingseinheit 1");
    table.addCell("Intervall-Training Einlaufen Zeit: 10 min, Tempoläufe 5 x 5 min schnell mit 2:30 min Trabpause, Auslaufen Zeit: 10 min");
    table.addCell("Trainingseinheit 2");
    table.addCell("Langsamer Dauerlauf Zeit: 70 min");    
    table.addCell("Trainingseinheit 3");
    table.addCell("Langsamer Dauerlauf Zeit: 70 min");    
    table.addCell("Trainingseinheit 4");
    table.addCell("Intervall-Training Einlaufen Zeit: 10 min, Tempoläufe 3 x 10 min schnell mit 5:00 Trabpause, Auslaufen Zeit: 10 min");
    table.addCell("Trainingseinheit 5");
    table.addCell("Langsamer Dauerlauf Zeit: 70 min, anschließend 3  Steigerungen");
    table.addCell("Trainingseinheit 6");
    table.addCell("Ruhiger Dauerlauf Zeit: 40 min");    
    table.addCell("Trainingseinheit 7");
    table.addCell("Intervall-Training Einlaufen Zeit: 10 min, Tempoläufe 6 x 5 min schnell mit 2:30 min Trabpause, Auslaufen Zeit: 10 min");
    table.addCell("Trainingseinheit 8");
    table.addCell("Langsamer Dauerlauf Zeit: 70 min, anschließend 3 Steigerungen");
    table.addCell("Trainingseinheit 9");
    table.addCell("Ruhiger Dauerlauf Zeit: 40 min");    
    table.addCell("Trainingseinheit 10");
    table.addCell("Fahrtspiel Einlaufen Zeit: 10 min, Fahrtspiel Zeit: 25 min, Auslaufen Zeit: 10 min");    
    table.addCell("Trainingseinheit 11");
    table.addCell("Langsamer Dauerlauf Zeit: 80 min");    
    table.addCell("Trainingseinheit 12");
    table.addCell("Ruhiger Dauerlauf Zeit: 30 min, anschließend 3 Steigerungen");
    table.addCell("Trainingseinheit 13");
    table.addCell("Ruhiger Dauerlauf Zeit: 50 min, anschließend 3 Steigerungen");
    table.addCell("Trainingseinheit 14");
    table.addCell("Langsamer Dauerlauf Zeit: 60 min");    
    table.addCell("Trainingseinheit 15");
    table.addCell("Ruhiger Dauerlauf Zeit: 40 min");    
    table.addCell("Trainingseinheit 16");
    table.addCell("Fahrtspiel Einlaufen Zeit: 10 min, Fahrtspiel Zeit: 30 min, Auslaufen Zeit: 10 min");    
    table.addCell("Trainingseinheit 17");
    table.addCell("Langsamer Dauerlauf Zeit: 80 min");    
    table.addCell("Trainingseinheit 18");
    table.addCell("Ruhiger Dauerlauf Zeit: 40 min");    
    table.addCell("Trainingseinheit 19");
    table.addCell("Intervall-Training Einlaufen Zeit: 10 min, Tempoläufe 10 x 90 sek schnell mit 90 sek Trabpause, Auslaufen Zeit: 10 min");
    table.addCell("Trainingseinheit 20");
    table.addCell("Langsamer Dauerlauf Zeit: 70 min");    
    table.addCell("Trainingseinheit 21");
    table.addCell("Ruhiger Dauerlauf Zeit: 40 min, anschließend 5 Steigerungen");
    table.addCell("Trainingseinheit 22");
    table.addCell("Ruhiger Dauerlauf Zeit: 40 min, anschließend 5 Steigerungen");
    table.addCell("Trainingseinheit 23");
    table.addCell("Langsamer Dauerlauf Zeit: 20 min");    
    table.addCell("Trainingseinheit 24");
    table.addCell("Wettkampf Einlaufen Zeit: 15 min, Testlauf über 5 oder 10 km Wettkampf, Auslaufen Zeit: 15 min");
    table.addCell("Trainingseinheit 25");
    table.addCell("Ruhiger Dauerlauf Zeit: 50 min");    
    table.addCell("Trainingseinheit 26");
    table.addCell("Ruhiger Dauerlauf Zeit: 50 min");    
    table.addCell("Trainingseinheit 27");
    table.addCell("Intervall-Training Einlaufen Zeit: 10 min, Tempoläufe 5 x 5 min schnell mit 3 min Pause, Auslaufen Zeit: 10 min");
    table.addCell("Trainingseinheit 28");
    table.addCell("Ruhiger Dauerlauf Zeit: 50 min");
    table.addCell("Trainingseinheit 29");
    table.addCell("Intervall-Training Einlaufen Zeit: 10 min, Tempoläufe 10 x 90 sek schnell mit 3 min Trabpause, Auslaufen Zeit: 10 min");
    table.addCell("Trainingseinheit 30");
    table.addCell("Langsamer Dauerlauf Zeit: 60 min, anschließend 5 Steigerungen");
    table.addCell("Trainingseinheit 31");
    table.addCell("Fahrtspiel Einlaufen Zeit: 10 min, Fahrtspiel Zeit: 30 min, Auslaufen Zeit: 10 min");    
    table.addCell("Trainingseinheit 32");
    table.addCell("Langsamer Dauerlauf Zeit: 50 min");    
    table.addCell("Trainingseinheit 33");
    table.addCell("Ruhiger Dauerlauf Zeit: 35 min, anschließend 3 Steigerungen");
    table.addCell("Trainingseinheit 34");
    table.addCell("Intervall-Training Einlaufen Zeit: 10 min, Tempoläufe 3 x 5 min schnell mit 3 min Trabpause, Auslaufen Zeit: 10 min");
    table.addCell("Trainingseinheit 35");
    table.addCell("Langsamer Dauerlauf Zeit: 20 min");  
    table.addCell("WETTKAMPF");
    table.addCell("Wettkampf Einlaufen Zeit: 15 min, Wettkampf Dist: 10 km, Auslaufen Zeit: 10 min");
    subPart.add(table);
	}

    /**
     * Create table 10 km 50 min.
     *
     * @param subPart the sub part
     * @throws BadElementException the bad element exception
     */
    public void createTable10km50min(Section subPart) throws BadElementException{
	
	PdfPTable table = new PdfPTable(2);

    PdfPCell c1 = new PdfPCell(new Phrase("Trainingseinheit"));
    c1.setHorizontalAlignment(Element.ALIGN_LEFT);
    table.addCell(c1);

    c1 = new PdfPCell(new Phrase("Beschreibung"));
    c1.setHorizontalAlignment(Element.ALIGN_LEFT);
    table.addCell(c1);

         
    table.setHeaderRows(1);
    
    table.addCell("Trainingseinheit 1");
    table.addCell("Intervall-Training Einlaufen Zeit: 10 min, Tempoläufe 7 x 5 min schnell mit 3 min Trabpause, Auslaufen Zeit: 10 min");
    table.addCell("Trainingseinheit 2");
    table.addCell("Langsamer Dauerlauf Zeit: 80 min");    
    table.addCell("Trainingseinheit 3");
    table.addCell("Ruhiger Dauerlauf Zeit: 50 min");    
    table.addCell("Trainingseinheit 4");
    table.addCell("Ruhiger Dauerlauf Zeit: 40 min");    
    table.addCell("Trainingseinheit 5");
    table.addCell("Intervall-Training Einlaufen Zeit: 10 min, Tempoläufe 4 x 10 min schnell mit 5 min Trabpause, Auslaufen Zeit: 10 min");
    table.addCell("Trainingseinheit 6");
    table.addCell("Ruhiger Dauerlauf Zeit: 50 min");    
    table.addCell("Trainingseinheit 7");
    table.addCell("Langsamer Dauerlauf Zeit: 80 min");    
    table.addCell("Trainingseinheit 8");
    table.addCell("Intervall-Training Einlaufen Zeit: 10 min, Tempoläufe 8 min, 6 min, 4 min, 2 min schnell mit 4 min, 3 min, 2 min Trabpause, Auslaufen Zeit: 10 min");
    table.addCell("Trainingseinheit 9");
    table.addCell("Langsamer Dauerlauf Zeit: 70 min");    
    table.addCell("Trainingseinheit 10");
    table.addCell("Ruhiger Dauerlauf Zeit: 50 min");    
    table.addCell("Trainingseinheit 11");
    table.addCell("Lockerer Dauerlauf Zeit: 40 min");    
    table.addCell("Trainingseinheit 12");
    table.addCell("Intervall-Training Einlaufen Zeit: 10 min, Tempoläufe 7 x 5 min schnell mit 3 min Trabpause, Auslaufen Zeit: 10 min");
    table.addCell("Trainingseinheit 13");
    table.addCell("Ruhiger Dauerlauf Zeit: 50 min");    
    table.addCell("Trainingseinheit 14");
    table.addCell("Langsamer Dauerlauf Zeit: 80 min");    
    table.addCell("Trainingseinheit 15");
    table.addCell("Ruhiger Dauerlauf Zeit: 40 min");    
    table.addCell("Trainingseinheit 16");
    table.addCell("Langsamer Dauerlauf Zeit: 70 min");    
    table.addCell("Trainingseinheit 17");
    table.addCell("Ruhiger Dauerlauf Zeit: 50 min");    
    table.addCell("Trainingseinheit 18");
    table.addCell("Intervall-Training Einlaufen Zeit: 10 min, Tempoläufe 8 min, 6 min, 4 min, 2 min schnell mit 4 min, 3 min, 2 min Trabpause, Auslaufen Zeit: 10 min");
    table.addCell("Trainingseinheit 19");
    table.addCell("Langsamer Dauerlauf Zeit: 80 min");    
    table.addCell("Trainingseinheit 20");
    table.addCell("Ruhiger Dauerlauf Zeit: 35 min");    
    table.addCell("Trainingseinheit 21");
    table.addCell("Lockerer Dauerlauf Zeit: 40 min");    
    table.addCell("Trainingseinheit 22");
    table.addCell("Intervall-Training Einlaufen Zeit: 10 min, Tempoläufe 10 x 90 sek schnell mit 90 sek Trabpause, Auslaufen Zeit: 10 min");
    table.addCell("Trainingseinheit 23");
    table.addCell("Langsamer Dauerlauf Zeit: 70 min");    
    table.addCell("Trainingseinheit 24");
    table.addCell("Ruhiger Dauerlauf Zeit: 40 min, anschließend 5 Steigerungen");
    table.addCell("Trainingseinheit 25");
    table.addCell("Ruhiger Dauerlauf Zeit: 50 min");    
    table.addCell("Trainingseinheit 26");
    table.addCell("Langsamer Dauerlauf Zeit: 35 min, anschließend 5 Steigerungen");
    table.addCell("Trainingseinheit 27");
    table.addCell("Wettkampf Einlaufen Zeit: 10 min, 5 oder 10 km-Testlauf Wettkampf, Auslaufen Zeit: 10 min");    
    table.addCell("Trainingseinheit 28");
    table.addCell("Ruhiger Dauerlauf Zeit: 50 min");
    table.addCell("Trainingseinheit 29");
    table.addCell("Ruhiger Dauerlauf Zeit: 50 min");    
    table.addCell("Trainingseinheit 30");
    table.addCell("Intervall-Training Einlaufen Zeit: 10 min, Tempoläufe 7 x 5 min schnell mit 3 min Trabpause, Auslaufen Zeit: 10 min");
    table.addCell("Trainingseinheit 31");
    table.addCell("Ruhiger Dauerlauf Zeit: 50 min");   
    table.addCell("Trainingseinheit 32");
    table.addCell("Ruhiger Dauerlauf Zeit: 40 min");    
    table.addCell("Trainingseinheit 33");
    table.addCell("Intervall-Training Einlaufen Zeit: 10 min, Tempoläufe 10 x 90 sek mit 2 min Trabpause, Auslaufen Zeit: 10 min");
    table.addCell("Trainingseinheit 34");
    table.addCell("Langsamer Dauerlauf Zeit: 80 min anschließend 5 Steigerungen");
    table.addCell("Trainingseinheit 35");
    table.addCell("Intervall-Training Einlaufen Zeit: 10 min, Tempoläufe 8 x 4 min schnell mit 2 min Trabpause, Auslaufen Zeit: 10 min");
    table.addCell("Trainingseinheit 36");
    table.addCell("Langsamer Dauerlauf Zeit: 40 min");
    table.addCell("Trainingseinheit 37");
    table.addCell("Ruhiger Dauerlauf Zeit: 40 min, 5 Steigerungsläufe über 80 bis 100 m Steigerungen");
    table.addCell("Trainingseinheit 38");
    table.addCell("Intervall-Training Einlaufen Zeit: 10 min, Tempoläufe 3 x 5 min schnell mit 2 min Trabpause, Auslaufen Zeit: 10 min");
    table.addCell("Trainingseinheit 39");
    table.addCell("Langsamer Dauerlauf Zeit: 20 min");
    table.addCell("WETTKAMPF");
    table.addCell("Wettkampf Einlaufen Zeit: 15 min, Wettkampf Dist: 10 km, Auslaufen Zeit: 15 min");
    subPart.add(table);
	}

    /**
     * Create table 10 km 45 min.
     *
     * @param subPart the sub part
     * @throws BadElementException the bad element exception
     */
    public void createTable10km45min(Section subPart) throws BadElementException{
	
	PdfPTable table = new PdfPTable(2);

    PdfPCell c1 = new PdfPCell(new Phrase("Trainingseinheit"));
    c1.setHorizontalAlignment(Element.ALIGN_LEFT);
    table.addCell(c1);

    c1 = new PdfPCell(new Phrase("Beschreibung"));
    c1.setHorizontalAlignment(Element.ALIGN_LEFT);
    table.addCell(c1);

         
    table.setHeaderRows(1);
    
    table.addCell("Trainingseinheit 1");
    table.addCell("Intervall-Training Einlaufen Zeit: 15 min, Tempoläufe 7 x 3 min schnell mit 2 min Trabpause, Auslaufen Zeit: 15 min");
    table.addCell("Trainingseinheit 2");
    table.addCell("Ruhiger Dauerlauf Zeit: 50 min, anschließend 3 Steigerungen");
    table.addCell("Trainingseinheit 3");
    table.addCell("Zügiger Dauerlauf Einlaufen Zeit: 10 min, Zügiger Dauerlauf Zeit: 30 min, Auslaufen Zeit: 10 min");
    table.addCell("Trainingseinheit 4");
    table.addCell("Langsamer Dauerlauf Zeit: 70 min");    
    table.addCell("Trainingseinheit 5");
    table.addCell("Intervall-Training Einlaufen Zeit: 15 min, Tempoläufe 3 min schnell, 6 min schnell, 3 min schnell, 6 min schnell, 3 min schnell mit jeweils 2 bis 3 min Trabpause, Auslaufen Zeit: 15 min");
    table.addCell("Trainingseinheit 6");
    table.addCell("Ruhiger Dauerlauf Zeit: 60 min, anschließend 3 Steigerungen");
    table.addCell("Trainingseinheit 7");
    table.addCell("Zügiger Dauerlauf Einlaufen, Zeit: 10 min, Zügiger Dauerlauf 3 x 10 min sehr zügig mit 4 min Trabpause, Auslaufen Zeit: 10 min");
    table.addCell("Trainingseinheit 8");
    table.addCell("Langsamer Dauerlauf Zeit: 80 min");    
    table.addCell("Trainingseinheit 9");
    table.addCell("Intervall-Training Einlaufen Zeit: 10 min, Tempoläufe, 8 x 3 min schnell mit 2 min Trabpause, Auslaufen Zeit: 10 min");
    table.addCell("Trainingseinheit 10");
    table.addCell("Langsamer Dauerlauf Zeit: 80 min, anschließend 3 Steigerungen");
    table.addCell("Trainingseinheit 11");
    table.addCell("Zügiger Dauerlauf Einlaufen Zeit: 15 min, Zügiger Dauerlauf Zeit: 30 min Auslaufen Zeit: 15 min");
    table.addCell("Trainingseinheit 12");
    table.addCell("Ruhiger Dauerlauf Zeit: 50 min");    
    table.addCell("Trainingseinheit 13");
    table.addCell("Intervall-Training Einlaufen Zeit: 15 min, Tempoläufe 3 min schnell, 6 min schnell, 3 min schnell, 6 min schnell, 3 min schnell mit 2 bis 3 min Trabpause , Auslaufen Zeit: 15 min");
    table.addCell("Trainingseinheit 14");
    table.addCell("Langsamer Dauerlauf Zeit: 80 min");    
    table.addCell("Trainingseinheit 15");
    table.addCell("Intervall-Training Einlaufen Zeit: 10 min, Tempoläufe 3 x 12 min schnell mit 3 bis 4 min Trabpause, Auslaufen Zeit: 10 min");
    table.addCell("Trainingseinheit 16");
    table.addCell("Ruhiger Dauerlauf Zeit: 50 min");    
    table.addCell("Trainingseinheit 17");
    table.addCell("Ruhiger Dauerlauf Zeit: 50 min");    
    table.addCell("Trainingseinheit 18");
    table.addCell("Ruhiger Dauerlauf Zeit: 60 min, anschließend 3 Steigerungen");
    table.addCell("Trainingseinheit 19");
    table.addCell("Lockerer Dauerlauf Zeit: 40 min");    
    table.addCell("Trainingseinheit 20");
    table.addCell("Langsamer Dauerlauf Zeit: 80 min");    
    table.addCell("Trainingseinheit 21");
    table.addCell("Intervall-Training Einlaufen Zeit: 15 min, Tempoläufe 8 x 3 min schnell mit 2 min Trabpause, Auslaufen Zeit: 15 min");
    table.addCell("Trainingseinheit 22");
    table.addCell("Ruhiger Dauerlauf Zeit: 50 min anschließend 3 Steigerungen");
    table.addCell("Trainingseinheit 23");
    table.addCell("Zügiger Dauerlauf Einlaufen Zeit: 10 min, Zügiger Dauerlauf Zeit: 35 min, Auslaufen Zeit: 10 min");
    table.addCell("Trainingseinheit 24");
    table.addCell("Langsamer Dauerlauf Zeit: 80 min");    
    table.addCell("Trainingseinheit 25");
    table.addCell("Intervall-Training Einlaufen Zeit: 15 min, anschließend 3 Steigerungen Tempoläufe 10 x 90 sek schnell mit 90 sek Trabpause, Auslaufen Zeit: 15 min");
    table.addCell("Trainingseinheit 26");
    table.addCell("Langsamer Dauerlauf Zeit: 80 min");    
    table.addCell("Trainingseinheit 27");
    table.addCell("Intervall-Training Einlaufen Zeit: 10 min, Tempoläufe 2 x 15 min schnell mit 5 min Trabpause, Auslaufen Zeit: 10 min");
    table.addCell("Trainingseinheit 28");
    table.addCell("Ruhiger Dauerlauf Zeit: 40 min");
    table.addCell("Trainingseinheit 29");
    table.addCell("Intervall-Training Einlaufen Zeit: 10 min, Tempoläufe 4 x 3 min schnell mit 2 min Trabpause, Auslaufen Zeit: 10 min");
    table.addCell("Trainingseinheit 30");
    table.addCell("Ruhiger Dauerlauf Zeit: 40 min, anschließend 5 Steigerungen");
    table.addCell("Trainingseinheit 31");
    table.addCell("Wettkampf Einlaufen Zeit: 15 min, 10-km-Wettkampf oder 10-km-Testlauf Wettkampf, Auslaufen Zeit: 15 min");    
    table.addCell("Trainingseinheit 30");
    table.addCell("Ruhiger Dauerlauf Zeit: 40 min");    
    table.addCell("Trainingseinheit 31");
    table.addCell("Ruhiger Dauerlauf Zeit: 50 min");    
    table.addCell("Trainingseinheit 30");
    table.addCell("Intervall-Training Einlaufen Zeit: 15 min, Tempoläufe 8 x 3 min schnell mit 2 min Trabpause, Auslaufen Zeit: 10 min");
    table.addCell("Trainingseinheit 31");
    table.addCell("Langsamer Dauerlauf Zeit: 75 min");  
    table.addCell("Trainingseinheit 32");
    table.addCell("Intervall-Training Einlaufen Zeit: 15 min, anschließend 3 Steigerungen Tempoläufe 10 x 90 sek schnell mit 90 sek Trabpause, Auslaufen Zeit: 15 min");
    table.addCell("Trainingseinheit 33");
    table.addCell("Ruhiger Dauerlauf Zeit: 50 min");    
    table.addCell("Trainingseinheit 34");
    table.addCell("Intervall-Training Einlaufen Zeit: 10 min, Tempoläufe 2 x 15 min schnell mit 5 min Trabpause, Auslaufen Zeit: 10 min");
    table.addCell("Trainingseinheit 35");
    table.addCell("Langsamer Dauerlauf Zeit: 80 min");    
    table.addCell("Trainingseinheit 36");
    table.addCell("Intervall-Training Einlaufen Zeit: 15 min, Tempoläufe 4 x 6 min schnell mit 2 bis 3 min Trabpause, Auslaufen Zeit: 15 min");
    table.addCell("Trainingseinheit 37");
    table.addCell("Ruhiger Dauerlauf Zeit: 50 min");    
    table.addCell("Trainingseinheit 38");
    table.addCell("Zügiger Dauerlauf Einlaufen Zeit: 10 min, Zügiger Dauerlauf Zeit: 30 min, Auslaufen Zeit: 10 min");
    table.addCell("Trainingseinheit 39");
    table.addCell("Ruhiger Dauerlauf Zeit: 50 min");    
    table.addCell("Trainingseinheit 40");
    table.addCell("Intervall-Training Einlaufen Zeit: 10 min, anschließend 3 Steigerungen Tempoläufe 4 x 3 min schnell mit 2 min Trabpause, Auslaufen Zeit: 10 min");
    table.addCell("Trainingseinheit 41");
    table.addCell("Ruhiger Dauerlauf Zeit: 20 min, anschließend 3 bis 5 Steigerungen");
    table.addCell("WETTKAMPF");
    table.addCell("Wettkampf Einlaufen Zeit: 15 min, Wettkampf Dist: 10 km, Auslaufen Zeit: 15 min");
    subPart.add(table);
	}

    /**
     * Create table 10 km 40 min.
     *
     * @param subPart the sub part
     * @throws BadElementException the bad element exception
     */
    public void createTable10km40min(Section subPart) throws BadElementException{
	
	PdfPTable table = new PdfPTable(2);

    PdfPCell c1 = new PdfPCell(new Phrase("Trainingseinheit"));
    c1.setHorizontalAlignment(Element.ALIGN_LEFT);
    table.addCell(c1);

    c1 = new PdfPCell(new Phrase("Beschreibung"));
    c1.setHorizontalAlignment(Element.ALIGN_LEFT);
    table.addCell(c1);

         
    table.setHeaderRows(1);
    
    table.addCell("Trainingseinheit 1");
    table.addCell("Intervall-Training Einlaufen Zeit: 15 min, Tempoläufe 8 x 3 min schnell mit 2 min Trabpause, Auslaufen Zeit: 15 min");
    table.addCell("Trainingseinheit 2");
    table.addCell("Ruhiger Dauerlauf Zeit: 60 min anschließend 3 bis 5 Steigerungen");
    table.addCell("Trainingseinheit 3");
    table.addCell("Zügiger Dauerlauf Einlaufen Zeit: 15 min, Zügiger Dauerlauf Zeit: 30 min, Auslaufen Zeit: 15 min");
    table.addCell("Trainingseinheit 4");
    table.addCell("Langsamer Dauerlauf Zeit: 80 min");    
    table.addCell("Trainingseinheit 5");
    table.addCell("Intervall-Training Einlaufen Zeit: 15 min, Tempoläufe 3 min schnell, 6 min schnell, 3 min schnell, 6 min schnell, 3 min schnell mit jeweils 2 bis 3 min Trabpause, Auslaufen Zeit: 15 min");
    table.addCell("Trainingseinheit 6");
    table.addCell("Ruhiger Dauerlauf Zeit: 60 min");    
    table.addCell("Trainingseinheit 7");
    table.addCell("Zügiger Dauerlauf Einlaufen Zeit: 15 min, Zügiger Dauerlauf 3 x 10 min zügig mit 3 min Trabpause, Auslaufen Zeit: 15 min");
    table.addCell("Trainingseinheit 8");
    table.addCell("Langsamer Dauerlauf Zeit: 90 min");    
    table.addCell("Trainingseinheit 9");
    table.addCell("Ruhiger Dauerlauf Zeit: 40 min");    
    table.addCell("Trainingseinheit 10");
    table.addCell("Intervall-Training Einlaufen Zeit: 15 min, anschließend 3 Steigerungen Tempoläufe 7 x 1000 m in 4:05 bis 4:10 min mit 600 m Trabpause, Auslaufen Zeit: 15 min");
    table.addCell("Trainingseinheit 11");
    table.addCell("Langsamer Dauerlauf Zeit: 80 min");    
    table.addCell("Trainingseinheit 12");
    table.addCell("Zügiger Dauerlauf Einlaufen Zeit: 15 min, Zügiger Dauerlauf Zeit: 30 min, Auslaufen Zeit: 15 min");
    table.addCell("Trainingseinheit 13");
    table.addCell("Ruhiger Dauerlauf Zeit: 50 min");    
    table.addCell("Trainingseinheit 14");
    table.addCell("Ruhiger Dauerlauf Zeit: 40 min");    
    table.addCell("Trainingseinheit 15");
    table.addCell("Langsamer Dauerlauf Einlaufen Zeit: 15 min, anschließend 3 Steigerungen, Tempoläufe 1000 m in 4:05 min mit 600 m Trabpause, 2000 m in 8:15 min mit 800 m Trabpause, 1000 m in 4:05 min mit 600 Trabpause, 2000 m in 8:15 min mit 800 m Trabpause, 1000 m in 4:00 min, Auslaufen Zeit: 15 min");
    table.addCell("Trainingseinheit 16");
    table.addCell("Langsamer Dauerlauf Zeit: 90 min");    
    table.addCell("Trainingseinheit 17");
    table.addCell("Zügiger Dauerlauf Einlaufen Zeit: 10 min, Zügiger Dauerlauf 3 x 12 min zügig mit 4 min Trabpause, Auslaufen Zeit: 10 min");
    table.addCell("Trainingseinheit 18");
    table.addCell("Ruhiger Dauerlauf Zeit: 40 min");    
    table.addCell("Trainingseinheit 19");
    table.addCell("Ruhiger Dauerlauf Zeit: 50 min");    
    table.addCell("Trainingseinheit 20");
    table.addCell("Ruhiger Dauerlauf Zeit: 60 min, anschließend 3 Steigerungen");
    table.addCell("Trainingseinheit 21");
    table.addCell("Lockerer Dauerlauf Zeit: 50 min");    
    table.addCell("Trainingseinheit 22");
    table.addCell("Langsamer Dauerlauf Zeit: 100 min");    
    table.addCell("Trainingseinheit 23");
    table.addCell("ntervall-Training Einlaufen Zeit: 15 min, anschließend 3 Steigerungen Tempoläufe 8 x 1000 m in 4:05 min mit 600 m Trabpause, Auslaufen Zeit: 15 min");
    table.addCell("Trainingseinheit 24");
    table.addCell("Ruhiger Dauerlauf Zeit: 50 min");    
    table.addCell("Trainingseinheit 25");
    table.addCell("Zügiger Dauerlauf Einlaufen Zeit: 15 min, Zügiger Dauerlauf Zeit: 30 min, Auslaufen Zeit: 15 min");
    table.addCell("Trainingseinheit 26");
    table.addCell("Langsamer Dauerlauf Zeit: 80 min");    
    table.addCell("Trainingseinheit 27");
    table.addCell("Ruhiger Dauerlauf Zeit: 40 min");    
    table.addCell("Trainingseinheit 28");
    table.addCell("Intervall-Training Einlaufen, anschließend 3 Steigerungen Tempoläufe, 8 x 400 m in 1:30 min mit 400 m Trabpause, Auslaufen Zeit: 15 min");
    table.addCell("Trainingseinheit 29");
    table.addCell("Langsamer Dauerlauf Zeit: 80 min");    
    table.addCell("Trainingseinheit 30");
    table.addCell("Zügiger Dauerlauf Einlaufen Zeit: 15 min, Zügiger Dauerlauf Zeit: 30 min, Auslaufen Zeit: 15 min");
    table.addCell("Trainingseinheit 31");
    table.addCell("Ruhiger Dauerlauf Zeit: 40 min");       
    table.addCell("Trainingseinheit 32");
    table.addCell("Ruhiger Dauerlauf Zeit: 40 min");    
    table.addCell("Trainingseinheit 33");
    table.addCell("Intervall-Training Einlaufen Zeit: 10 min, Tempoläufe 5 x 1000 m in 4:00 min mit 600 m Trabpause, Auslaufen Zeit: 10 min");
    table.addCell("Trainingseinheit 34");
    table.addCell("Ruhiger Dauerlauf Zeit: 35 min anschließend 5 Steigerungen");
    table.addCell("Trainingseinheit 35");
    table.addCell("Wettkampf Einlaufen Zeit: 15 min, 10-km-Wettkampf oder 10-km-Testlauf Wettkampf, Auslaufen Zeit: 15 min");    
    table.addCell("Trainingseinheit 36");
    table.addCell("Ruhiger Dauerlauf Zeit: 60 min");    
    table.addCell("Trainingseinheit 37");
    table.addCell("Ruhiger Dauerlauf Zeit: 60 min");    
    table.addCell("Trainingseinheit 38");
    table.addCell("Intervall-Training Einlaufen Zeit: 15 min, anschließend 3 Steigerungen, Tempoläufe 8 x 1000 m in 4:00 min mit 600 m Trabpause, Auslaufen Zeit: 15 min");
    table.addCell("Trainingseinheit 39");
    table.addCell("Ruhiger Dauerlauf Zeit: 40 min");    
    table.addCell("Trainingseinheit 40");
    table.addCell("Langsamer Dauerlauf Zeit: 90 min");    
    table.addCell("Trainingseinheit 41");
    table.addCell("Intervall-Training Einlaufen Zeit: 15 min, anschließend 3 Steigerungen, Tempoläufe 10 x 400 m in 1:30 min mit 400 m Trabpause, Auslaufen Zeit: 15 min");
    table.addCell("Trainingseinheit 42");
    table.addCell("Ruhiger Dauerlauf Zeit: 40 min");    
    table.addCell("Trainingseinheit 43");
    table.addCell("Ruhiger Dauerlauf Zeit: 40 min");    
    table.addCell("Trainingseinheit 44");
    table.addCell("Intervall-Training Einlaufen Zeit: 10 min, Tempoläufe 2 x 4 km in 17:30 min mit 5 min Trabpause, Auslaufen Zeit: 10 min");
    table.addCell("Trainingseinheit 45");
    table.addCell("Langsamer Dauerlauf Zeit: 90 min");    
    table.addCell("Trainingseinheit 46");
    table.addCell("Intervall-Training Einlaufen Zeit: 15 min, Tempoläufe 4 x 2000 m in 8:00 mit 800 m Trabpause, anschließend 3 Steigerungen, Auslaufen Zeit: 10 min");
    table.addCell("Trainingseinheit 47");
    table.addCell("Ruhiger Dauerlauf Zeit: 60 min");    
    table.addCell("Trainingseinheit 48");
    table.addCell("Intervall-Training Einlaufen Zeit: 15 min, Tempoläufe 3 min schnell, 6 min schnell, 3 min schnell, 6 min schnell, 3 min schnell mit jeweils 2 bis 3 min Trabpause, Auslaufen Zeit: 15 min");
    table.addCell("Trainingseinheit 49");
    table.addCell("Ruhiger Dauerlauf Zeit: 50 min");    
    table.addCell("Trainingseinheit 50");
    table.addCell("Langsamer Dauerlauf Einlaufen Zeit: 10 min, Tempoläufe 5 x 1000 m in 4:00 min mit 600 m Trabpause, Auslaufen Zeit: 10 min");
    table.addCell("Trainingseinheit 51");
    table.addCell("Ruhiger Dauerlauf Zeit: 35 min, anschließend 3 Steigerungen");
    table.addCell("Trainingseinheit 52");
    table.addCell("Langsamer Dauerlauf Zeit: 10 min, anschließend 3 Steigerungen");
    table.addCell("WETTKAMPF");
    table.addCell("Wettkampf Einlaufen Zeit: 15 min, Wettkampf Dist: 10 km, Auslaufen Zeit: 15 min");
    subPart.add(table);
	}

    /**
     * Default statment.
     *
     * @param subPart the sub part
     * @throws BadElementException the bad element exception
     */
    public void defaultStatment(Section subPart) throws BadElementException{
		Paragraph Text = new Paragraph("Mit dem angegebenen Trainingsstand, "
				+ "ware dieses Zeihl bereits zu erreichen."
				+"\n"+ "Um einen Trainingsplan für dieses Ziehl zu erstellen, "
				+ "ändern Sie bitte Ihr Fitnesslevel.");
		subPart.add(Text);		
	}}
