package main;

import data.DatensatzManager;
import eingabeausgabe.Eingabe;
import menues.Menue0;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eingabe.init();
		Menue0.run();
		DatensatzManager.ausgeben();
	}
}