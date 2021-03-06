package fields;

import java.io.Serializable;

import eingabeausgabe.Ausgabe;
import textangaben.Text;
import textangaben.Titel;

public class TitelText implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6199467510837003268L;
	private Titel titel;
	private Text text;
	
	public TitelText(String titel, String text){
		this.titel = new Titel(titel);
		this.text = new Text(text);
	}
	
	public TitelText(Titel titel, Text text) {
		this.titel = titel;
		this.text = text;
	}

	public void ausgeben(){
		/*String linie = "-------"; //Enthält bereits 6 '-' wegen dem vorangestellten "Titel: " in der Ausgabe
		for (int i = 0; i < titel.length(); i++){
			linie = linie + "-";
		}
		Ausgabe.printline(linie);*/
		titel.ausgeben();
		Ausgabe.printline("");
		//Ausgabe.printline(linie);
		text.ausgeben();
		Ausgabe.printline();
		//Ausgabe.printline(linie);
	}
	
	public static TitelText vonEingabeEinlesen(){
		Titel titel = Titel.vonEingabeEinlesen();
		Text text = Text.vonEingabeEinlesen();
		return new TitelText(titel, text);
	}
}
