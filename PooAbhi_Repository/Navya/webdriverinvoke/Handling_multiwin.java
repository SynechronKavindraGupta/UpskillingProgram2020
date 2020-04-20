//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.Set;

public class Handling_MulWin {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "//Users//admin//Downloads//chromedriver" );
				WebDriver driver=new ChromeDriver();
				
				driver.get("https://accounts.google.com/signup");
				//driver.findElement(By.xpath("//div[@jsname='bCkDte']")).click();
				 driver.findElement(By.xpath("//a[contains(text(),'Terms')]"));
				//System.out.println(driver.getTitle());
				Set<String>ids=driver.getWindowHandles();
				Iterator<String> it=ids.iterator();
				String parentid = it.next();
				String childid = it.next();
				driver.switchTo().window(childid);
				System.out.println(driver.getTitle());
				driver.switchTo().window(parentid);
				System.out.println(driver.getTitle());
				
				
				
	}
}

