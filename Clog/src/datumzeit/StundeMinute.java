package datumzeit;

import java.io.Serializable;

import eingabeausgabe.Ausgabe;

public class StundeMinute implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8712337476061266723L;
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
