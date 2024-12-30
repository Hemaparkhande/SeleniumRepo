package basic_program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass_Grotech {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement skill = driver.findElement(By.id("Skills"));
		Select s0 = new Select(skill);
		s0.selectByVisibleText("Technical Skills");
		
		WebElement country = driver.findElement(By.id("Country"));
		Select s1 = new Select(country);
		s1.selectByVisibleText("India");
		
		WebElement relegion = driver.findElement(By.id("Relegion"));
		Select s2 = new Select(relegion);
		s2.selectByVisibleText("Hindu");
		
		
		
		
	}

}
