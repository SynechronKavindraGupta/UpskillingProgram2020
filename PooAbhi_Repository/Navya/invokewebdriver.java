import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create driver object for chrome browser
		/*Class name= ChromeDriver,
				x driver = new x();*/
		
		//invoke .exe file first
		
		System.setProperty("webdriver.chrome.driver", "//Users//admin//Downloads//chromedriver" );
				WebDriver driver=new ChromeDriver();
				driver.get("http://google.com");
				System.out.println(driver.getTitle());
				System.out.println(driver.getCurrentUrl());
				System.out.println(driver.getPageSource());
				//driver.quit();
				//driver.close();
				//driver.get("http://yahoo.com");
				//driver.navigate().back();
		
	}

}
