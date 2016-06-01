package menues;

import data.Datensatz;
import data.DatensatzManager;
import eingabeausgabe.Ausgabe;
import eingabeausgabe.Eingabe;
import fields.DatumZeit;
import fields.Schlagworte;
import textangaben.Nachname;
import textangaben.Schlagwort;
import textangaben.Vorname;
import textangaben.Wohnort;
import textangaben.Titel;
import textangaben.Text;

public class Menue1 {
	public static void menue(){
		Vorname vorname;
		Nachname nachname;
		Wohnort wohnort;
		String datum;
		String[] datumArray;
		int[] datumArrayInt;
		String zeit;
		String[] zeitArray;
		int[] zeitArrayInt;
		DatumZeit datumZeit;
		Titel titel;
		Text text;
		Schlagworte schlagworte;
		Ausgabe.printline("Sie wollen einen neuen Eintrag erzeugen. Best�tigen Sie jeweils mit Enter.");
		Ausgabe.print("Vorname: ");
		vorname = new Vorname(Eingabe.naechsterString());
		Ausgabe.print("Nachname: ");
		nachname = new Nachname(Eingabe.naechsterString());
		Ausgabe.print("Wohnort: ");
		wohnort = new Wohnort(Eingabe.naechsterString());
		Ausgabe.print("Datum (TT.MM.JJJJ HH:MM:SS): ");
		datum = Eingabe.naechsterString();
		datumArray = datum.split("\\.");
		datumArrayInt = new int[datumArray.length];
		for (int i = 0; i < datumArray.length; i++){
			datumArrayInt[i] = Integer.valueOf(datumArray[i]);
		}
		zeit = Eingabe.naechsterString();
		zeitArray = zeit.split(":");
		zeitArrayInt = new int[zeitArray.length];
		for (int i = 0; i < zeitArray.length; i++){
			zeitArrayInt[i] = Integer.valueOf(zeitArray[i]);
		}
		datumZeit = new DatumZeit((int)datumArrayInt[0], datumArrayInt[1], (int)datumArrayInt[2], (int)zeitArrayInt[0], (int)zeitArrayInt[1], (int)zeitArrayInt[2]);
		Ausgabe.print("Titel: ");
		titel = new Titel(Eingabe.naechsterString());
		Ausgabe.print("Text: ");
		text = new Text(Eingabe.naechsterString());
		Ausgabe.printline();
		Ausgabe.printline("Geben Sie nun Schlagworte ein, und bestätigen Sie nach jeder einzelnen Eingabe mit Enter. Wenn Sie keine weiteren Schlagworte eingeben wollen, geben Sie das Schlagwort 'exit' ein.");
		schlagworte = new Schlagworte();
		Schlagwort schlagwort = new Schlagwort(Eingabe.naechsterString());
		while (!schlagwort.equals(new Schlagwort("exit"))){
			schlagworte.hinzufuegen(schlagwort);
			schlagwort = new Schlagwort(Eingabe.naechsterString());
		}
		Datensatz datensatz = new Datensatz(vorname, nachname, wohnort, datumZeit, titel, text, schlagworte);
		DatensatzManager.datensatzHinzufuegen(datensatz);
		Ausgabe.print("Datensatz hinzugefügt.");
	}
}
