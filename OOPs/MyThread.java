
public class MyThread extends Thread {

	private int data;

	public MyThread(String string) {
		super (string);
	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		for (int c = 0; c <= 2; c++) {
			System.out.println(++data+name);
		}
	}

	public static void main(String[] args) {
		MyThread mt1 = new MyThread("First");
		MyThread mt2 = new MyThread("Second");
		MyThread mt3 = new MyThread("Third");
		mt1.start();
		mt2.start();
		mt3.start();

	}
}
							