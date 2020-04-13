import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import java.util.Arrays;
import java.util.List;


//*[@id="udemy"]/div[2]/div[1]/div[3]/div[5]/a

public class udemy {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "//Users//admin//Downloads//chromedriver" );
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.udemy.com/");
				//*[@id="udemy"]/div[2]/div[1]/div[3]/div[5]/a
				
				List<WebElement> loginbtn = driver.findElements(By.xpath("//*[@id='udemy']/div[2]/div[2]/div[1]/div[4]/div[6]/div/button"));
				
				if(loginbtn.size() != 0) {
					driver.findElement(By.xpath("//*[@id='udemy']/div[2]/div[2]/div[1]/div[4]/div[6]/div/button")).click();
				}
				else{
				//driver.findElement(By.xpath("//*[@id=\'udemy\']/div[1]/div[1]/div[2]/div[5]/a/span"));
				  driver.findElement(By.xpath("//*[@id=\'udemy\']/div[2]/div[1]/div[3]/div[5]/a")).click();
			    }
				//driver.findElement(By.xpath("//*[@id=\'udemy\']/div[2]/div[1]/div[3]/div[5]/a")).click();
				Thread.sleep(2000);
				driver.findElement(By.id("email--1")).sendKeys("akkisettynavyateja@gmail.com");
				driver.findElement(By.id("id_password")).sendKeys("Teja@1234");
				driver.findElement(By.id("submit-id-submit")).click();
				driver.findElement(By.id("header-desktop-search-bar")).sendKeys("Java");
				driver.findElement(By.xpath("//span[text()='Android Development'")).click();
				driver.findElement(By.xpath("//span[text()='Beginner'")).click();
				driver.findElement(By.xpath("//span[text()='English'")).click();
				driver.findElement(By.xpath("//*[@id='udemy']/div[2]/div[3]/div/div/div/div[1]/div[2]/div/div[2]/div[2]/a[1]/div[1]/div[1])")).click();
			    //driver.findElement(By.xpath("//*[@id=\'udemy\']/div[2]/div[3]/div/div/div/div[1]/div[2]/div/div[2]/div[2]/a[1]/div[1]/div[5]/div[1]/span[2]/span")).click();
				
				WebElement priceValue= driver.findElement(By.xpath("//*[@id=\'udemy\']/div[2]/div[3]/div/div/div/div[1]/div[2]/div/div[2]/div[2]/a[1]/div[1]/div[5]/div[1]/span[2]/span"));
				 
				 String itemPrice=priceValue.getAttribute("span");
				 System.out.println("Value of type attribute: "+itemPrice);
				 
				 
			    driver.findElement(By.xpath("//*[@id=\'udemy\']/div[2]/div[2]/div[5]/div/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div/div[4]/div/div/div/button")).click();
				driver.findElement(By.xpath("//button[contains(@data-purpose,’go-to-cart-button’)")).click();
				//*[@id="udemy"]/div[1]/div[2]/div/div/div/div[2]/form/div[2]/div/div[1]/table[2]/tbody/tr/td[2]/span/span
				
				WebElement cartValue=driver.findElement(By.xpath("//*[//*[@id=\'udemy\']/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]/div/div[2]/span[2]/span"));
				 
				 String cartPrice=cartValue.getAttribute("span");
				 System.out.println("Value of type attribute: "+cartPrice);
				 if(cartPrice.equals(itemPrice)) {
					 System.out.println("price matched");
				     driver.findElement(By.xpath("//*[@id=\'udemy\']/div[2]/div[2]/div/div/div/div[2]/div[2]/div[3]/button")).click();
				     driver.findElement(By.xpath("//*[@id=\'fullname\']")).sendKeys("NavyaTeja");
				     driver.findElement(By.xpath("//*[@id=\'udemy\']/div[1]/div[2]/div/div/div/div[2]/form/div[1]/div/div[2]/div/div[5]/div/div/div[1]/div/div[2]/div/div/input")).sendKeys("1234907788889");
				     driver.findElement(By.xpath("//*[@id=\'udemy\']/div[1]/div[2]/div/div/div/div[2]/form/div[1]/div/div[2]/div/div[5]/div/div/div[1]/div/div[3]/div[2]/div/input")).sendKeys("789");
				     driver.findElement(By.xpath("//*[@id=‘udemy’]/div[1]/div[2]/div/div/div/div[2]/form/div[1]/div/div[2]/div/div[5]/div/div/div[1]/div/div[3]/div[1]/div/div[1]/div/select/option[2]")).click();
				     driver.findElement(By.xpath("//*[@id=\'udemy\']/div[1]/div[2]/div/div/div/div[2]/form/div[1]/div/div[2]/div/div[5]/div/div/div[1]/div/div[3]/div[1]/div/div[2]/div/select)/option[3]")).click();
				     driver.findElement(By.xpath("//*[@id=\'udemy\']/div[1]/div[2]/div/div/div/div[2]/form/div[2]/div/div[3]/button")).click();
				     driver.findElement(By.xpath("//*[@id=‘udemy’]/div[1]/div[2]/div/div/div/div[2]/form/div[1]/div/div[2]/div/div[5]/div/div/div[1]/div/div/div[2]/span")).getText();
				 }
				
				
				
	
	}
 
}

 