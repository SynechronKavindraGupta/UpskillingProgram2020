import java.util.ArrayList;

import java.util.List;



import org.openqa.selenium.By;

//import org.openqa.selenium.NoSuchElementException;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class spicejet {



	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "//Users//admin//Downloads//chromedriver" );

		WebDriver driver=new ChromeDriver();

		driver.get("https://www.spicejet.com/");
		Select s = new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']")));
		s.selectByIndex(2);
		s.selectByVisibleText("Adult");
		s.selectByValue("USD");
		System.out.println(s);
		
	}
	
}