import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "//Users//admin//Downloads//chromedriver" );
				WebDriver driver=new ChromeDriver();
				driver.get("http://spicejet.com");
				driver.findElement(By.id("divpaxinfo")).click();
				Thread.sleep(500);
			
				for(int i=1;i<5;i++)
				{
					driver.findElement(By.id("ctl00_mainContent_ddl_Child")).click();
					
					
				}
				
				//Select s=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
				//s.selectByIndex(2);
}
	
}