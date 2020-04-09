

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath1 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "//Users//admin//Downloads//chromedriver" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com//");
		
		driver.findElement(By.id("username")).sendKeys("sending keys by css selector");
		driver.findElement(By.name("pw")).sendKeys("123");
		
		//driver.findElement(By.cssSelector("input#Login.button.r4.wide.primary")).click();
		driver.findElement(By.xpath("//input[@id='Login']")).click();
	}
 
}