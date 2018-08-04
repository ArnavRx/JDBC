
public class Car {
	private String model;
	private String[] features;

	public Car() {
	}

	public Car(String model, String... features) {
		this.model = model;
		this.features = features;
	}

	private void specs() {
		System.out.println("feat" + model);
		for (String feature : features) {
			System.out.print(feature);
		}

	}

	public static void main(String[] args) {
		Car alto = new Car("alto", "ps", "pw", "ke");
		String[] jazzf = { "ps", "pw", "ke" };
		Car jazz = new Car("jazz", jazzf);
		jazz.specs();
		alto.specs();
	}

}
