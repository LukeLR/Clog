package datumzeit;

import java.io.Serializable;

import eingabeausgabe.Ausgabe;

public class Minute implements Serializable {
	private int minute = 0;
	
	public Minute(int minute){
		this.minute = minute;
	}
	
	public void ausgeben(){
		Ausgabe.print(minute);
	}
}
