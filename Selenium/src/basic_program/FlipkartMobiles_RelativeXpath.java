package basic_program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartMobiles_RelativeXpath {

	public static void main(String[] args) 
	{
		ChromeDriver c = new ChromeDriver();
		c.get("https://www.flipkart.com/");
		WebElement mobiles = c.findElement(By.xpath("(//span)[7]"));
		mobiles.click();
		
		
	}

}
