package testPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex7CheckBoxSpiceJet0604 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "servers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
		driver.manage().window().maximize();
		driver.get("http://www.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
		driver.findElement(By.xpath("//input[@value='RoundTrip']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='OneWay']")).click();
		
		System.out.println(driver.findElements(By.xpath("//input[@type='radio']")).size());
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();
		//driver.findElement(By.xpath("//a[@value='MAA']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@class,'ui-state-highlight')]")).click();
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		
		
	}

}
