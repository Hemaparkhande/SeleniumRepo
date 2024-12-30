package basic_program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XPath_AmazonSigninSearch156 {

	public static void main(String[] args) throws InterruptedException 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("lipsticks");
		search.sendKeys(Keys.ENTER);
		
		WebElement signin = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		signin.click();
		
		WebElement email = driver.findElement(By.xpath("//input[@id='ap_email']"));
		email.sendKeys("h@gmail.com");

		WebElement continueto = driver.findElement(By.xpath("//input[@id='continue']"));
		continueto.click();
		
		WebElement password = driver.findElement(By.xpath("//input[@id='ap_password']"));
		password.sendKeys("123");
		
		WebElement submit = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		submit.click();
		
		
		Thread.sleep(2000);
		driver.quit();
		
		
		
	}

}
