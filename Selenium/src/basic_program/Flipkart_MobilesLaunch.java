package basic_program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_MobilesLaunch {

	public static void main(String[] args) 
	{
		
		ChromeDriver c = new ChromeDriver();
		c.get("https://www.flipkart.com/");
		WebElement e1 = c.findElement(By.name("q"));
		e1.sendKeys("Mobiles" + Keys.ENTER);
		
		
		
	}

}
//running fine