
import org.openqa.selenium.By;

//import org.openqa.selenium.NoSuchElementException;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class dynodrop1 {



	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "//Users//admin//Downloads//chromedriver" );

		WebDriver driver=new ChromeDriver();

		driver.get("https://www.spicejet.com/");
		//driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		//driver.findElement(By.xpath("//a[@text='Bengaluru (BLR)']")).click();
		
		//Parent_child relationship xpath 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@text='Bengaluru (BLR)']")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@text='Goa (GOI)'][contains(text(),'Goa (GOI)')]")).click();
		
	
		
		
		
		
		
	}
	
}
	
