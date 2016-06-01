package eingabeausgabe;

import java.util.Scanner;

public class Eingabe {
	private static Scanner scanner = new Scanner(System.in);
	
	public static String naechsterString(){
		return scanner.next();
	}
	
	public static int naechsterInteger(){
		return scanner.nextInt();
	}
}
