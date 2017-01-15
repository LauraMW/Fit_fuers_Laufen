package de.beuth;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Section;

public class TrainingSelection {
	private TrainingsEinheiten Plan = new TrainingsEinheiten();
	private Paragraph par = new Paragraph();
	private TrainingDauer Einheiten = new TrainingDauer();
	private int gesamteinheiten = 0;
	
	public boolean selectTraining (String strecke, String zeit, String stand, String aufwand, Section doc) throws BadElementException{
		if (stand.equals("untrainiert")) {
			gesamteinheiten = Einheiten.dauerUntrainirt(strecke, zeit);
			Einheiten.printDauer(aufwand, gesamteinheiten, doc);
			selectionUntrainirt(strecke, zeit, doc);

		} else if (stand.equals("grundausdauer")) {
			gesamteinheiten = Einheiten.dauerGrundausdauer(strecke, zeit);
			Einheiten.printDauer(aufwand, gesamteinheiten, doc);
			selectionGrundausdauer(strecke, zeit, doc);

		} else if (stand.equals("gut trainiert")) {
			gesamteinheiten = Einheiten.dauerGuteAausdauer(strecke, zeit);
			Einheiten.printDauer(aufwand, gesamteinheiten, doc);
			selectionGuteAausdauer(strecke, zeit, doc);

		}
		if (gesamteinheiten == 0){
			return false;
		}else{
			return true;
		}
		
		
	}
	
