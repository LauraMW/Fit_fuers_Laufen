package de.beuth;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.RomanList;
import com.itextpdf.text.Section;

/**
 * The type Ernaehrung tip.
 */
public class ErnaehrungTip {

	/**
	 * Select ernährung.
	 *
	 * @param stand the stand
	 * @param doc   the doc
	 * @throws BadElementException the bad element exception
	 */
	public void selectErnährung (String stand, Section doc) throws BadElementException{
		if (stand.equals("untrainiert")) {
			TipUntrainiert(doc);

		} else if (stand.equals("grundausdauer")) {
			TipGrundausdauer(doc);

		} else if (stand.equals("gut trainiert")) {
			TipGuteAusdauer(doc);

		}
	}

	/**
	 * Tip untrainiert.
	 *
	 * @param subPart the sub part
	 * @throws BadElementException the bad element exception
	 */
	public void TipUntrainiert(Section subPart) throws BadElementException{
	
	RomanList List = new RomanList();
    List.add(new ListItem("Ausreichend trinken: pro Tag mindestens 2 Liter und alle 15 bis 20 Minuten "
    		+ "eine kurze Trinkpause, in welcher du ungefähr 250ml trinkst."));
    List.add(new ListItem("Achte auf genügend Eiweiß in deiner Ernährung: in Fisch, Fleisch, "
    		+ "Eiern und Milchprodukten steckt viel Eiweiß"));
    List.add(new ListItem("Kohlenhydrate - die Menge macht den Unterschied: Am besten sind hier"
    		+ " die so genannten komplexen Kohlenhydrate, welche zum Beispiel in Vollkornprodukten oder Haferflocken stecken"));
    List.add(new ListItem("Regelmäßige Mahlzeiten: im Idealfall isst du alle 2 bis 3 Stunden etwas"));
    List.add(new ListItem("Esse vor dem Schlafengehen: Da Hungezeiten vor dem Schlafengehen reduziert werden zum Beispiel Magerquark"));
	subPart.add(List);
	}

	/**
	 * Tip grundausdauer.
	 *
	 * @param subPart the sub part
	 * @throws BadElementException the bad element exception
	 */
	public void TipGrundausdauer(Section subPart) throws BadElementException{
	
	RomanList List = new RomanList();
    List.add(new ListItem("Esse vor und nach dem Training: Vor dem Training solltest du vor allem auf die komplexen Kohlenhydrate achten."
    		+ "Nach dem Training geht es bei der Ernährung vorwiegend darum, die nun geleerten Glykogenspeicher wieder zu füllen sowie möglichst "
    		+ "noch ein schnell verwertbares Eiweiß für den Muskelaufbau zu essen. "));
    List.add(new ListItem("Ergänze deine Ernährung: Je nach deinem persönlichen Fall kann eine Ergänzung deiner täglichen Ernährung mit "
    		+ "Supplementen in Form von Glutamin, Kreatin sowie den BCAA-Aminosäuren sinnvoll sein."));
    List.add(new ListItem("Gönne dir einen Cheat Day: Hier darfst du alles essen, was dir gerade in den Sinn kommt und solltest dabei darauf "
    		+ "achten, dass du weit über deinen eigentlichen Kalorienbedarf hinaus isst."));
    List.add(new ListItem("Regelmäßig Fisch essen: Fettreichen Fischsorten Lachs, Makrele, Hering und Thunfisch liefern deinem Körper die "
    		+ "wertvollen Omega-3-Fettsäuren, die deinen Trainingserfolg gut voran treiben."));
    List.add(new ListItem("Auch rotes Fleisch in die Ernährung einbauen: Rind oder Lamm können sehr fettarm sein und bringt dir zudem den Vorteil, "
    		+ "dass es unter anderem viele B-Vitamine, Kreatin, Eisen sowie auch Zink enthält."));
	subPart.add(List);
	}

	/**
	 * Tip gute ausdauer.
	 *
	 * @param subPart the sub part
	 * @throws BadElementException the bad element exception
	 */
	public void TipGuteAusdauer(Section subPart) throws BadElementException{
	
	RomanList List = new RomanList();
    List.add(new ListItem("Vor dem Wettkampf: Am besten Pasta ohne Fleich."));
    List.add(new ListItem("Spätesten 3 Stunden vor dem Training oder Wettkampf das letzt mal essen."));
    List.add(new ListItem("Nach dem Training oder dem Wettkampf Eiweiß und Kohnelhydrate zur Regeneration."));
    List.add(new ListItem("Wenig Zucker und Weißmehl."));
    List.add(new ListItem("Bei Traininigs- oder Wettkampfeinheiten über 1 Stunde Zwischennahrung oder isotonische Getränke."));
	subPart.add(List);
	}
}
