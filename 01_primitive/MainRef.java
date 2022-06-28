public class MainRef {
	public static void main(String[] args) {
		Employee employee = new Employee("Original name");
		System.out.println("1. " + employee.getName());

		changeName(employee);
		System.out.println("2. " + employee.getName());
	}

	public static void changeName(Employee employee) {
		employee.setName("This is a name");
	}
}

class Employee {
	private String name;

	public Employee() {}

	public Employee(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}
