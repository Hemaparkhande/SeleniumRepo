package basic_program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Grotech_registrationandfileupload {

	public static void main(String[] args) throws InterruptedException {
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
		WebElement e5 = driver.findElement(By.name("Present-Address"));
		e5.sendKeys("swiss");
		WebElement e6 = driver.findElement(By.id("Permanent-Address"));
		e6.sendKeys("swiss");
		WebElement e7 = driver.findElement(By.id("Pincode"));
		e7.sendKeys("1234");
		
		WebElement uploadfile = driver.findElement(By.name("file"));
		uploadfile.sendKeys("/Users/hemag.gade/Downloads//grotechminds.html");
		
		Thread.sleep(2000);
		driver.quit();
	}

}
//running fine