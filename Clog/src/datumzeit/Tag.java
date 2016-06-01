package datumzeit;

import eingabeausgabe.Ausgabe;

public class Tag {
	private int tag = 1;
	
	public Tag(int tag){
		this.tag = tag;
	}
	
	public void ausgeben(){
		Ausgabe.print(tag);
	}
}
