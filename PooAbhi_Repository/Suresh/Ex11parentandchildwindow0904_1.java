package testPackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex11parentandchildwindow0904_1 {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "servers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://accounts.google.com/signin");
	driver.findElement(By.xpath("//a[@jsname='JFyozc']")).click();
	driver.getTitle();
	Thread.sleep(3000);
	Set<String> ids= driver.getWindowHandles();
	Iterator<String> it = ids.iterator();
	String parentid = it.next();
	String childid = it.next();
	driver.switchTo().window(childid);
	driver.getTitle();
	driver.switchTo().window(parentid);
	
			
	}

}
