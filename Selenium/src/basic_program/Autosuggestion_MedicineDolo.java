package basic_program;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion_MedicineDolo {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.1mg.com");
//		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		
		WebElement dolo = driver.findElement(By.id("srchBarShwInfo"));
		dolo.sendKeys("dolo");
		
		List<WebElement> autosuggestion = driver.findElements(By.xpath("//div[@class='styles__search-results-container___3OUHy']/ul/li"));
		
		System.out.println(autosuggestion.size());
		
		Thread.sleep(5000);
		autosuggestion.get(5).click();
		System.out.println(autosuggestion.get(5));

		

		Thread.sleep(2000);
		driver.quit();
		
//		pending
		
	}

}
