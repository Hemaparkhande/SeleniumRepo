package basic_program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion_Flipkart {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement e1 = driver.findElement(By.name("q"));
		e1.sendKeys("id card");
		Thread.sleep(500);

		List <WebElement> idcard = driver.findElements(By.xpath("//form[@class='_2rslOn header-form-search OpXDaO']/ul/li"));
		int count = idcard.size();
		System.out.println(count);
		idcard.get(2).click();
		
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
