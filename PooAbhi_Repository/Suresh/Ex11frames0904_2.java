package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex11frames0904_2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "servers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		Actions a = new Actions(driver);
		WebElement src = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement trg = driver.findElement(By.xpath("//div[@id='droppable']"));
		a.dragAndDrop(src, trg).build().perform();
		driver.switchTo().defaultContent();
	}

}
