package textangaben;

import java.io.Serializable;

import eingabeausgabe.Ausgabe;

public class Nachname implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1283275046335322200L;
	private String nachname = "Default Nachname";
	
	public Nachname(String nachname){
		this.nachname = nachname;
	}
	
	public void ausgeben(){
		Ausgabe.print(nachname);
	}
	
	public void unterstreichen(Zeichen zeichen){
		for (int i = 0; i < nachname.length(); i++){
			zeichen.ausgeben();
		}
	}
}