	public void selectionUntrainirt (String strecke, String Zeit, Section doc) throws BadElementException{
		if (strecke == "5"){
			if (Zeit.equals("35")) {
				par = new Paragraph("Durch diesen Trainingsplan, "
						+ "können Sie ihr Ziel von 5km in 35 Minunte erreichen ");
				addEmptyLine(par, 2);
				doc.add(par);
				Plan.createTable5km35min(doc);

			} else if (Zeit.equals("30")) {
				par = new Paragraph("Dieser Trainingseinheiten sollten zuerste absolviert "
						+ "werden um eine Grungausdauer zu erlangen.");
				addEmptyLine(par, 2);
				doc.add(par);
				Plan.createTable5km35min(doc);
				addEmptyLine(par, 1);
				par = new Paragraph("Durch diesen Trainingspaln können Sie ihr Ziel von "
						+ "5 km in 30 Minuten mit eine Grundausdauer erreichen");
				addEmptyLine(par, 2);
				doc.add(par);
				Plan.createTable5km30min(doc);

			} else if (Zeit.equals("25")) {
				par = new Paragraph("Dieser Trainingseinheiten sollten zuerste absolviert "
						+ "werden um eine Grungausdauer zu erlangen.");
				addEmptyLine(par, 2);
				doc.add(par);
				Plan.createTable5km35min(doc);
				addEmptyLine(par, 1);
				par = new Paragraph("Durch diesen Trainingspaln können Sie ihr Ziel von "
						+ "5 km in 25 Minuten mit eine Grundausdauer erreichen");
				addEmptyLine(par, 2);
				doc.add(par);
				Plan.createTable5km25min(doc);

			} else if (Zeit.equals("20")) {
				par = new Paragraph("Dieser Trainingseinheiten sollten zuerste absolviert "
						+ "werden um eine Grungausdauer zu erlangen.");
				addEmptyLine(par, 2);
				doc.add(par);
				Plan.createTable5km35min(doc);
				addEmptyLine(par, 1);
				par = new Paragraph("Dieser Trainingsplan sollte als zweite absolviert "
						+ "werden um eine gute Ausdauerzu erlangen");
				addEmptyLine(par, 2);
				doc.add(par);
				Plan.createTable5km25min(doc);
				addEmptyLine(par, 1);
				par = new Paragraph("Durch diesen Trainingspaln können Sie ihr Ziel von "
						+ "5 km in 20 Minuten mit eine guten Ausdauer erreichen");
				addEmptyLine(par, 2);
				doc.add(par);
				Plan.createTable5km20min(doc);

			} else {
				addEmptyLine(par, 1);
				Plan.defaultStatment(doc);
				doc.add(par);
			}
		}
		if (strecke == "10"){
			if (Zeit.equals("60")) {
				par = new Paragraph("Durch diesen Trainingsplan, "
						+ "können Sie ihr Ziel von 10km in 60 Minuten erreichen");
				addEmptyLine(par, 2);
				doc.add(par);
				Plan.createTable10km60min(doc);

			} else if (Zeit.equals("55")) {
				par = new Paragraph("Durch diesen Trainingsplan, "
						+ "können Sie ihr Ziel von 10km in 55 Minuten erreichen");
				addEmptyLine(par, 2);
				doc.add(par);
				Plan.createTable10km55min(doc);

			} else if (Zeit.equals("50")) {
				par = new Paragraph("Dieser Trainingseinheiten sollten zuerste absolviert "
						+ "werden um eine Grungausdauer zu erlangen.");
				addEmptyLine(par, 2);
				doc.add(par);
				Plan.createTable10km60min(doc);
				addEmptyLine(par, 1);
				par = new Paragraph("Durch diesen Trainingspaln können Sie ihr Ziel von "
						+ "10 km in 50 Minuten mit eine Grundausdauer erreichen");
				addEmptyLine(par, 2);
				doc.add(par);
				Plan.createTable10km50min(doc);

			} else if (Zeit.equals("45")) {
				par = new Paragraph("Dieser Trainingseinheiten sollten zuerste absolviert "
						+ "werden um eine Grungausdauer zu erlangen.");
				addEmptyLine(par, 2);
				doc.add(par);
				Plan.createTable10km55min(doc);
				;
				addEmptyLine(par, 1);
				par = new Paragraph("Durch diesen Trainingspaln können Sie ihr Ziel von "
						+ "10 km in 45 Minuten mit eine Grundausdauer erreichen");
				addEmptyLine(par, 2);
				doc.add(par);
				Plan.createTable10km45min(doc);

			} else if (Zeit.equals("40")) {
				par = new Paragraph("Dieser Trainingseinheiten sollten zuerste absolviert "
						+ "werden um eine Grungausdauer zu erlangen.");
				addEmptyLine(par, 2);
				doc.add(par);
				Plan.createTable10km60min(doc);
				addEmptyLine(par, 1);
				par = new Paragraph("Dieser Trainingsplan sollte als zweite absolviert "
						+ "werden um eine gute Ausdauerzu erlangen");
				addEmptyLine(par, 2);
				doc.add(par);
				Plan.createTable10km50min(doc);
				;
				addEmptyLine(par, 1);
				par = new Paragraph("Durch diesen Trainingspaln können Sie ihr Ziel von "
						+ "10 km in 40 Minuten mit eine guten Ausdauer erreichen");
				addEmptyLine(par, 2);
				doc.add(par);
				Plan.createTable10km40min(doc);

			} else {
				addEmptyLine(par, 1);
				Plan.defaultStatment(doc);
				doc.add(par);
			}
		}
	}
	
