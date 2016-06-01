package textangaben;

import eingabeausgabe.Ausgabe;

public class Name {
	private Vorname vorname;
	private Nachname nachname;
	
	public Name(String vorname, String nachname){
		this.vorname = new Vorname(vorname);
		this.nachname = new Nachname(nachname);
	}
	
	public Name(Vorname vorname2, Nachname nachname2) {
		this.vorname = vorname;
		this.nachname = nachname;
	}

	public void ausgeben(){
		Ausgabe.printline(vorname + " " + nachname);
	}
	
	/*public int length(){
		int vornameLaenge = vorname.length();
		int nachnameLaenge = nachname.length();
		return vornameLaenge + nachnameLaenge;
	}*/
}
