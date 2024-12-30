package basic_program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch_RelativeXpath {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver c = new ChromeDriver();
		c.get("https://www.google.com/");
		c.manage().window().maximize();
		Thread.sleep(5000);
		WebElement mobiles = c.findElement(By.xpath("(//div)[41]"));
		mobiles.click();
		
		WebElement swiss = c.findElement(By.id("APjFqb"));
		swiss.sendKeys("Switzerland");
		swiss.sendKeys(Keys.ENTER);
				
		Thread.sleep(2000);
		c.quit();
		
	}

}
