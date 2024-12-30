package basic_program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass_Google
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.linkText("Gmail"));
		
		Actions a1 =new Actions(driver);
		a1.contextClick(e1).perform();		// right click
		
		
	}

}
