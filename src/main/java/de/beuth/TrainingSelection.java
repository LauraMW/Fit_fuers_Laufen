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
		switch (stand){
		case "untrainiert": 
			gesamteinheiten = Einheiten.dauerUntrainirt(strecke, zeit); 
			Einheiten.printDauer(aufwand, gesamteinheiten, doc);
			selectionUntrainirt(strecke, zeit, doc);
			break;
		case "grundausdauer": 
			gesamteinheiten = Einheiten.dauerGrundausdauer(strecke, zeit);
			Einheiten.printDauer(aufwand, gesamteinheiten, doc);
			selectionGrundausdauer(strecke, zeit, doc);
			break;
		case "gut trainiert": 
			gesamteinheiten = Einheiten.dauerGuteAausdauer(strecke, zeit);
			Einheiten.printDauer(aufwand, gesamteinheiten, doc);
			selectionGuteAausdauer(strecke, zeit, doc);
			break;			
		}
		if (gesamteinheiten == 0){
			return false;
		}else{
			return true;
		}
		
		
	}
	
	public void selectionUntrainirt (String strecke, String Zeit, Section doc) throws BadElementException{
		if (strecke == "5"){
			switch (Zeit){
				case "35":
					par = new Paragraph("Durch diesen Trainingsplan, "
							+ "können Sie ihr Ziel von 5km in 35 Minunte erreichen ");
					addEmptyLine(par,2);
					doc.add(par);
					Plan.createTable5km35min(doc);
					break;
				case "30": 
					par = new Paragraph("Dieser Trainingseinheiten sollten zuerste absolviert "
							+ "werden um eine Grungausdauer zu erlangen.");
					addEmptyLine(par, 2);
					doc.add(par);
					Plan.createTable5km35min(doc);
					addEmptyLine(par, 1);
					par = new Paragraph("Durch diesen Trainingspaln k�nnen Sie ihr Ziel von "
							+ "5 km in 30 Minuten mit eine Grundausdauer erreichen");
					addEmptyLine(par, 2);
					doc.add(par);
					Plan.createTable5km30min(doc);
					break;
				case "25":	
					par = new Paragraph("Dieser Trainingseinheiten sollten zuerste absolviert "
							+ "werden um eine Grungausdauer zu erlangen.");
					addEmptyLine(par, 2);
					doc.add(par);
					Plan.createTable5km35min(doc);
					addEmptyLine(par, 1);
					par = new Paragraph("Durch diesen Trainingspaln k�nnen Sie ihr Ziel von "
							+ "5 km in 25 Minuten mit eine Grundausdauer erreichen");
					addEmptyLine(par, 2);
					doc.add(par);
					Plan.createTable5km25min(doc);
					break;
				case "20":
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
					par = new Paragraph("Durch diesen Trainingspaln k�nnen Sie ihr Ziel von "
							+ "5 km in 20 Minuten mit eine guten Ausdauer erreichen");
					addEmptyLine(par, 2);
					doc.add(par);
					Plan.createTable5km20min(doc);
					break;
				default:
					addEmptyLine(par, 1);
					Plan.defaultStatment(doc);
					doc.add(par);
			}
		}
		if (strecke == "10"){
			switch(Zeit){
				case "60": 
					par = new Paragraph("Durch diesen Trainingsplan, "
							+ "k�nnen Sie ihr Ziel von 10km in 60 Minuten erreichen");
					addEmptyLine(par, 2);
					doc.add(par);
					Plan.createTable10km60min(doc);
					break;					
				case "55":
					par = new Paragraph("Durch diesen Trainingsplan, "
							+ "k�nnen Sie ihr Ziel von 10km in 55 Minuten erreichen");
					addEmptyLine(par, 2);
					doc.add(par);
					Plan.createTable10km55min(doc);
					break;
				case "50": 	
					par = new Paragraph("Dieser Trainingseinheiten sollten zuerste absolviert "
							+ "werden um eine Grungausdauer zu erlangen.");
					addEmptyLine(par, 2);
					doc.add(par);
					Plan.createTable10km60min(doc);
					addEmptyLine(par, 1);
					par = new Paragraph("Durch diesen Trainingspaln k�nnen Sie ihr Ziel von "
							+ "10 km in 50 Minuten mit eine Grundausdauer erreichen");
					addEmptyLine(par, 2);
					doc.add(par);
					Plan.createTable10km50min(doc);
					break;
				case "45":
					par = new Paragraph("Dieser Trainingseinheiten sollten zuerste absolviert "
							+ "werden um eine Grungausdauer zu erlangen.");
					addEmptyLine(par, 2);
					doc.add(par);
					Plan.createTable10km55min(doc);;
					addEmptyLine(par, 1);
					par = new Paragraph("Durch diesen Trainingspaln k�nnen Sie ihr Ziel von "
							+ "10 km in 45 Minuten mit eine Grundausdauer erreichen");
					addEmptyLine(par, 2);
					doc.add(par);
					Plan.createTable10km45min(doc);
					break;
				case "40": 
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
					Plan.createTable10km50min(doc);;
					addEmptyLine(par, 1);
					par = new Paragraph("Durch diesen Trainingspaln k�nnen Sie ihr Ziel von "
							+ "10 km in 40 Minuten mit eine guten Ausdauer erreichen");
					addEmptyLine(par, 2);
					doc.add(par);
					Plan.createTable10km40min(doc);
					break;	
				default:
					addEmptyLine(par, 1);
					Plan.defaultStatment(doc);
					doc.add(par);
			}
		}
	}
	
	public void selectionGrundausdauer(String strecke, String Zeit, Section doc) throws BadElementException{
		if (strecke == "5"){
			switch(Zeit){
			case "30": 
				par = new Paragraph("Durch diesen Trainingsplan, "
						+ "k�nne Sie ihr Ziel von 5km in 30 Minunte erreichen ");
				addEmptyLine(par, 2);
				doc.add(par);
				Plan.createTable5km30min(doc);
				break;
			case "25":
				par = new Paragraph("Durch diesen Trainingsplan, "
						+ "k�nne Sie ihr Ziel von 5km in 25 Minunte erreichen ");
				addEmptyLine(par, 2);
				doc.add(par);
				Plan.createTable5km25min(doc);
				break;
			case "20": 
				par = new Paragraph("Dieser Trainingseinheiten sollten zuerste absolviert "
						+ "werden um eine gute ausdauer zu erlangen.");
				addEmptyLine(par, 2);
				doc.add(par);
				Plan.createTable5km30min(doc);;
				addEmptyLine(par, 1);
				par = new Paragraph("Durch diesen Trainingspaln k�nnen Sie ihr Ziel von "
						+ "5 km in 20 Minuten mit eine Grundausdauer erreichen");
				addEmptyLine(par, 2);
				doc.add(par);
				Plan.createTable5km20min(doc);
				break;		
			default:
				addEmptyLine(par, 1);
				Plan.defaultStatment(doc);
				doc.add(par);
			}
		}
		if (strecke == "10"){
			switch(Zeit){
			case "55": 
				par = new Paragraph("Durch diesen Trainingsplan, "
						+ "k�nnen Sie ihr Ziel von 10km in 55 Minuten erreichen");
				addEmptyLine(par, 2);
				doc.add(par);
				Plan.createTable10km50min(doc);
				break;
			case "50": 
				par = new Paragraph("Durch diesen Trainingsplan, "
						+ "k�nnen Sie ihr Ziel von 10km in 50 Minuten erreichen");
				addEmptyLine(par, 2);
				doc.add(par);
				Plan.createTable10km50min(doc);
				break; 
			case "45": 
				par = new Paragraph("Durch diesen Trainingsplan, "
						+ "k�nnen Sie ihr Ziel von 10km in 45 Minuten erreichen");
				addEmptyLine(par, 2);
				doc.add(par);
				Plan.createTable10km45min(doc);
				break;
			case "40": 
				par = new Paragraph("Dieser Trainingseinheiten sollten zuerste absolviert "
						+ "werden um eine gute Ausdauer zu erlangen.");
				addEmptyLine(par, 2);
				doc.add(par);
				Plan.createTable10km50min(doc);;
				addEmptyLine(par, 1);
				par = new Paragraph("Durch diesen Trainingspaln k�nnen Sie ihr Ziel von "
						+ "10 km in 40 Minuten mit eine guten Ausdauer erreichen");
				addEmptyLine(par, 2);
				doc.add(par);
				Plan.createTable10km40min(doc);
				break;
			default:
				addEmptyLine(par, 1);
				Plan.defaultStatment(doc);
				doc.add(par);
			}
		}
	}
	
	public void selectionGuteAausdauer(String strecke, String Zeit, Section doc) throws BadElementException{
		if (strecke == "5"){
			switch(Zeit){
			case "25": 
				par = new Paragraph("Durch diesen Trainingsplan, "
						+ "k�nne Sie ihr Ziel von 5km in 25 Minunte erreichen ");
				addEmptyLine(par, 2);
				doc.add(par);
				Plan.createTable5km20min(doc);
				break;
			case "20": 
				par = new Paragraph("Durch diesen Trainingsplan, "
						+ "k�nne Sie ihr Ziel von 5km in 20 Minunte erreichen ");
				addEmptyLine(par, 2);
				doc.add(par);
				Plan.createTable5km20min(doc);
				break;		
			default:
				addEmptyLine(par, 1);
				Plan.defaultStatment(doc);
				doc.add(par);
			}
		}
		if (strecke == "10"){
			switch(Zeit){
			case "45": 
				par = new Paragraph("Durch diesen Trainingsplan, "
						+ "k�nne Sie ihr Ziel von 10km in 45 Minunte erreichen ");
				addEmptyLine(par, 2);
				doc.add(par);
				Plan.createTable10km40min(doc);
				break; 
			case "40": 
				par = new Paragraph("Durch diesen Trainingsplan, "
						+ "k�nne Sie ihr Ziel von 10km in 40 Minunte erreichen ");
				addEmptyLine(par, 2);
				doc.add(par);
				Plan.createTable10km40min(doc);
			default:
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
