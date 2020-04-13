import java.util.ArrayList;

import java.util.List;



import org.openqa.selenium.By;

import org.openqa.selenium.NoSuchElementException;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;



public class udemy {



	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "//Users//naveenkumar//Downloads//chromedriver_latest" );

		WebDriver driver=new ChromeDriver();

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

		

		String[] allCases= new String[]{ "ConfirmedCases","ActiveCases","RecoveredCases","DeceasedCases" };

		List<String> totalCount = new ArrayList<String>();

		for (int i = 0; i < allCases.length; i++) {

			String total;

			int j = i + 2;

			System.out.println(j);

			try {

				total = driver.findElement(By.xpath("//tr[@class='state is-total']//td[" + j + "]//span[2]")).getText();

//				System.out.println(total);

			}

			catch (NoSuchElementException e) {

				total = driver.findElement(By.xpath("//tr[@class='state is-total']//td[" + j + "]")).getText();

//				System.out.println(total);

			}

			totalCount.add(total);

		}

		System.out.println(allCasesCount);

		System.out.println(totalCount);

		System.out.println(allCasesCount.equals(totalCount));

//		List<WebElement> allStates = driver.findElements(By.xpath("//tr[@class='state']//div"));

//		System.out.println(allStates.size());

//		for(WebElement element:allStates){

//			System.out.println(element.findElement(By.xpath(".//td[2]/span[2]")).getText());

//		}

	}



}

