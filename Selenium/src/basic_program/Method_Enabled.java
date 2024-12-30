package basic_program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method_Enabled {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///Users/hemag.gade/Downloads/grotechminds.html");
		driver.manage().window().maximize();

		WebElement username = driver.findElement(By.id("121"));
		if (username.isDisplayed() == true && username.isEnabled()) 
		{
			username.sendKeys("HemaP");

		} 
		else 
		{
			System.out.println("Presence of element= " + username.isDisplayed());
			System.out.println("Element is enabled? ->" + username.isEnabled());

			System.out.println("SOrry please check if component is really enable and dislpaying");
		}
		WebElement e1 = driver.findElement(By.id("123"));
		boolean b1 = e1.isSelected();
		System.out.println(b1);
		if (b1 == false) 
		{
			e1.click();
		}

	}

}
