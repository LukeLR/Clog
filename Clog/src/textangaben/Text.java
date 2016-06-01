package textangaben;

import java.io.Serializable;

import eingabeausgabe.Ausgabe;

public class Text implements Serializable {
	private String text = "Default text";
	
	public Text(String text){
		this.text = text;
	}
	
	public void ausgeben(){
		Ausgabe.print("text");
	}
}
