package datumzeit;

import java.io.Serializable;

import eingabeausgabe.Ausgabe;

public class Tag implements Serializable {
	private int tag = 1;
	
	public Tag(int tag){
		this.tag = tag;
	}
	
	public void ausgeben(){
		Ausgabe.print(tag);
	}
}
