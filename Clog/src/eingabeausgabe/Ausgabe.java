package eingabeausgabe;

import java.io.PrintStream;

public class Ausgabe {
	private static PrintStream destination = System.out;
	
	public static void printline(String ausgabe){
		destination.println(ausgabe);
	}
	
	public static void printline(){
		destination.println();
	}
	
	public static void print(String ausgabe){
		destination.print(ausgabe);
	}
	
	public static void print(int ausgabe){
		destination.print(ausgabe + "");
	}
}
