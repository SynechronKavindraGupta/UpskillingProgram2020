import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.Actions;

//import java.util.Iterator;
//import java.util.Set;

public class Frames_practise {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "//Users//admin//Downloads//chromedriver" );
				WebDriver driver=new ChromeDriver();
				
				driver.get("https://jqueryui.com/droppable/");
				driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
				driver.findElement(By.id("draggable"));
				driver.findElements(By.tagName("iframe"));
				Actions a = new Actions(driver);
				WebElement source = driver.findElement(By.id("draggable"));
				WebElement target = driver.findElement(By.id("droppable"));
				a.dragAndDrop(source, target).build().perform();
				
				
	}
}