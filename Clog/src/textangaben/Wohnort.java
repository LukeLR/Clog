package textangaben;

import java.io.Serializable;

import eingabeausgabe.Ausgabe;

public class Wohnort implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2668618472684313702L;
	private String wohnort = "Default Wohnort";
	
	public Wohnort(String wohnort){
		this.wohnort = wohnort;
	}
	
	public void ausgeben(){
		Ausgabe.print(wohnort);
	}

	public void unterstreichen(Zeichen zeichen) {
		for (int i = 0; i < wohnort.length(); i++){
			zeichen.ausgeben();
		}
	}
}
