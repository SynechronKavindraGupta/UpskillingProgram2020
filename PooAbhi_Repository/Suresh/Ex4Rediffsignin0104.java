package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex4Rediffsignin0104 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "servers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.rediff.com");
		driver.findElement(By.cssSelector("a[class*='signin']")).click();
		driver.findElement(By.cssSelector("input[id*='login1']")).sendKeys("TestUser");
		//driver.findElement(By.cssSelector("input[id*='password']")).sendKeys("12345");
		//driver.findElement(By.cssSelector("input[value*='Sign in']")).click();
		//cssSelector-tagname#id
		//driver.findElement(By.cssSelector("input#password")).sendKeys("12345");
		//driver.findElement(By.cssSelector("input[value*='Sign in']")).click();
		// x path with Contains for Submit button
		driver.findElement(By.cssSelector("input#password")).sendKeys("12345");
		//driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
		// X path - from Parent to child obj
		driver.findElement(By.xpath("//div[@class='cell']/input[@type='submit']")).click();
		
	driver.findElement(By.xpath("//div[@id='top_news_container']/ul[2]")).click();
		
		
		
		
	}
	

}
