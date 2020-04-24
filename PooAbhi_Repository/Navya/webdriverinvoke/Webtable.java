import java.util.ArrayList;

import java.util.List;



import org.openqa.selenium.By;

//import org.openqa.selenium.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Webtable_practise {



	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "//Users//admin//Downloads//chromedriver" );

		WebDriver driver= new ChromeDriver();

		driver.get("https://www.covid19india.org/");

		Thread.sleep(2000);

		String confirmedCases = driver.findElement(By.xpath("//div[@class='level-item is-cherry fadeInUp']//h1")).getText();

		System.out.println(confirmedCases);

		String activeCases = driver.findElement(By.xpath("//div[@class='level-item is-blue fadeInUp']/h1[@class='title has-text-info']")).getText();

		System.out.println(activeCases);

		String recoveredCases = driver.findElement(By.xpath("//div[@class='level-item is-green fadeInUp']//h1")).getText();

		System.out.println(recoveredCases);

		String deceasedCases = driver.findElement(By.xpath("//div[@class='level-item is-gray fadeInUp']/h1")).getText();

		System.out.println(deceasedCases);

//		String[] allCasesCount= new String[4];

		List<String> allCasesCount = new ArrayList<String>();

		allCasesCount.add(confirmedCases);

		allCasesCount.add(activeCases);

		allCasesCount.add(recoveredCases);

		allCasesCount.add(deceasedCases);
		
		int allCases1 = Integer.parseInt("allCasesCount");
		
		
		
		
		
		WebElement table = driver.findElement(By.xpath("//table[@class='table fadeInUp']"));
	  //  int rowcount = table.findElements(By.cssSelector("span[class='state  is-odd']")).size();
	    
	    int count = table.findElements(By.cssSelector("span[class='state  is-odd']    span:nth-child(2)")).size();
	    
	    
	    for(int i=0;i<count;i++)
	    {
	    	System.out.println(table.findElements(By.cssSelector("state  is-odd    span:nth-child(2)")).get(i).getText());
	    }
	    Thread.sleep(4000);
	    
	    if(allCases1 == count)
	    {
	    	System.out.println("count matches");
	    }
	    else
	    {
	    	System.out.println("count mismatch");
	    }
	    
	    
	   
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		

	}
}