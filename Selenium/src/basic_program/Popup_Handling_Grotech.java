package basic_program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup_Handling_Grotech {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/alert/");
		
		WebElement alert1 = driver.findElement(By.xpath("(//div[@class='elementor-widget-container'])[8]"));
		alert1.click();
		
		Thread.sleep(5000);
		
		driver.switchTo().alert().accept();
		driver.manage().window().maximize();
		
		
		
	}

}
