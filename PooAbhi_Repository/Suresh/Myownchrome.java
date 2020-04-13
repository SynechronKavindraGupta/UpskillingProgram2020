package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Myownchrome {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "servers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(10000);
		driver.get("https://www.udemy.com/");
		//driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);
		Thread.sleep(10000);
		driver.findElement(By.partialLinkText("login")).click();
		//driver.findElement(By.xpath("//div/button[@data-purpose='header-login']")).click();
		//driver.findElement(By.xpath("//button[@class='btn.btn-quaternary']")).click();
		
		
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sureshtesting@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Testing11");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		Thread.sleep(5000);
		
		// Searching
		
		WebElement textbox = driver.findElement(By.xpath("//input[@placeholder='Search for anything']"));
		textbox.sendKeys("java");
		textbox.sendKeys(Keys.ENTER);
		Thread.sleep(10000);
		
		System.out.println(driver.findElement(By.xpath("//div//span[@class='udlite-heading-md filter-panel--item-count--2JGx3']")).getText());
		//click on Fliter
		driver.findElement(By.xpath("//div[@class='filter-button-container--button-bar--DU5FK']//label")).click();
		
		
		// This should be True
		// Topic xpath - //label[@for='u77-accordion-panel--180']
		
		//click on Android Development
		 driver.findElement(By.xpath("//div[@class='panel--content-wrapper--1yFBX']//div//div//div//div//label//input[@value='4470']"))
		.click();
		 
		 // Level xpath - //label[@for='u77-accordion-panel--201']
		// click on Beginner
		 driver.findElement(By.xpath("//div[@class='panel--content-wrapper--1yFBX']//div//div//div//input[@value='beginner']")).click();
			// Language xpath - //label[@for='u164-accordion-panel--207']
		//click on English check box
		 driver.findElement(By.xpath("//div//fieldset[@name='Language']//label/input[@value='en']")).click(); 
		
		// after apply the fileter we need to take the esults 
		// x path = //div//span[@class='udlite-heading-md filter-panel--item-count--2JGx3']
		
			}

}
