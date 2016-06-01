package textangaben;

import java.io.Serializable;

import eingabeausgabe.Ausgabe;

public class Name implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3440007920605732291L;
	private Vorname vorname;
	private Nachname nachname;
	
	public Name(String vorname, String nachname){
		this.vorname = new Vorname(vorname);
		this.nachname = new Nachname(nachname);
	}
	
	public Name(Vorname vorname, Nachname nachname) {
		this.vorname = vorname;
		this.nachname = nachname;
	}

	public void ausgeben(){
		vorname.ausgeben();
		Ausgabe.print(" ");
		nachname.ausgeben();
	}
	
	/*public int length(){
		int vornameLaenge = vorname.length();
		int nachnameLaenge = nachname.length();
		return vornameLaenge + nachnameLaenge;
	}*/
}
