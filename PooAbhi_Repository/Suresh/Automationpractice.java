package firstPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automationpractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "servers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
		
		 driver.findElement(By.xpath("//a[@class='login']")).click();
		 
		 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("hbsuresh11@gmail.com");
		
		 driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("Automation@11");
		 
		 driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
		 
		
		 WebElement textbox = driver.findElement(By.xpath("//input[@id='search_query_top']"));
		 	
			textbox.sendKeys("T-shirt");
			textbox.sendKeys(Keys.ENTER);
			
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[@title='Faded Short Sleeve T-shirts']")).click();
		 
		// driver.findElement(By.xpath("//span[@class='available-now']")).click();
			Thread.sleep(3000);
			
			String ItmPrice = driver.findElement(By.xpath("//span[@id='our_price_display']")).getText();
			
			System.out.println(ItmPrice);
			
			driver.findElement(By.xpath("//p[@id='add_to_cart']")).click();
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//p[@class='cart_navigation clearfix']/a[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@name='processAddress']")).click();
			Thread.sleep(3000);  
		
			
			driver.findElement(By.xpath("//div[@class='checker']")).click();
			
			
			driver.findElement(By.xpath("//button[@name='processCarrier']")).click();
			
			String CartPrice = driver.findElement(By.xpath("(//td[@class='price'])[1]")).getText();
			
			
			System.out.println(CartPrice);
			//(//td[@class='price'])[1]
			
			 if(ItmPrice.equalsIgnoreCase(CartPrice))
		        {
		            System.out.println("Both ItmPrice and CartPrice are Same");
		        }
		        else{
		            System.out.println("Both ItmPrice and CartPrice are not Same");
		        }
		
					
			
			driver.findElement(By.xpath("//a[@class='bankwire']")).click();
			
			
			
			driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']")).click();
			
			
			
			String FinalStatus = driver.findElement(By.xpath("//p[@class='cheque-indent']")).getText();
			
			System.out.println(FinalStatus);
						
			//a[@class='logout']
			// getting the Order status
			
			assertEquals(FinalStatus,"Your order on My Store is complete.");
			if(FinalStatus.equals("Your order on My Store is complete.")) {
			    System.out.println("Order Current Status is:"+FinalStatus);
			} else {
			    System.out.println("Order Status is not found");
			}
			//System.out.println(FinalStatus);
			
			
			
			
			driver.findElement(By.xpath("//a[@class='logout']")).click();
	}

	private static void assertEquals(String finalStatus, String string) {
		// TODO Auto-generated method stub
		
	}


}
