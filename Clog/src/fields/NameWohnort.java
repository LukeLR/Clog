package fields;

import eingabeausgabe.Ausgabe;
import textangaben.Nachname;
import textangaben.Name;
import textangaben.Vorname;
import textangaben.Wohnort;

public class NameWohnort {
	private Name name;
	private Wohnort wohnort;
	
	public NameWohnort(String vorname, String nachname, String wohnort){
		this.name = new Name(vorname, nachname);
		this.wohnort = new Wohnort(wohnort);
	}
	
	public NameWohnort(Vorname vorname, Nachname nachname, Wohnort wohnort){
		this.name = new Name(vorname, nachname);
		this.wohnort = wohnort;
	}
	
	public void ausgeben(){
		Ausgabe.print("Name: ");
		name.ausgeben();
		Ausgabe.printline();
		Ausgabe.print("Wohnort: ");
		wohnort.ausgeben();
		Ausgabe.printline();
	}
}
