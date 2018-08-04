import java.io.*;


public class FileCopyDemo {

	public static void main(String[] args) throws Exception {
		BufferedInputStream istream = new BufferedInputStream(new FileInputStream("D://copy/NPSWF32.dll"));
		BufferedOutputStream ostream = new BufferedOutputStream(new FileOutputStream("D://copy/NPSWF32.dll"));
		long startTime = System.currentTimeMillis();
		int ch = 0;
		while (true) {
			 ch = istream.read();
			if(ch==-1) break;
				ostream.write(ch);
	}
		System.out.println(System.currentTimeMillis()-startTime);
		ostream.flush();
		ostream.close();
		istream.close();

	}

}