	public void selectionGrundausdauer(String strecke, String Zeit, Section doc) throws BadElementException{
		if (strecke == "5"){
			if (Zeit.equals("30")) {
				par = new Paragraph("Durch diesen Trainingsplan, "
						+ "könne Sie ihr Ziel von 5km in 30 Minunte erreichen ");
				addEmptyLine(par, 2);
				doc.add(par);
				Plan.createTable5km30min(doc);

			} else if (Zeit.equals("25")) {
				par = new Paragraph("Durch diesen Trainingsplan, "
						+ "könne Sie ihr Ziel von 5km in 25 Minunte erreichen ");
				addEmptyLine(par, 2);
				doc.add(par);
				Plan.createTable5km25min(doc);

			} else if (Zeit.equals("20")) {
				par = new Paragraph("Dieser Trainingseinheiten sollten zuerste absolviert "
						+ "werden um eine gute ausdauer zu erlangen.");
				addEmptyLine(par, 2);
				doc.add(par);
				Plan.createTable5km30min(doc);
				;
				addEmptyLine(par, 1);
				par = new Paragraph("Durch diesen Trainingspaln können Sie ihr Ziel von "
						+ "5 km in 20 Minuten mit eine Grundausdauer erreichen");
				addEmptyLine(par, 2);
				doc.add(par);
				Plan.createTable5km20min(doc);

			} else {
				addEmptyLine(par, 1);
				Plan.defaultStatment(doc);
				doc.add(par);
			}
		}
		if (strecke == "10"){
			if (Zeit.equals("55")) {
				par = new Paragraph("Durch diesen Trainingsplan, "
						+ "können Sie ihr Ziel von 10km in 55 Minuten erreichen");
				addEmptyLine(par, 2);
				doc.add(par);
				Plan.createTable10km50min(doc);

			} else if (Zeit.equals("50")) {
				par = new Paragraph("Durch diesen Trainingsplan, "
						+ "können Sie ihr Ziel von 10km in 50 Minuten erreichen");
				addEmptyLine(par, 2);
				doc.add(par);
				Plan.createTable10km50min(doc);

			} else if (Zeit.equals("45")) {
				par = new Paragraph("Durch diesen Trainingsplan, "
						+ "können Sie ihr Ziel von 10km in 45 Minuten erreichen");
				addEmptyLine(par, 2);
				doc.add(par);
				Plan.createTable10km45min(doc);

			} else if (Zeit.equals("40")) {
				par = new Paragraph("Dieser Trainingseinheiten sollten zuerste absolviert "
						+ "werden um eine gute Ausdauer zu erlangen.");
				addEmptyLine(par, 2);
				doc.add(par);
				Plan.createTable10km50min(doc);
				;
				addEmptyLine(par, 1);
				par = new Paragraph("Durch diesen Trainingspaln können Sie ihr Ziel von "
						+ "10 km in 40 Minuten mit eine guten Ausdauer erreichen");
				addEmptyLine(par, 2);
				doc.add(par);
				Plan.createTable10km40min(doc);

			} else {
				addEmptyLine(par, 1);
				Plan.defaultStatment(doc);
				doc.add(par);
			}
		}
	}
	
	public void selectionGuteAausdauer(String strecke, String Zeit, Section doc) throws BadElementException{
		if (strecke == "5"){
			if (Zeit.equals("25")) {
				par = new Paragraph("Durch diesen Trainingsplan, "
						+ "könne Sie ihr Ziel von 5km in 25 Minunte erreichen ");
				addEmptyLine(par, 2);
				doc.add(par);
				Plan.createTable5km20min(doc);

			} else if (Zeit.equals("20")) {
				par = new Paragraph("Durch diesen Trainingsplan, "
						+ "könne Sie ihr Ziel von 5km in 20 Minunte erreichen ");
				addEmptyLine(par, 2);
				doc.add(par);
				Plan.createTable5km20min(doc);

			} else {
				addEmptyLine(par, 1);
				Plan.defaultStatment(doc);
				doc.add(par);
			}
		}
		if (strecke == "10"){
			if (Zeit.equals("45")) {
				par = new Paragraph("Durch diesen Trainingsplan, "
						+ "könne Sie ihr Ziel von 10km in 45 Minunte erreichen ");
				addEmptyLine(par, 2);
				doc.add(par);
				Plan.createTable10km40min(doc);

			} else if (Zeit.equals("40")) {
				par = new Paragraph("Durch diesen Trainingsplan, "
						+ "könne Sie ihr Ziel von 10km in 40 Minunte erreichen ");
				addEmptyLine(par, 2);
				doc.add(par);
				Plan.createTable10km40min(doc);

				addEmptyLine(par, 1);
				Plan.defaultStatment(doc);
				doc.add(par);
			} else {
				addEmptyLine(par, 1);
				Plan.defaultStatment(doc);
				doc.add(par);
			}
		}
	}
	
	public void addEmptyLine(Paragraph paragraph, int number) {
        for (int i = 0; i < number; i++) {
                paragraph.add(new Paragraph(" "));
        }
    }  
    
	
}
