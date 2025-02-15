package application;

public class Program {
	public static void main(String[] args)
	{
		//Declarations & Initialization
		Employee emp  = new Employee("John Smith", 40, 25.65);
		Employee emp1  = new Employee("Kai liu", 40, 27.65);
		Manager man = new Manager("Lorenzo Amato", 40, 30, 500);

		Employee[] empList = {emp, emp1, man};

		for(int index = 0 ; index < empList.length ; ++index)
		{
			System.out.printf("%d : The salary of %s is %.2f\n", index + 1, empList[index].getName(), empList[index].calcPay());
		}


		System.out.println("     ");
		for(int index = 0 ; index < empList.length ; ++index)
		{
			System.out.printf("%d : The salary of %s\n", index + 1, empList[index]);
		}
		System.out.println(" ");
/*
		//set the values
		emp.setName("John Smith");
		emp.setHours(40);
		emp.setHourlySalary(25.65);

		man.setName("Lorenzo Amato");
		man.setHours(40);
		man.setHourlySalary(30);
*/
		//print the salary
		System.out.printf("The salary for %s is %.2f\n", emp.getName(), emp.calcPay());
		System.out.printf("The salary for %s is %.2f\n", man.getName(), man.calcPay());

	}
}
