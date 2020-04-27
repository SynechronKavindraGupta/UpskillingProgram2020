import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class kovid19_TC_2 {

public static void main(String[] args) throws InterruptedException {

// Open the browser and enter the URL

System.setProperty("webdriver.chrome.driver", "E:\\Automation Framework\\chromedriver.exe");

ChromeDriver driver = new ChromeDriver();
            driver.navigate().to("https://www.covid19india.org"); // URL open the URL
            driver.manage().window().maximize();

            Thread.sleep(2000);

            String Confirmed = driver.findElement(By.xpath("//div[@class='level-item is-cherry fadeInUp']//h1")).getText();
            System.out.println(Confirmed);
            String Active = driver.findElement(By.xpath("//div[@class='level-item is-blue fadeInUp']/h1[@class='title has-text-info']")).getText();

            System.out.println(Active);
            String Recovered = driver.findElement(By.xpath("//div[@class='level-item is-green fadeInUp']//h1")).getText();
            System.out.println(Recovered);
            String Deceased = driver.findElement(By.xpath("//div[@class='level-item is-gray fadeInUp']/h1")).getText();
            System.out.println(Deceased);


            List<WebElement> confirmedcasesStatewise=driver.findElements(By.xpath("(//table/tbody)[1]//tr//td/div[@class='table__title-wrapper']/../../td[2]//span[2]"));
            List<WebElement> states=driver.findElements(By.xpath("(//table/tbody)[1]//tr//td/div[@class='table__title-wrapper']/span[2]"));

            for(WebElement eachstateConfirmedCases:confirmedcasesStatewise)
            {
                for(WebElement eachState:states)
                {
                           String state= eachState.getText();
                           String count=eachstateConfirmedCases.getText();
                           System.out.println("The total confirmed cases in"+" " +state+ " "+ "are" +" "  +count);
                }

            }


         
            String totalCases=driver.findElementByXPath("(//table/tbody)[2]/tr/td[2]/span[2]").getText();
            System.out.println("total cases are----" +totalCases);

            String activeCases=driver.findElementByXPath("((//table/tbody)[2]/tr/td[3])[1]").getText();
            System.out.println("total active cases are----" +activeCases);

            String recoveredCases=driver.findElementByXPath("(//table/tbody)[2]/tr/td[4]/span[2]").getText();
            System.out.println("total recovered cases are----" +recoveredCases);

            String deathCases=driver.findElementByXPath("(//table/tbody)[2]/tr/td[5]/span[2]").getText();
            System.out.println("total death cases are----" +deathCases);






}

}