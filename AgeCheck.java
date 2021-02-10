package test1;
import java.util.Scanner;



public class AgeCheck {

	public static void main(String[] args) {
		
		//creating object of scanner Class
		Scanner scan =new Scanner (System.in);//scan as object of Scanner class
		
		
		System.out.println("Please enter no of people");//Asking for no of citizen(adults+ childrens +senior citizens)
		int n = scan.nextInt();	//storing total people

		int[] arr =new int[n];


		//	taking input in array
		System.out.println("Please enter ages of all the people");
		for(int i=0; i<=arr.length-1;i++) {
			arr[i] = scan.nextInt();//storing ages of peoples
		}


			int childrenCount=0;
			int adultCount=0;
			int seniorCount=0;

			for (int i1=0;i1<arr.length-1;i1++)//loop for checking age
			{
				if (arr[i1]<18)	//check for children
				{
					childrenCount=childrenCount+1;
				}
				else if (arr[i1]>18 && arr[i1]<=54)//check for Adults	
				{
					adultCount=adultCount+1;
				}
				else{
					seniorCount=seniorCount+1;//Check for senior citizen
				}
			}
			//printing counts of Childrens,Adults and Senior citizen
			System.out.println("Childrens: "+childrenCount);
			System.out.println("Adults: "+adultCount);
			System.out.println("Senior Citizen: "+seniorCount);
			
		}
	}


