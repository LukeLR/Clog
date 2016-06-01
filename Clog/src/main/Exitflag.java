package main;

public class Exitflag {
	private static boolean exitflag = false;
	
	public static void exitNow(){
		exitflag = true;
	}
	
	public static boolean exit(){
		return exitflag;
	}
}
