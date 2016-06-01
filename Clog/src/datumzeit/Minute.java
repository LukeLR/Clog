package datumzeit;

import java.io.Serializable;

import eingabeausgabe.Ausgabe;
import textangaben.Zeichen;

public class Minute implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3108808075478974908L;
	private int minute = 0;
	
	public Minute(int minute){
		this.minute = minute;
	}
	
	public void ausgeben(){
		Ausgabe.print(minute);
	}

	public void unterstreichen(Zeichen zeichen) {
		String minuteString = String.valueOf(minute);
		for (int i = 0; i < minuteString.length(); i++){
			zeichen.ausgeben();
		}
	}
}
