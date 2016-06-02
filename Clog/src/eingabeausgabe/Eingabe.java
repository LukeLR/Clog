package eingabeausgabe;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Eingabe {
	private static Scanner scanner = new Scanner(System.in);
	private static Pattern defaultDelimiter;
	
	public static String naechsterString(String delimiter){
		scanner.skip("\n");
		scanner.useDelimiter(delimiter);
		String eingabe = scanner.next();
		scanner.reset();
		scanner.skip(delimiter);
		return eingabe;
	}
	
	public static String naechsterString(){
		return scanner.next();
	}
	
	public static String naechsteZeile(){
		return scanner.nextLine();
	}
	
	public static int naechsterInteger(){
		return scanner.nextInt();
	}
}
