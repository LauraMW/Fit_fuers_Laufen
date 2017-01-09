import java.io.FileOutputStream;
import java.util.Date;

import com.itextpdf.text.Anchor;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Section;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class Ausgabe {
	// saving location 
	static String FILE = "C:/Users/Default/Documents/Fit_Fürs_Laufen.pdf";
	// different fonts 
    static Font Heading1 = new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD);
    static Font Heading2 = new Font(Font.FontFamily.TIMES_ROMAN, 16, Font.BOLD);
    static Font Text = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.NORMAL);
    private TrainingSelection Trainingsplan = new TrainingSelection();
    
    private TrainingsEinheiten Plan = new TrainingsEinheiten();
    
    // Classification Data of PDF
    public void addMetaData(Document document) {
        document.addTitle("Fit Fürs Laufen");
        document.addAuthor("Laura Wolter, Marisa Keil");
        document.addCreator("Laura Wolter, Marisa Keil");
    }
    
    public void addContent(Document document, String Strecke, String Zeit, String Stand, String Aufwand) throws DocumentException{
    	// Heading chepter 1
    	Anchor anchor = new Anchor("Fit fürs Laufen", Heading1);
        anchor.setName("Fit fürs Laufen");
        Chapter ChaPart1 = new Chapter(new Paragraph(anchor), 1);
        Paragraph Ziel = new Paragraph("Trainingsplan für das angegebene Ziel", Heading2);
        Section Table = ChaPart1.addSection(Ziel);
        
        Paragraph paragraph = new Paragraph();
        addEmptyLine(paragraph, 1);
        Ziel.add(paragraph);
        boolean Ernährungstipps = Trainingsplan.selectTraining(Strecke, Zeit, Stand, Aufwand, Table);
        if (Ernährungstipps){
        	Paragraph Ernährung = new Paragraph("Ernährungstips", Heading2);
        	Section List = ChaPart1.addSection(Ernährung);
        	addEmptyLine(Ernährung, 1);
        	ErnaehrungTip Tipps = new ErnaehrungTip();
        	Tipps.selectErnährung(Stand, List);
        }
        document.add(ChaPart1);    
    }
    
    public void addEmptyLine(Paragraph paragraph, int number) {
        for (int i = 0; i < number; i++) {
                paragraph.add(new Paragraph(" "));
        }
    }  
    
}
