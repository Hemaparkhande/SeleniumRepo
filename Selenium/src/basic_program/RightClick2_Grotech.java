package basic_program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick2_Grotech {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/rightclick/");
		driver.manage().window().maximize();
		WebElement rightclick = driver.findElement(By.xpath("(//div)[65]"));
		Actions a1= new Actions (driver);
		a1.contextClick(rightclick).perform();	
		
		Thread.sleep(50000);
		driver.quit();

		
	}

}
