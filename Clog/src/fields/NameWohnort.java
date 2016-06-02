package fields;

import java.io.Serializable;

import eingabeausgabe.Ausgabe;
import textangaben.Nachname;
import textangaben.Name;
import textangaben.Vorname;
import textangaben.Wohnort;
import textangaben.Zeichen;

public class NameWohnort implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 119015723719966835L;
	private Name name;
	private Wohnort wohnort;
	
	public NameWohnort(String vorname, String nachname, String wohnort){
		this.name = new Name(vorname, nachname);
		this.wohnort = new Wohnort(wohnort);
	}
	
	public NameWohnort(Name name, Wohnort wohnort){
		this.name = name;
		this.wohnort = wohnort;
	}
	
	public void ausgeben(){
		Ausgabe.print("Name: ");
		name.ausgeben();
		Ausgabe.print(" ");
		Ausgabe.print("Wohnort: ");
		wohnort.ausgeben();
		Ausgabe.print(" ");
	}
	
	public void unterstreichen(Zeichen zeichen){
		for (int i = 0; i < ("Name: " + " Wohnort:  ").length(); i++){
			zeichen.ausgeben();
		}
		name.unterstreichen(zeichen);
		wohnort.unterstreichen(zeichen);
	}
	
	public static NameWohnort vonEingabeEinlesen(){
		Name name = Name.vonEingabeEinlesen();
		Wohnort wohnort = Wohnort.vonEingabeEinlesen();
		return new NameWohnort(name, wohnort);
	}
}
