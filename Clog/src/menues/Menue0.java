package menues;

import eingabeausgabe.Ausgabe;
import eingabeausgabe.Eingabe;

public class Menue0 {
	private static final String hauptmenue =
			"1) Clog-Eintrag erzeugen\n" +
			"2) Clog ausgeben\n" +
			"3) Clog laden\n" +
			"4) Clog speichern\n" +
			"5) Programm beenden\n" +
			"6) Alle Datensätze ausgeben";
	
	public static void run(){
		while(true){
			menue();
		}
	}
	
	public static void menue(){
		Ausgabe.printline("Hauptmenü:");
		Ausgabe.printline(hauptmenue);
		switch(Eingabe.naechsterString()){
		case "1": Menue1.menue(); break;
		case "2": Menue2.menue(); break;
		case "3": Menue3.menue(); break;
		case "4": Menue4.menue(); break;
		case "5": Menue5.menue(); break;
		case "6": Menue6.menue(); break;
		default: Ausgabe.printline("Bitte machen Sie eine korrekte Eingabe!"); break;
		}
	}
}
