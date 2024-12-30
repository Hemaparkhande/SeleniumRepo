package basic_program;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Absolute_XPath_Grotech {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///Users/hemag.gade/Downloads/grotechminds.html");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("(/html/body/input)[1]"));
		username.sendKeys("HemaP");
		
		WebElement hint = driver.findElement(By.xpath("(/html/body/input)[2]"));
		hint.sendKeys("P");
		
		WebElement password = driver.findElement(By.xpath("(/html/body/input)[3]"));
		password.sendKeys("Hema123");
		
		WebElement firstname = driver.findElement(By.xpath("((/html/body/form)[1]/input)[1]"));
		firstname.sendKeys("Hema");
		
//		WebElement lastname = driver.findElement(By.xpath("((/html/body/form)[1]/input)[3]"));
//		lastname.sendKeys("Parkhande"); this element is disabled
		
		WebElement boy = driver.findElement(By.xpath("((/html/body/form)[2]/input)[1]"));
		boy.click();
		
		WebElement girl = driver.findElement(By.xpath("((/html/body/form)[2]/input)[2]"));
		girl.click();
		
		WebElement baby = driver.findElement(By.xpath("((/html/body/form)[2]/input)[3]"));
		baby.click();
		
//		WebElement submit = driver.findElement(By.xpath("((/html/body/form)[2]/input)[4]"));
//		submit.click();
		
		WebElement male = driver.findElement(By.xpath("(/html/body/input)[4]"));
		male.click();
		
		WebElement female = driver.findElement(By.xpath("(/html/body/input)[5]"));
		female.click();
		
		WebElement relocate = driver.findElement(By.xpath("(/html/body/input)[6]"));
		relocate.click();
		
//		WebElement toknowabtus = driver.findElement(By.partialLinkText("Click to know about us"));
//		toknowabtus.click();
		
		WebElement relegion = driver.findElement(By.id("Relegion"));
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		Select s1 = new Select(relegion);
		s1.selectByValue("2");
		Thread.sleep(1000);

//		WebElement signup = driver.findElement(By.xpath("(/html/body/input)[7]"));
//		signup.click();
		
		
		Thread.sleep(1000);
		driver.quit();
		
	}

}
