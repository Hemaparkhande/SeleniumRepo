package basic_program;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class TestCase_1_Popup {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://grotechminds.com/alert/");
		driver.manage().window().maximize();
		
		WebElement alert1 = driver.findElement(By.xpath("(//div[@class='elementor-widget-container'])[8]"));
		alert1.click();
		
		Thread.sleep(5000);
		
		driver.switchTo().alert().accept();
		driver.manage().window().maximize();
		
		Date d1 = new Date();
		
		TakesScreenshot ts = driver;
		File source= ts.getScreenshotAs(OutputType.FILE);
		 
		File destination = new File("/Users/hemag.gade/eclipse-workspace/Selenium/Screenshots/one"+ new TestCase_1_Popup().getClass()+".png");
		FileHandler.copy(source, destination);
		
		
		
	}

}
