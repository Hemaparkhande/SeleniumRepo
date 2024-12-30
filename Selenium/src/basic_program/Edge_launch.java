package basic_program;

import org.openqa.selenium.edge.EdgeDriver;

public class Edge_launch {

	public static void main(String[] args)
	{
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		
	}

}
