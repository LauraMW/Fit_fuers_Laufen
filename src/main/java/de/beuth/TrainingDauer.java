package de.beuth;

import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Section;

public class TrainingDauer {
	
	Paragraph par = new Paragraph();
	int Wochen = 0;
	
	public int dauerUntrainirt (String strecke, String Zeit){
		int Einheiten = 0;
		if (strecke == "5"){
			switch (Zeit){
				case "35":
					Einheiten = 23;
					break;
				case "30": 
					Einheiten = 23 + 19;
					break;
				case "25":	
					Einheiten = 23 + 19;
					break;
				case "20":
					Einheiten = 23 + 19 + 32;
					break;
			}
		}
		if (strecke == "10"){
			switch(Zeit){
				case "60": 
					Einheiten = 31;
					break;					
				case "55":
					Einheiten = 35;
					break;
				case "50":
					Einheiten = 31 + 39;
					break;
				case "45":
					Einheiten = 35 + 41;
					break;
				case "40":
					Einheiten = 31 + 39 + 52;
					break;	
			}
		}
		return Einheiten;
	}
	
	public int dauerGrundausdauer(String strecke, String Zeit){
		int Einheiten = 0;
		if (strecke == "5"){
			switch(Zeit){
			case "30":
				Einheiten = 19;
				break;
			case "25":
				Einheiten = 19;
				break;
			case "20":
				Einheiten = 19 + 32;
				break;			
			}
		}
		if (strecke == "10"){
			switch(Zeit){
			case "55":
				Einheiten = 39;
				break;
			case "50":
				Einheiten = 39;
				break; 
			case "45":
				Einheiten = 41;
				break;
			case "40":
				Einheiten = 39 + 52;
				break;				
			}
		}
		return Einheiten; 
	}
	
	public int dauerGuteAausdauer(String strecke, String Zeit){
		int Einheiten = 0;
		if (strecke == "5"){
			switch(Zeit){
			case "25":
				Einheiten = 32;
				break;
			case "20":
				Einheiten = 32;
				break;		
			}
		}
		if (strecke == "10"){
			switch(Zeit){
			case "45":
				Einheiten = 52;
				break; 
			case "40":
				Einheiten = 52;
			}
		}
		return Einheiten;
	}
	
	public void printDauer(String aufwand, int Einheiten, Section subPart){
		if (Einheiten != 0){
			Wochen = Einheiten / Integer.parseInt(aufwand); 
			if (aufwand == "1"){
				par = new Paragraph("Das Training wird insgesamt eine Trainingsdauer von ca." 
						+ Wochen + " Wochen ben�tigen,"+ "\n" + "wenn wie angegeben " 
						+ aufwand + " Einheit pro Wochen absolviert wird.");
				subPart.add(par);
			}else{
				par = new Paragraph("Das Training wird insgesamt eine Trainingsdauer von ca." 
						+ Wochen + " Wochen ben�tigen,"+ "\n" + "wenn wie angegeben " 
						+ aufwand + " Einheiten pro Wochen absolviert werden.");
				subPart.add(par);
			}
		}
	}
	
}
