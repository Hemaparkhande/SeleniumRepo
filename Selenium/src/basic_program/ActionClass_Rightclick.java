package basic_program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass_Rightclick {

	public static void main(String[] args) throws InterruptedException 
	
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/rightclick/");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div/div[2]/div[1]/div[1]"));
		
		Actions a1 =new Actions(driver);
		a1.contextClick(e1).perform();	
		
		Thread.sleep(50000);
		driver.quit();
		
		
			}

}
