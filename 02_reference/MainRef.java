public class MainRef {
	public static void main(String[] args) {
		int i = 5;
		int i2 = i;
		System.out.println(i + " : " + i2);
		i2 = 10;
		System.out.println(i + " : " + i2);
		System.out.println("=========================");

		int[] ia = {1, 2};
		System.out.println(ia[0] + " : " + ia[1]);
		eToA(ia);
		System.out.println(ia[0] + " : " + ia[1]);
		System.out.println("=========================");

		Employee emp1 = new Employee();
		emp1.salary = 100;
		Employee emp2 = emp1;
		System.out.println(emp1.salary + " : " + emp2.salary);
		emp2.salary = 200;
		System.out.println(emp1.salary + " : " + emp2.salary);
	}

	public static void eToA(int[] ia) {
		ia[1] = 3;
	}
}

class Employee {
	int salary;
}
