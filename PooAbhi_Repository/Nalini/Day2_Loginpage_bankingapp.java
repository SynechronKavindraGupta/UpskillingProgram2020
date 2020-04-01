import java.util.Scanner;

public class loginpage_bankingapp {

	/*Write a program for  log in page of Banking Application
	 * Editbox should take 6-12 character
	 * three invalid username, 4th attempt should blocked
	 */
	public static void main(String[] args) {	
	int i;
	i=1;
	Scanner myObj = new Scanner(System.in);
	
	for (i=1;i<=3;i++)
	{
	System.out.println("Enter User Name");
	Scanner s = null;
	String username =s.next();
	int len = username.length();
	
	if  (len>=6 && len<=12){
		System.out.println("log in Successful");
		break;
	}
	}
	if (i>4) 
	
	{
		System.out.println("You are blocked,Try after 24 hours");
		}
	}
}
