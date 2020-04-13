import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class UdemyLogin {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Framework\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.udemy.com");
		String appTitle = driver.getTitle();
        System.out.println("Application title is :: "+appTitle);

      driver.findElement(By.xpath("//div/button[text()='Log In']")).click();
      
      if (driver.findElement(By.xpath("//div/input[@name='email']")).isDisplayed() ==true)
      
    //  driver.findElement(By.xpath("//div/input[@name='email']")).sendKeys("nabiswal@gmail.com");
      {  driver.findElement(By.xpath("//div/input[@name='password']")).sendKeys("sinu66866");
      
      driver.findElement(By.xpath("//div/input[@type='submit']")).click();
      
      driver.findElement(By.xpath("//span/input[@data-purpose='search-input']")).isDisplayed();
      driver.findElement(By.xpath("//span/input[@data-purpose='search-input']")).sendKeys("java");
   
      //click on filters button to select the checkboxes
      driver.findElement(By.xpath("//button[contains(@class,'all-filter')]")).click();

      //wait for check boxes container to be displayed.
      driver.findElement(By.xpath("(//div[@class='container'])[2]")).isDisplayed();

      //now select the checkboxes
      driver.findElement(By.xpath("//span[text()='Android Development']/../../input[@type='checkbox']")).click();
      driver.findElement(By.xpath("//span[text()='Beginner']/../../input[@type='checkbox']")).click();
      driver.findElement(By.xpath("//span[text()='English']/../../input[@type='checkbox']")).click();

      //click on apply button
      driver.findElement(By.xpath("//button[text()='Apply']")).click();
    
		
		
      }
		
	}

}
