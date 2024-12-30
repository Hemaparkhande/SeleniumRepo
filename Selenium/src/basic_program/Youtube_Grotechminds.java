package basic_program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube_Grotechminds {

	public static void main(String[] args) throws InterruptedException 
	{
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
		Thread.sleep(20000);
		WebElement e1 = driver.findElement(By.name("search_query"));
		e1.sendKeys("Grotechminds");
		e1.sendKeys(Keys.ENTER);
	
	
	}

}
//asks for accept all