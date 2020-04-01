package practicePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1WebDriverMethods0330 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "servers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///F:/Selenium/index/index.html");
		System.out.println("Title: "+driver.getTitle());
		System.out.println("Current URL: "+driver.getCurrentUrl());
		//System.out.println("Page Source: "+driver.getPageSource());
		System.out.println("Window Handle: "+driver.getWindowHandle());
		System.out.println("Window Handles: "+driver.getWindowHandles());
		driver.findElement(By.linkText("Google Link")).click();
		Thread.sleep(3000);
		System.out.println("Window Handles: "+driver.getWindowHandles());
		driver.quit();
		

	}

}
