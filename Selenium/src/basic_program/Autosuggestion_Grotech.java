package basic_program;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Autosuggestion_Grotech {

	public static void main(String[] args) throws InterruptedException 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.grotechminds.com/blogs/");
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		WebElement e1 = driver.findElement(By.xpath("//input[@class='orig']"));
		e1.sendKeys("selenium");
		Thread.sleep(8000);

		List<WebElement> e2 = driver.findElements(By.xpath("(//div[@class='results'])[2]/div/div"));
		System.out.println(e2.size());
		Thread.sleep(10000);
		e2.get(0).click();
		System.out.println(e2.get(2));

		Thread.sleep(5000);
		driver.quit();
		
	}

}
