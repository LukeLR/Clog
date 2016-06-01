package eingabeausgabe;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
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
			FileInputStream fileInputStream = new FileInputStream(path);
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			A result = (A) objectInputStream.readObject();
			return result;
		} catch (Exception ex){
			ex.printStackTrace();
			return null;
		}
	}
}
