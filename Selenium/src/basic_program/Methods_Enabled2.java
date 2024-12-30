package basic_program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods_Enabled2 {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///Users/hemag.gade/Downloads/grotechminds.html");
		driver.manage().window().maximize();
	
		WebElement firstname = driver.findElement(By.name("fname"));
		if(firstname.isDisplayed() ==true && firstname.isEnabled()==true)
		{
			System.out.println("WebElement firstname is enabled and displayed " +firstname.isDisplayed()+" "+firstname.isEnabled());
			firstname.sendKeys("Hema");	
		}
		else
		{
			System.out.println("WebElement firstname is disabled " + firstname.isDisplayed()+firstname.isEnabled());
			
		}
		WebElement lastname = driver.findElement(By.id("121"));
		if(lastname.isDisplayed() ==true && lastname.isEnabled()==true)
		{
			System.out.println("WebElement lastname is enabled and displayed " +firstname.isDisplayed()+" "+firstname.isEnabled());
			lastname.sendKeys("Parkhande");
		}
		else
		{
			System.out.println("WebElement lastname is disabled " + lastname.isDisplayed()+" "+lastname.isEnabled());
			
		}
		WebElement boy = driver.findElement(By.id("123"));
		boolean b1 = boy.isSelected();
		System.out.println(b1);
		if(b1==false)
		{
			boy.click();
		}
	
	}

}
