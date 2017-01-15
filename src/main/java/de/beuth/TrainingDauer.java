package de.beuth;

import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Section;

public class TrainingDauer {
	
	Paragraph par = new Paragraph();
	int Wochen = 0;
	
	public int dauerUntrainirt (String strecke, String Zeit){
		int Einheiten = 0;
		if (strecke == "5"){
			if (Zeit.equals("35")) {
				Einheiten = 23;

			} else if (Zeit.equals("30")) {
				Einheiten = 23 + 19;

			} else if (Zeit.equals("25")) {
				Einheiten = 23 + 19;

			} else if (Zeit.equals("20")) {
				Einheiten = 23 + 19 + 32;

			}
		}
		if (strecke == "10"){
			if (Zeit.equals("60")) {
				Einheiten = 31;

			} else if (Zeit.equals("55")) {
				Einheiten = 35;

			} else if (Zeit.equals("50")) {
				Einheiten = 31 + 39;

			} else if (Zeit.equals("45")) {
				Einheiten = 35 + 41;

			} else if (Zeit.equals("40")) {
				Einheiten = 31 + 39 + 52;

			}
		}
		return Einheiten;
	}
	
	public int dauerGrundausdauer(String strecke, String Zeit){
		int Einheiten = 0;
		if (strecke == "5"){
			if (Zeit.equals("30")) {
				Einheiten = 19;

			} else if (Zeit.equals("25")) {
				Einheiten = 19;

			} else if (Zeit.equals("20")) {
				Einheiten = 19 + 32;

			}
		}
		if (strecke == "10"){
			if (Zeit.equals("55")) {
				Einheiten = 35;

			} else if (Zeit.equals("50")) {
				Einheiten = 39;

			} else if (Zeit.equals("45")) {
				Einheiten = 41;

			} else if (Zeit.equals("40")) {
				Einheiten = 39 + 52;

			}
		}
		return Einheiten; 
	}
	
	public int dauerGuteAausdauer(String strecke, String Zeit){
		int Einheiten = 0;
		if (strecke == "5"){
			if (Zeit.equals("25")) {
				Einheiten = 19;

			} else if (Zeit.equals("20")) {
				Einheiten = 32;

			}
		}
		if (strecke == "10"){
			if (Zeit.equals("45")) {
				Einheiten = 41;

			} else if (Zeit.equals("40")) {
				Einheiten = 52;
			}
		}
		return Einheiten;
	}
	
	public void printDauer(String aufwand, int Einheiten, Section subPart){
		if (Einheiten != 0){
			Wochen = (Einheiten / Integer.parseInt(aufwand))+1;
			if (aufwand == "1"){
				par = new Paragraph("Das Training wird insgesamt eine Trainingsdauer von ca." 
						+ Wochen + " Wochen benötigen,"+ "\n" + "wenn wie angegeben "
						+ aufwand + " Einheit pro Wochen absolviert wird.");
				subPart.add(par);
			}else{
				par = new Paragraph("Das Training wird insgesamt eine Trainingsdauer von ca." 
						+ Wochen + " Wochen benötigen,"+ "\n" + "wenn wie angegeben "
						+ aufwand + " Einheiten pro Wochen absolviert werden.");
				subPart.add(par);
			}
		}
	}
	
}
