package test1;

class Animal//parent Class
{
	void Shout()
	{
		System.out.println("Every animals should Shout");
	}
}

class Dog extends Animal//Subclass1
{
	@Override
	void Shout()
	{
		System.out.println("Bark");
	}
	
}

class Cat extends Animal//Subclass2
{

	@Override
	void Shout()
	{
		System.out.println("Meow");
	}
	
}
class Horse extends Animal
{
	@Override
	void Shout() 
	{
		System.out.println("Neigh");
	}
	
}



public class RunTimePolymorphism {

	public static void main(String[] args) {
		
		//Instiating Objects
		
		Dog Tommy= new Dog();
		Tommy.Shout();
		
		Cat lily=new Cat();
		lily.Shout();
				
		Horse badal =new Horse();
		badal.Shout();
		

	}

}
