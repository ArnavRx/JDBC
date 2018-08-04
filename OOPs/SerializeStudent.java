import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeStudent  {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Student polo = new Student(37, 39, 36);
		polo.result();
		
		String file = "D://Demo/student.dat";
		FileOutputStream fstream = new FileOutputStream(file);
		ObjectOutputStream ostream = new ObjectOutputStream(fstream);
		ostream.writeObject(polo);
		ostream.close();
		fstream.close();
		//Deserialization
		ObjectInputStream istream = new ObjectInputStream (new FileInputStream(file));
		Object obj = istream.readObject();
		Student student = (Student) obj;
		student.result();
		istream.close();
	}
	

}
