
public class Person implements Comparable<Person> {
	private String name;
	private int age;

	public Person() {
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "name" + name + " age" + age;
	}

	public int getAge() {
		return age;
	}

	@Override
	public int compareTo(Person p) {
		return name.compareTo(p.name);
	}

}
