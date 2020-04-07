//Example1 Log into facebbok using userid,password and log inbutton using chromeBrowser
import org.openqa.selenium.chrome.ChromeDriver;

public class Day5_0204_Ex1_FB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Chrome Browser
	System.setProperty("webdriver.chrome.driver", "E:\\Automation Framework\\chromedriver.exe");
	ChromeDriver driver =new ChromeDriver();
	driver.get("http://facebook.com"); // Open the URL  using chrome browser
	
	driver.findElementByXPath("//*[@id='u_0_m']").sendKeys("Nalini");
	
	//Enter Email in EditBox
	driver.findElementByXPath("//*[@id='email']").sendKeys("nk_biswal@yahoo.co.in");
	// Enter password in Password field
	driver.findElementByCssSelector("#pass").sendKeys("888u66866");
	driver.findElementByXPath("//*[@id='u_0_b']").click();
	
	//Comparing browser xpath and custom xpath using chrome
	
	driver.findElementByXPath("//*[@id='u_0_m']").sendKeys("Nalini");
	
		
}
}
