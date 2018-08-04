import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputDemo {

	public static void main(String[] args) throws Exception  {
		String file = "D://Demo/song.txt";
		FileInputStream istream = new FileInputStream(file);
		byte[] bar = new byte[istream.available()]; // array of the size of available bytes in stream
		istream.read(bar);	// converting byte array to string
		String content = new String(bar);
		System.out.println(content);
		
//		int ch = 0;
//		FileInputStream istream = new FileInputStream(file);
//		while (true)
//		{
//			ch = istream.read(); //reading a byte from the stream
//			if (ch==-1)				//EOF break loop
//				break;
//			System.out.print((char)ch);	// printing character
//		}
			istream.close();
	}

}
