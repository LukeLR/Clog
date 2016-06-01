package datumzeit;

import java.io.Serializable;

import eingabeausgabe.Ausgabe;
import textangaben.Zeichen;

public class Sekunde implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3954167216543580954L;
	private int sekunde = 0;
	
	public Sekunde(int sekunde){
		this.sekunde = sekunde;
	}
	
	public void ausgeben(){
		Ausgabe.print(sekunde);
	}

	public void unterstreichen(Zeichen zeichen) {
		String sekundeString = String.valueOf(sekunde);
		for(int i = 0; i < sekundeString.length(); i++){
			zeichen.ausgeben();
		}
	}
}
