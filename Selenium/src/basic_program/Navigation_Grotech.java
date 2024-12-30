package basic_program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Navigation_Grotech {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.id("fname"));
		e1.sendKeys("Hema");
		WebElement e2 = driver.findElement(By.id("lname"));
		e2.sendKeys("P");
		WebElement e3 = driver.findElement(By.name("email"));
		e3.sendKeys("h1@gmail.com");
		WebElement e4 = driver.findElement(By.id("password"));
		e4.sendKeys("hema");
		WebElement e5 = driver.findElement(By.id("Skills"));
		e5.click();
		Select s1 = new Select (e5);
//		s1.selectByIndex(1);
//		s1.selectByContainsVisibleText("Non-Technical Skills");
		s1.selectByValue("select2");
		e5.sendKeys(Keys.ENTER);
		/*e5.sendKeys(Keys.DOWN);
//		Thread.sleep(2000);
		
		e5.sendKeys(Keys.DOWN);
//		Thread.sleep(2000);

		
		e5.sendKeys(Keys.RETURN);*/
		
		
//		 not running
		
		
	}

}
