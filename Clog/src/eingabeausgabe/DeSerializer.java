package eingabeausgabe;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class DeSerializer<A> {
	public void writeToFile(Path path, A anObject){
		try{
			FileOutputStream fileOutputStream = new FileOutputStream(path);
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(anObject);
			objectOutputStream.close();
		} catch (Exception ex){
			ex.printStackTrace();
		}
	}
	
	public A readFromFile(Path path){
		try{
			
		}
	}
}
