package test1;

class Employee//Creating Employee Class
{
	
	String FirstName;
	String LastName;
	
	public Employee(String firstName, String lastName) {//Initializing value with constructor
		super();
		FirstName = firstName;
		LastName = lastName;
	}

	@Override
	public String toString() {
		return "Employee [FirstName=" + FirstName + ", LastName=" + LastName + "]";//Printing Details with toString
	}

	
	
}

public class EmployeeDetailsBytoString {

	public static void main(String[] args) {
		
		//Creating three objects and printing values
		Employee emp=new Employee("Navneet", "Nitin");
		String Employee1=emp.toString();
		System.out.println("First Employee is: "+Employee1);
		
		Employee emp1=new Employee("Ravi", "Kumar");
		String Employee2=emp1.toString();
		System.out.println("Second Employee is: "+Employee2);
		
		Employee emp2= new Employee("Ram","Kumar");
		String Employee3 =emp2.toString();
		System.out.println("third Employee is: "+Employee3);
		
		

	}

}
