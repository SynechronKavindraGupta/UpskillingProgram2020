import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
//import java.util.Arrays;
import java.util.List;


public class ecommapp {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "//Users//admin//Downloads//chromedriver" );
				WebDriver driver=new ChromeDriver();
				String[] veggies = {"Cucumber","Brocolli"};
				
				driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
				List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
				
				for(int i=0;i<products.size();i++)
				{
					String name = products.get(i).getText();
					
					
					//convert array to arraylist for easy search
					List a1 = Arrays.asList(veggies);
				
				if(a1.contains(name))
				{
				  driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				  break;
				}
				}
				}
}
			

