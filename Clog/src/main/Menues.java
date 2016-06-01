package main;

import eingabeausgabe.Ausgabe;

public class Menues {
	private static final String hauptmenue =
			"1) Clog-Eintrag erzeugen\n" +
			"2)Clog ausgeben\n" +
			"3)Clog laden\n"+
			"4)Clog speichern\n"+
			"5)Programm beenden";
	
	public static void hauptmenue(){
		Ausgabe.printline(hauptmenue);
	}
}
