
public class MyRunnable implements Runnable {

	private int data;
	 
	 @Override
	public void run() {
		 String name = Thread.currentThread().getName();
		 for (int i = 0 ; i<=50 ; i++)
			 System.out.println(name + " " + ++data);
	}
	
	 
	public static void main(String[] args) {
			MyRunnable mr = new MyRunnable();
			Thread t1 = new Thread(mr, "first");
			Thread t3 = new Thread(mr, "sec");
			Thread t2 = new Thread(mr, "third");
			t1.start();
			t2.start();
			t3.start();
	}

}
