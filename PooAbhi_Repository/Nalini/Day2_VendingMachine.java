//Write a coffee Machine   0=Generate coffee,1 =tea, 2 =water,3 =milk1


import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
	
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter String Value");
	    int input = myObj.nextInt();
	   switch(input)
	   {
	   case 0:
	   System.out.println("Generate Coffee");
	   break;
	    case 1:
		 System.out.println("Generate Tea");
		 break;
	    case 2:
		System.out.println("Generate Milk");
		 break;
	     case 3:
		System.out.println("Generate Water");
		 break;
	   default:
		System.out.println("Invalid input");   	   
	   }
}
	}