package testPackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Udemy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "servers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		// System.setProperty("webdriver.chrome.driver", "server/chromedriver.exe");
		// WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.udemy.com/");

		// Thread.sleep(6000);
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		// driver.findElement(By.xpath("//button[@class='btn.btn-quaternary']")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sureshtesting@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Testing11");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		Thread.sleep(5000);

		WebElement textbox = driver.findElement(By.xpath("//input[@placeholder='Search for anything']"));
		textbox.sendKeys("java");
		textbox.sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);

		// driver.findElement(By.xpath("//label[@for='filter-button']")).click();

		 driver.findElement(By.xpath("//button[contains(@class,'all-filters')]")).click();

		// driver.getTitle();
		// Set<String> ids= driver.getWindowHandles();
		// Iterator<String> it = ids.iterator();
		// String parentid = it.next();
		// String childid = it.next();
		// driver.switchTo().window(childid);
		// driver.getTitle();

		// click on Android Development
		driver.findElement(By.xpath("//span[contains(text(),'Android Development')]")).click();

		// Level xpath - //label[@for='u77-accordion-panel--201']
		// click on Beginner
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElements(By.xpath("//span[contains(text(),'Beginner')]")).get(0).click();
		// Language xpath - //label[@for='u164-accordion-panel--207']
		// click on English check box
		Thread.sleep(3000);
		driver.navigate().back();
		if (driver.findElements(By.xpath("//label[contains(text(),'Language')]")).get(0).getAttribute("aria-expanded")
				.equalsIgnoreCase("false")) {
			driver.findElements(By.xpath("//label[contains(text(),'Language')]")).get(0).click();
		}
		driver.findElements(By.xpath("//span[text()='English']")).get(0).click();
		// driver.findElement(By.xpath("//button[text()='Apply']")).click();
		Thread.sleep(3000);
		driver.navigate().back();

	}

}
