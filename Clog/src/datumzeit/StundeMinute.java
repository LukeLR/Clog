package datumzeit;

import java.io.Serializable;

import eingabeausgabe.Ausgabe;

public class StundeMinute implements Serializable {
	private Stunde stunde;
	private Minute minute;
	
	public StundeMinute(int stunde, int minute){
		this.stunde = new Stunde(stunde);
		this.minute = new Minute(minute);
	}
	
	public void ausgeben(){
		stunde.ausgeben();
		Ausgabe.print(":");
		minute.ausgeben();
	}
}
