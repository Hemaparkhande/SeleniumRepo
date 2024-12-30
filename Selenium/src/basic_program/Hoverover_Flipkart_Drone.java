package basic_program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hoverover_Flipkart_Drone {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.flipkart.com/");
		d.manage().window().maximize();

		WebElement electronics = d.findElement(By.xpath("(//span[.='Electronics'])[1]"));
		Actions a1 = new Actions(d);
		a1.moveToElement(electronics).perform();
		
		WebElement Cameras = d.findElement(By.linkText("Cameras & Accessories"));
		a1.moveToElement(Cameras).perform();
		
		WebElement drone = d.findElement(By.linkText("Drone"));
		drone.click();
		
		
		Thread.sleep(5000);
		d.quit();
	}

}
