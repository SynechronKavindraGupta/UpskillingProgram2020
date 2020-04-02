package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex5SpicejetDropdown0204 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "servers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.spicejet.com");
		Select s = new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']")));
		
		s.selectByValue("USD");
		Thread.sleep(3000);
		s.selectByIndex(1);
		Thread.sleep(3000);
		s.selectByVisibleText("USD");
		Thread.sleep(3000);
		s.selectByVisibleText("Select");
		
		
	}

}
