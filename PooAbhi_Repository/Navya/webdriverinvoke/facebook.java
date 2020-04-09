import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "//Users//admin//Downloads//chromedriver" );
				WebDriver driver=new ChromeDriver();
				driver.get("http://facebook.com");
				driver.findElement(By.cssSelector("input[name='email']")).sendKeys("first program by using css");
				driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("1234");
				driver.findElement(By.cssSelector("input[value='Log In']")).click();

}
	
}