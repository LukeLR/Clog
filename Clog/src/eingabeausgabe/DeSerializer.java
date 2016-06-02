package eingabeausgabe;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeSerializer<A> {
	public void writeToFile(Path path, A anObject) throws IOException{
		FileOutputStream fileOutputStream = new FileOutputStream(path);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(anObject);
		objectOutputStream.close();
	}
	
	public A readFromFile(Path path) throws FileNotFoundException, IOException, ClassNotFoundException{
		FileInputStream fileInputStream = new FileInputStream(path);
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		@SuppressWarnings("unchecked")
		A result = (A) objectInputStream.readObject();
		objectInputStream.close();
		return result;
	}
}
