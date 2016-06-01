package datumzeit;

import eingabeausgabe.Ausgabe;

public class Minute {
	private int minute = 0;
	
	public Minute(int minute){
		this.minute = minute;
	}
	
	public void ausgeben(){
		Ausgabe.print(minute);
	}
}
