package javacollections;

public class Person implements Comparable<Person> {

	String name;
	int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public int compareTo(Person o) {
		if (this.getAge()<o.getAge())
		return 1;
		else if (this.getAge()>o.getAge())
			return -1;
		else
			return 0;
		
	}
}
