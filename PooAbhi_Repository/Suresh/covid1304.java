package testPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class covid1304 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "servers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.covid19india.org/");
				
		Thread.sleep(30000);
		String Confirmed = driver.findElement(By.xpath("//div[@class='level-item is-cherry fadeInUp']//h1")).getText();
		System.out.println(Confirmed);
		String Active = driver.findElement(By.xpath("//div[@class='level-item is-blue fadeInUp']/h1[@class='title has-text-info']")).getText();
		System.out.println(Active);
				String Recovered = driver.findElement(By.xpath("//div[@class='level-item is-green fadeInUp']//h1")).getText();
		System.out.println(Recovered);
		String Deceased = driver.findElement(By.xpath("//div[@class='level-item is-gray fadeInUp']/h1")).getText();
		System.out.println(Deceased);
		
	String tableData;
	WebElement deltaElement;
	String delta;
	for(int i=1;i<=33;i++) {
		for(int j=1;j<=5;j++) {
			tableData=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[1]/table/tbody[1]/tr[@class='state']["+i+"]/td["+j+"]")).getText();
			//System.out.println("Data in row "+i+" and column "+j+" :" + tableData);
			
			deltaElement=null;
			try {
				deltaElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[1]/table/tbody[1]/tr[@class='state']["+i+"]/td["+j+"]//span[contains(@class,'deltas')]"));
			}catch (Exception e) {
				// TODO: handle exception
			}
			if(deltaElement!=null && deltaElement.isDisplayed()) {
				delta=deltaElement.getText();
				System.out.println("Data in row "+i+" and column "+j+" :" + tableData.replace(delta, ""));
			}else {
				System.out.println("Data in row "+i+" and column "+j+" :" + tableData);
			}
			
		}
		
	}
	
	

		
	}

}
