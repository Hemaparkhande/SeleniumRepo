package basic_program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion_Google {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		driver.manage().window().maximize();
		Thread.sleep(5000);

		WebElement e1 = driver.findElement(By.name("q"));
		e1.sendKeys("India");
		List <WebElement> elements = driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		int count= elements.size();
		System.out.println(count);
		elements.get(3).click();
		
		Thread.sleep(5000);
		driver.quit();
		
		
		
		
	}

}
