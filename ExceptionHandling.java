package test1;

class Employee1//Creating class As Employee
{
	private String firstName;
	private String lastName;
	//Constructor for initializing values
	public Employee1(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	//checking Exception and validating
	void validate() throws Exception
	{
		if(firstName==null && lastName==null)//Checking NullPointerException
		{
			 throw new NullPointerException("Entry Missing");
		}
		
		else if(firstName.length()<3 && lastName.length()<3)//Checking MinimumLengthException
		{
			throw new Exception("First name and last name should not be less than 3");
		}
	}
	
}

public class ExceptionHandling {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try {
			//Critical code
		Employee1 emp1 =new Employee1(null, null);
		emp1.validate();
		
		Employee1 emp2 =new Employee1("ab", "ab");
		emp2.validate();
		}
		//Cathing Exceptions
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		
		
		
		

	}

}
