
public class Demo<X> {
	private X data;

	public Demo() {
	}

	public Demo(X data) {
		this.data = data;
	}

	public X getData() {
		return data;
	}

	public void setData(X data) {
		this.data = data;
	}

	public static void main(String[] args) {
		Demo<String> d1 = new Demo<String>("Hello");
		//d1.setData(10);
		System.out.println(d1.getData());
		Demo d2 = new Demo(5000);
		System.out.println(d2.getData());
	}
}
