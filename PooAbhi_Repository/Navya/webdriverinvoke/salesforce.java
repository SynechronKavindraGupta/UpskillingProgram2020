import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesforce {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "//Users//admin//Downloads//chromedriver" );
				WebDriver driver=new ChromeDriver();
				driver.get("https://login.salesforce.com//");
				driver.findElement(By.id("username")).sendKeys("Learn salesforce");
				driver.findElement(By.name("pw")).sendKeys("123");
				driver.findElement(By.className("button r4 wide primary")).click();//should throw error bcz compund classes are not allowed
	}
 
}

 