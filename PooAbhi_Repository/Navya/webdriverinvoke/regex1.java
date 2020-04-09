import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class regex1 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "//Users//admin//Downloads//chromedriver" );
				WebDriver driver=new ChromeDriver();
				driver.get("http://facebook.com");
				//driver.findElement(By.cssSelector("input[name*='email']")	).sendKeys("reg express");
				driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("reg exp1");
				driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("12345");
				
}
	
}