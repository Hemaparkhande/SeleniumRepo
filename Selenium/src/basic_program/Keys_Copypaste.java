package basic_program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keys_Copypaste {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.id("fname"));
		e1.sendKeys("Hema");
		e1.sendKeys(Keys.COMMAND+ "a");
		e1.sendKeys(Keys.COMMAND+ "c");
		Thread.sleep(1000);
		WebElement e2 = driver.findElement(By.id("lname"));
		e2.sendKeys(Keys.COMMAND + "v");
		
	}

}
// running fine