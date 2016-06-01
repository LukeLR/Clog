package datumzeit;

import java.io.Serializable;

import eingabeausgabe.Ausgabe;
import textangaben.Zeichen;

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

	public void unterstreichen(Zeichen zeichen) {
		String tagString = String.valueOf(tag);
		for (int i = 0; i < tagString.length(); i++){
			zeichen.ausgeben();
		}
	}
}
