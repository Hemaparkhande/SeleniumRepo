package basic_program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Relative_XPath_Grotech {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///Users/hemag.gade/Downloads/grotechminds.html");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.xpath("(//input)[1]"));
		username.sendKeys("HemaP");
		WebElement hint = driver.findElement(By.xpath("(//input)[2]"));
		hint.sendKeys("HemaP");
		WebElement password = driver.findElement(By.xpath("(//input)[3]"));
		password.sendKeys("Hema123");
		WebElement firstname = driver.findElement(By.xpath("(//input)[4]"));
		firstname.sendKeys("Hema");
//		WebElement submit = driver.findElement(By.xpath("(//input)[6]"));
//		submit.sendKeys("Parkhande");
		WebElement boy = driver.findElement(By.xpath("(//input)[7]"));
		boy.click();
		WebElement girl = driver.findElement(By.xpath("(//input)[8]"));
		girl.click();
		WebElement baby = driver.findElement(By.xpath("(//input)[9]"));
		baby.click();
//		WebElement submit = driver.findElement(By.xpath("(//input)[10]"));
//		submit.click();
		WebElement male = driver.findElement(By.xpath("(//input)[11]"));
		male.click();
		WebElement female = driver.findElement(By.xpath("(//input)[12]"));
		female.click();
		WebElement relocate = driver.findElement(By.xpath("(//input)[13]"));
		relocate.click();
//		WebElement toknowabtus = driver.findElement(By.partialLinkText("Click to know"));
//		toknowabtus.click();
		WebElement religion = driver.findElement(By.id("Relegion"));
		religion.click();
		Select s1 = new Select(religion);
		s1.selectByIndex(2);
		WebElement signup = driver.findElement(By.xpath("(//input)[14]"));
		signup.click();
		
		
		Thread.sleep(1000);
		driver.quit();
		
		
	}

}
