package testPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Ex5SpiceJetUpdateDropdown0204_1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "servers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
		driver.manage().window().maximize();
		driver.get("http://www.spicejet.com");
		Thread.sleep(5000);
		//WebDriverWait d=new WebDriverWait(driver,20);
		//d.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='divpaxOptions']")));

		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		Thread.sleep(3000);
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;		
		Select s=new Select(driver.findElement(By.xpath("//select[@id=\"ctl00_mainContent_ddl_Adult\"]")));
		s.selectByValue("5");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());

	}

}
