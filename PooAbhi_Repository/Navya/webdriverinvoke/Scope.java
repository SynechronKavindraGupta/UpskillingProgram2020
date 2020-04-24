import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "//Users//admin//Downloads//chromedriver" );
				WebDriver driver=new ChromeDriver();
				driver.get("http://qaclickacademy.com/practice.php");
				
				//1.no of links in the page
				System.out.println(driver.findElements(By.tagName("a")).size());	
				
				//2.count for footer section
				WebElement footerdriver = driver.findElement(By.id("gf-BIG")); //limiting webdriver scope 
				System.out.println(footerdriver.findElements(By.tagName("a")).size());
				
				//3.counting the no of links under section 
				WebElement columndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
				
				System.out.println(columndriver.findElements(By.tagName("a")).size());
				
				//4. click on each link in the column and check if the pages are opening
				
				for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++)

                 {
				   	
				   String clickonlinktab = Keys.chord(Keys.CONTROL,Keys.ENTER);
	
                	   columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinktab);
                	   Thread.sleep(4000);
                	   
                 }
                	   Set<String> abc =  driver.getWindowHandles();
                	   Iterator<String> it = abc.iterator();
                 
				
                	 while(it.hasNext())
                	 {
                		 driver.switchTo().window(it.next());
                		 System.out.println(driver.getTitle());
                		 
                	 }
                		   
                	   
                	   
                	   
                	   
                	   
                	   
                	   
                	   
                	   
                	   
                	   
                	   
                	   
	             
}
}