package textangaben;

import java.io.Serializable;

import eingabeausgabe.Ausgabe;
import eingabeausgabe.Eingabe;

public class Text implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2508367389012396389L;
	private String text = "Default text";
	
	public Text(String text){
		this.text = text;
	}
	
	public void ausgeben(){
		Ausgabe.print(text);
	}

	public static Text vonEingabeEinlesen() {
		Ausgabe.print("Text (Beenden der Eingabe mit ';' + Enter): ");
		return new Text(Eingabe.naechsterString(";"));
	}
}
