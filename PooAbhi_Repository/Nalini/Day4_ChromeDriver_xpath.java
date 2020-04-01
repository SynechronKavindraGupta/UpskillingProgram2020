import org.openqa.selenium.chrome.ChromeDriver;

public class Day4_ChromeDriver_xpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Framework\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://login.salesforce.com"); //URL open the browser
		System.out.println(driver.getTitle());
		
		driver.findElementById("email").sendKeys("nk_biswal@yahoo.co.in");
		driver.findElementByName("pass").sendKeys("xxxx");
		//Using linktest  identifying element
		 driver.findElementByLinkText("Forgotten account?").click();
	}

}
