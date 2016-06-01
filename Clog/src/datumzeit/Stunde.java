package datumzeit;

import java.io.Serializable;

import eingabeausgabe.Ausgabe;
import textangaben.Zeichen;

public class Stunde implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3892048434726748666L;
	private int stunde = 0;
	
	public Stunde(int stunde){
		this.stunde = stunde;
	}
	
	public void ausgeben(){
		Ausgabe.print(stunde);
	}

	public void unterstreichen(Zeichen zeichen) {
		String stundeString = String.valueOf(stunde);
		for (int i = 0; i < stundeString.length(); i++){
			zeichen.ausgeben();
		}
	}
}
