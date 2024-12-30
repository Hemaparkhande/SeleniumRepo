package basic_program;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Select_Class {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/"); 
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.id("searchDropdownBox"));
		
		Select s1 = new Select(e1);
	s1.selectByIndex(4);
//		s1.selectByValue("search-alias=alexa-skills");
//		s1.selectByVisibleText("Books");
		
		e1.sendKeys(Keys.ARROW_DOWN);
		
/*		TakesScreenshot ts = driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("/Users/hemag.gade/eclipse-workspace/Selenium/Screenshots/two.png");
		FileHandler.copy(source, destination);*/
		
		Thread.sleep(50000);
		driver.quit();
		
	}

}
