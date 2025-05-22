package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.ProjectSpecificationMethods;
import Pages.HomePage;

public class TC_001_UITest extends ProjectSpecificationMethods
{
	@BeforeTest
	public void setup()
	{
		testName = "UITest";
		testDescription = "Testing the UI reflection after each operation";
		testAuthor = "Karthick";
		testCategory = "Accessibility Testing";
		
	}
	
	@Test
	public void UITest()
	{
		HomePage obj = new HomePage(driver);
		obj.addingtasks();
	}
	

}
