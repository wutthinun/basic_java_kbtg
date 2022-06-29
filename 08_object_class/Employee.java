public class Employee {

	private static final String UNIT = " min.";

	private static final String NAP_PREFIX = "I'm taking a nap, Please w8 4 : ";

	String name;
	int age;
	String designation;
	double salary;

	public Employee() {
	}

	public Employee(
			String name,
			int age,
			String designation,
			double salary) {
		this.name = name;
		this.age = age;
		this.designation = designation;
		this.salary = salary;
	}

	/**
	 * @param duration is a duration time in minute
	 */
	public String takeANap(int duration) {
		return NAP_PREFIX + duration + UNIT;
	}

	@Override
	public String toString() {
		return "Employee {age:" + age +
		", designation:" + designation +
		", name:" + name +
		", salary:" + salary + "}";
	}
}
