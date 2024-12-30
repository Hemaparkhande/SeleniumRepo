package basic_program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_LinkText_Customerservice_Launch 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://www.amazon.in/"); both ways get url and navigate to
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement e1 = driver.findElement(By.linkText("Customer Service"));
		e1.click();
		
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		
//		running fine
		
		
	}

}
