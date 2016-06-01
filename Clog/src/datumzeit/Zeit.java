package datumzeit;

import eingabeausgabe.Ausgabe;

public class Zeit {
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
}
