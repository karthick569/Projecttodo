package Pages;
 

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.ProjectSpecificationMethods;

public class HomePage extends ProjectSpecificationMethods
{ 

	public HomePage (WebDriver driver)
    {
    	HomePage.driver= driver;
    }
	
	public void addingtasks()
	{
	    driver.findElement(By.xpath("//input[@type='text']")).click();
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Water the plants in the garden").sendKeys(Keys.ENTER);
	    driver.findElements(By.xpath("//input[@type='text']")).sendKeys("Pay the current bill").sendKeys(Keys.ENTER);
	    driver.findElements(By.xpath("//input[@type='text']")).sendKeys("Wash the clothes").sendKeys(Keys.ENTER);
	    
	    driver.findElements(By.xpath(" (//input[@class='toggle'])[2]")).click();
	    WebElement verify1 = driver.findElements(By.xpath("(//span[contains (@class,'todo')]"));
		   String number1 = verify1.getText();
		   if (number1 == "2 items left!")
		   {  System.out.println("The second task is completed successfully");  }
		   else
		   { System.out.println("The second task is not comleted successfully"); }
	    
      	    driver.findElements(By.xpath("(//button[@class='destroy'])[1] ")).click();
	   WebElement verify = driver.findElements(By.xpath("(//span[contains (@class,'todo')]"));
	   String number = verify.getText();
	   if (number == "2 items left!")
	   {  System.out.println("The first task is deleted successfully");  }
	   else
	   { System.out.println("The first task is not deleted successfully"); }
	   
	   
	
	
	}
}
