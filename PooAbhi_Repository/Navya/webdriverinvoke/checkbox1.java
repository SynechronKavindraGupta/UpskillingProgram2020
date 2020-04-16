import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class checkbox1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "//Users//admin//Downloads//chromedriver" );
				WebDriver driver=new ChromeDriver();
				driver.get("http://spicejet.com");
				Thread.sleep(500);
				driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
				System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
				//System.out.println(driver.findElement(By.cssSelector("input[type='checkbox']")).size());
				

	}
}