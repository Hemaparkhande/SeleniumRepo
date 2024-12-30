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

public class ScreenshotWithDate {

	public static void main(String[] args) throws IOException 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		Date d1 = new Date();
		String humantime= d1.toString();
		String date = humantime.substring(8, 10);
		String month= humantime.substring(4, 7);		
		String year= humantime.substring(humantime.length()-4);
		String time = humantime.substring(11, 19);
		String date1 = date +month+year+" "+time;
		
		TakesScreenshot ts = driver;// upcast driver to interface
		File source = ts.getScreenshotAs(OutputType.FILE);// return type is File
		File destination = new File("/Users/hemag.gade/eclipse-workspace/Selenium/Screenshots/three"+new ScreenshotWithDate().getClass()+date1+".png");
		FileHandler.copy(source, destination);
		
		driver.quit();
		
		
	}

}
