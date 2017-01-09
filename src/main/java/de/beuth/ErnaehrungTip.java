package de.beuth;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.RomanList;
import com.itextpdf.text.Section;

public class ErnaehrungTip {
	
	public void selectErnährung (String stand, Section doc) throws BadElementException{
		switch (stand){
		case "untrainiert": 
			TipUntrainiert(doc);
			break;
		case "grundausdauer": 
			TipGrundausdauer(doc);
			break;
		case "gut trainiert": 
			TipGuteAusdauer(doc);
			break;			
		}
	}
	
	public void TipUntrainiert(Section subPart) throws BadElementException{
	
	RomanList List = new RomanList();
    List.add(new ListItem("Ausreichend trinken: pro Tag mindestens 2 Liter und alle 15 bis 20 Minuten "
    		+ "eine kurze Trinkpause, in welcher du ungef�hr 250ml trinkst."));
    List.add(new ListItem("Achte auf gen�gend Eiwei� in deiner Ern�hrung: in Fisch, Fleisch, "
    		+ "Eiern und Milchprodukten steckt viel Eiwei�"));
    List.add(new ListItem("Kohlenhydrate - die Menge macht den Unterschied: Am besten sind hier"
    		+ " die so genannten komplexen Kohlenhydrate, welche zum Beispiel in Vollkornprodukten oder Haferflocken stecken"));
    List.add(new ListItem("Regelm��ige Mahlzeiten: im Idealfall isst du alle 2 bis 3 Stunden etwas"));
    List.add(new ListItem("Esse vor dem Schlafengehen: Da Hungezeiten vor dem Schlafengehen reduziert werden zum Beispiel Magerquark"));
	subPart.add(List);
	}

	public void TipGrundausdauer(Section subPart) throws BadElementException{
	
	RomanList List = new RomanList();
    List.add(new ListItem("Esse vor und nach dem Training: Vor dem Training solltest du vor allem auf die komplexen Kohlenhydrate achten."
    		+ "Nach dem Training geht es bei der Ern�hrung vorwiegend darum, die nun geleerten Glykogenspeicher wieder zu f�llen sowie m�glichst "
    		+ "noch ein schnell verwertbares Eiwei� f�r den Muskelaufbau zu essen. "));
    List.add(new ListItem("Erg�nze deine Ern�hrung: Je nach deinem pers�nlichen Fall kann eine Erg�nzung deiner t�glichen Ern�hrung mit "
    		+ "Supplementen in Form von Glutamin, Kreatin sowie den BCAA-Aminos�uren sinnvoll sein."));
    List.add(new ListItem("G�nne dir einen Cheat Day: Hier darfst du alles essen, was dir gerade in den Sinn kommt und solltest dabei darauf "
    		+ "achten, dass du weit �ber deinen eigentlichen Kalorienbedarf hinaus isst."));
    List.add(new ListItem("Regelm��ig Fisch essen: Fettreichen Fischsorten Lachs, Makrele, Hering und Thunfisch liefern deinem K�rper die "
    		+ "wertvollen Omega-3-Fetts�uren, die deinen Trainingserfolg gut voran treiben."));
    List.add(new ListItem("Auch rotes Fleisch in die Ern�hrung einbauen: Rind oder Lamm k�nnen sehr fettarm sein und bringt dir zudem den Vorteil, "
    		+ "dass es unter anderem viele B-Vitamine, Kreatin, Eisen sowie auch Zink enth�lt."));
	subPart.add(List);
	}

	public void TipGuteAusdauer(Section subPart) throws BadElementException{
	
	RomanList List = new RomanList();
    List.add(new ListItem("Vor dem Wettkampf: Am besten Pasta ohne Fleich."));
    List.add(new ListItem("Sp�testen 3 Stunden vor dem Training oder Wettkampf das letzt mal essen."));
    List.add(new ListItem("Nach dem Training oder dem Wettkampf Eiwei� und Kohnelhydrate zur Regeneration."));
    List.add(new ListItem("Wenig Zucker und Wei�mehl."));
    List.add(new ListItem("Bei Traininigs- oder Wettkampfeinheiten �ber 1 Stunde Zwischennahrung oder isotonische Getr�nke."));
	subPart.add(List);
	}
}
