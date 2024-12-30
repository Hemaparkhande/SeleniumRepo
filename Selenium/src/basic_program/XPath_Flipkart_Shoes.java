package basic_program;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//Assignment 164
//Using ""https://www.flipkart.com//"" url search ""shoes"" add in the cart "
public class XPath_Flipkart_Shoes {

	public static void main(String[] args) throws InterruptedException 
	{
		FirefoxDriver c = new FirefoxDriver();
		c.get("https://www.flipkart.com/");
		c.manage().window().maximize();
		WebElement search = c.findElement(By.xpath("//input[@class='Pke_EE']"));
		search.sendKeys("shoes");
		search.sendKeys(Keys.ENTER);
		
		c.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement shoes = c.findElement(By.xpath("(//div[@class='_1sdMkc LFEi7Z'])[2]"));
		shoes.click();
		
		Set<String> s1 = c.getWindowHandles();
		
		Iterator <String> i1 = s1.iterator();
		
		String parentbrowserid = i1.next();
		
		String childbrowserid = i1.next();
		
		c.switchTo().window(childbrowserid);
		Thread.sleep(5000);
		WebElement addtocart = c.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']"));
		addtocart.click();
		Thread.sleep(5000);

		WebElement placeorder = c.findElement(By.xpath("//button[@class='QqFHMw zA2EfJ _7Pd1Fp']"));
		placeorder.click();
		
		
		Thread.sleep(500);
		c.quit();
	}

}
