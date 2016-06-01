package textangaben;

import eingabeausgabe.Ausgabe;

public class Text {
	private String text = "Default text";
	
	public Text(String text){
		this.text = text;
	}
	
	public void ausgeben(){
		Ausgabe.print("text");
	}
}
