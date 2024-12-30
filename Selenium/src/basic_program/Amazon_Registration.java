package basic_program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Registration {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get(
				"https://www.amazon.in/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26ref_%3Dnav_custrec_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		WebElement e1 = driver.findElement(By.name("customerName"));
		e1.sendKeys("Hema P");
		WebElement e2 = driver.findElement(By.id("ap_phone_number"));
		e2.sendKeys("9273648291");
		WebElement e3 = driver.findElement(By.name("password"));
		e3.sendKeys("hema123");
		WebElement e4 = driver.findElement(By.id("continue"));
		e4.click();

	}

}
// running fine