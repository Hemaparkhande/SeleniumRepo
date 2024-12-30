package basic_program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		int count = alllinks.size();
		System.out.println(count);
		for (int i = 0; i < count; i++) 
		{
			WebElement e1 = alllinks.get(i);
			String link = e1.getAttribute("href");
			String text = e1.getText();
			System.out.println(link);
			System.out.println(text);
		}

	}
}
