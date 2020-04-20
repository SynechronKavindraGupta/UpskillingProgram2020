import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Implicit_wait {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "//Users//admin//Downloads//chromedriver" );
				WebDriver driver=new ChromeDriver();
				
				//implicit wait_globally declared
				
				//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				
				
				
				String[] veggies = {"Cucumber","Brocolli"};
				
				driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
				Thread.sleep(3000);
				addItems{driver,veggies};
				driver.findElement(By.xpath("//a[@class='cart-icon']//img[contains(@class,' ')]")).click();
				driver.findElement(By.xpath("//div[@class='product-action']/button")).click();
				driver.findElement(By.xpath("//input[@placeholder='Enter promo code']")).sendKeys("rahulshettyacademy");
				driver.findElement(By.xpath("//button[@class='promoBtn']"));
				
				//Explicit wait
				WebDriverWait w = new WebDriverWait(driver,5);
				w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter promo code']")));
				driver.findElement(By.xpath("//span[@class='promoInfo']")).getText();
				
				
				
	}

		

public static void addItems(WebDriver driver,String[] veggies)
{
	int j = 0;
List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));

for(int i=0;i<products.size();i++)
{
	String[] name = products.get(i).getText().split("-");
	String formattedName = name[0].trim();
	
	
	//convert array to arraylist for easy search
	List<String> a1 = Arrays.asList(veggies);
	


if(a1.contains(formattedName))
{
	j++;
  driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
  
  if(j==veggies.length);
  {
  break;
}
}
}
}
}
