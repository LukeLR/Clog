package datumzeit;

import java.io.Serializable;

import eingabeausgabe.Ausgabe;

public class Tag implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4588817139788996859L;
	private int tag = 1;
	
	public Tag(int tag){
		this.tag = tag;
	}
	
	public void ausgeben(){
		Ausgabe.print(tag);
	}
}
