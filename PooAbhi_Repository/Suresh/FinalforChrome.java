package testPackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FinalforChrome {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "servers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.udemy.com/");

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		// Thread.sleep(6000);
		// div[@class='header--gap-xs--1q0SU'] //span[text()='Log in']
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		// driver.findElement(By.xpath("//button[text()='Log In']")).click();
		// driver.findElement(By.xpath("//div/button[@data-purpose='header-login']")).click();
		// driver.findElement(By.xpath("//button[@class='btn.btn-quaternary']")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sureshtesting@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Testing11");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		Thread.sleep(5000);

		WebElement textbox = driver.findElement(By.xpath("//input[@placeholder='Search for anything']"));
		textbox.sendKeys("java");
		textbox.sendKeys(Keys.ENTER);
		// driver.findElement(By.xpath("//label[@for='filter-button']")).click();

		driver.findElement(By.xpath("//button[contains(@class,'all-filters')]")).click();
		Thread.sleep(5000);
		
		driver.getTitle();
		Set<String> ids= driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String parentid = it.next();
		String childid = it.next();
		driver.switchTo().window(childid);
		driver.getTitle();
		
		
		// click on Android Development
		driver.findElement(By.xpath("//span[text()='Android Development']")).click();

		// Level xpath - //label[@for='u77-accordion-panel--201']
		// click on Beginner
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[text()='Beginner'])[1]")).click();
		// Language xpath - //label[@for='u164-accordion-panel--207']
		// click on English check box
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[text()='English'])[1]")).click();
		driver.findElement(By.xpath("//button[text()='Apply']")).click();

	}

}
