package testPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class covid1004 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "servers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.covid19india.org/");
		
		//div[@class='level-item is-cherry fadeInUp']//h4/h1
		
		//div[@class='level-item is-blue fadeInUp']
		
		//div[@class='level-item is-blue fadeInUp']
		
		//String ele1 = driver.findElement(By.xpath("//div[@class='level-item is-blue fadeInUp']/h1[@class='title has-text-info']")).getAttribute("value");
		//string eleval = ele1.getAttribute("value");
		
		
		String Confirmed = driver.findElement(By.xpath("//div[@class='level-item is-cherry fadeInUp']//h1")).getText();
		System.out.println(Confirmed);
		String Active = driver.findElement(By.xpath("//div[@class='level-item is-blue fadeInUp']/h1[@class='title has-text-info']")).getText();
		System.out.println(Active);
				String Recovered = driver.findElement(By.xpath("//div[@class='level-item is-green fadeInUp']//h1")).getText();
		System.out.println(Recovered);
		String Deceased = driver.findElement(By.xpath("//div[@class='level-item is-gray fadeInUp']/h1")).getText();
		System.out.println(Deceased);
		
		
		
		
		//String[] strs = new String[]{ "Confirmed","Active","Recovered","Deceased" };
		//for (String s : strs) // Goes through all entries of strs in ascending index order (foreach over array)
		   // List.add(s);
		
		/*List<WebElement> rowcount = driver.findElements(By.xpath("//tr[@class='state']"));
		System.out.println(rowcount.size());
		List<WebElement> col = driver.findElements(By.xpath("//table[@class='table fadeInUp']//thead"));
		System.out.println(col.size());
		//table[@class='table fadeInUp']//thead
		//List<WebElement> col = driver.findElements(By.xpath("//table[@class='table.fadeInUp']/thead/tr"));
		//System.out.println(col.size());
		
		
		//td//span[@class='table__count-text']
		//tr[@class='state']//div -- giving 32 states
		//tr[@class='state']*/
	}

}
