package basic_program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_Hoverover_Signin {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement signin = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(signin).perform();
		
		WebElement sign = driver.findElement(By.xpath("//span[@class='nav-action-inner']"));
		sign.click();
		
		WebElement email = driver.findElement(By.id("ap_email"));
		email.sendKeys("h@gmail.com");
		
		WebElement continue1 = driver.findElement(By.id("continue"));
		continue1.click();
		
		
		Thread.sleep(5000);
		driver.quit();

		
	}

}
