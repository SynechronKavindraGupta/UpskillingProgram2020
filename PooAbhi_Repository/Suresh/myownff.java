package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class myownff {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "servers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.udemy.com/");
		//driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);
		Thread.sleep(10000);
		//driver.findElement(By.xpath("//div/button[@data-purpose='header-login']")).click();
		
		WebElement textbox = driver.findElement(By.xpath("//input[@placeholder='Search for anything']"));
		textbox.sendKeys("java");
		textbox.sendKeys(Keys.ENTER);
		Thread.sleep(10000);
		
		//System.out.println(driver.findElement(By.xpath("//div[@data-purpose='search-results-header']")).getText());
		driver.findElement(By.xpath("//button[contains(@class,'all-filters')]")).click();
		
		driver.findElement(By.xpath("//div[@class='panel--content-wrapper--1yFBX']//div//div//div//div//label//span[1]")).click();
		//div[@class='panel--content-wrapper--1yFBX']//div//div//div//div//label//span[1]
		//driver.findElement(By.xpath("//input[@value='4470']")).click();
		
		//driver.findElement(By.xpath("//label[@for='u159-checkbox--192']")).click();
		
		//input[@id='u159-checkbox--197']
		//driver.findElement(By.xpath("//input[@id='u159-checkbox--197']")).click();
		
		
		
	}

}
