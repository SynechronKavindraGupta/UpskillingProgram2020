package practicePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3LocatorTechniques0331 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "servers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("file:///F:/Selenium/index/index.html");

		//Find element by id
		driver.findElement(By.id("firstname")).sendKeys("subbu");
		Thread.sleep(2000);
		driver.findElement(By.id("firstname")).clear();
		Thread.sleep(2000);

		//Find element by name
		driver.findElement(By.name("firstname")).sendKeys("Suresh");
		Thread.sleep(2000);
		driver.findElement(By.id("firstname")).clear();
		Thread.sleep(2000);

		//Find element by class name
		driver.findElement(By.className("beautifultextbox")).sendKeys("Suresh");
		Thread.sleep(2000);
		driver.findElement(By.id("firstname")).clear();
		Thread.sleep(2000);

		//Find Element by link text
		driver.findElement(By.linkText("rediff")).click();
		Thread.sleep(2000);
		driver.navigate().back();

		//Find element by partial ink text
		driver.findElement(By.partialLinkText("the top")).click();
		Thread.sleep(2000);
		driver.navigate().back();

		//Find element by tag name
		driver.findElement(By.tagName("input")).sendKeys("subbu");
		Thread.sleep(2000);
		driver.findElement(By.id("firstname")).clear();
		Thread.sleep(2000);

		//by Xpath
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Ganesh");
		Thread.sleep(2000);
		driver.findElement(By.id("firstname")).clear();
		Thread.sleep(2000);

		//by css selctor
		driver.findElement(By.cssSelector("input[id='firstname']")).sendKeys("Subbu");
		Thread.sleep(2000);
		driver.findElement(By.id("firstname")).clear();
		Thread.sleep(2000);
	}

}
