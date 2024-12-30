package basic_program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Doubleclick_Hema {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.id("fname"));
		e1.sendKeys("Hema");
		
		Actions a1 =new Actions(driver);
		a1.doubleClick(e1).click();	
		e1.sendKeys(Keys.COMMAND+ "a");
		e1.sendKeys(Keys.COMMAND+ "c");
		WebElement e2 = driver.findElement(By.id("lname"));
		e2.sendKeys(Keys.COMMAND + "v");
		
		Thread.sleep(50000);
		driver.quit();
		
	}

}
