package datumzeit;

import java.io.Serializable;

import eingabeausgabe.Ausgabe;
import eingabeausgabe.Eingabe;
import textangaben.Zeichen;

public class Zeit implements Serializable {
	private static final long serialVersionUID = -5046235435945037355L;
	private StundeMinute stundeMinute;
	private Sekunde sekunde;
	
	public Zeit(int stunde, int minute, int sekunde){
		this.stundeMinute = new StundeMinute(stunde, minute);
		this.sekunde = new Sekunde(sekunde);
	}
	
	public void ausgeben(){
		stundeMinute.ausgeben();
		Ausgabe.print(":");
		sekunde.ausgeben();
	}

	public void unterstreichen(Zeichen zeichen) {
		stundeMinute.unterstreichen(zeichen);
		zeichen.ausgeben();
		sekunde.unterstreichen(zeichen);
	}
	
	public static Zeit vonEingabeEinlesen() throws ArrayIndexOutOfBoundsException, NumberFormatException {
		String zeit = Eingabe.naechsterString();
		String[] zeitArray = zeit.split(":");
		int[] zeitArrayInt = new int[zeitArray.length];
		for (int i = 0; i < zeitArray.length; i++){
			zeitArrayInt[i] = Integer.valueOf(zeitArray[i]);
		}
		return new Zeit(zeitArrayInt[0], zeitArrayInt[1], zeitArrayInt[2]);
	}
}
