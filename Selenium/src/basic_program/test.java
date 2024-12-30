package basic_program;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		
	    WebElement search=	driver.findElement(By.id("twotabsearchtextbox"));
	    search.sendKeys("shoes"+Keys.ENTER);
	    Thread.sleep(3000);
	    WebElement e2=   driver.findElement(By.xpath("(//span[@class='rush-component'])[4]"));
	    e2.click();
	    
      Set<String>	pcid=    driver.getWindowHandles();
        Iterator<String> pc =          pcid.iterator();
        String parentid=pc.next();
        System.out.println(parentid);
        String childid=pc.next();
        System.out.println(childid);
        driver.switchTo().window(childid);
        
        Thread.sleep(5000);
      WebElement addtocart=  driver.findElement(By.id("add-to-cart-button"));
      addtocart.click();
      
      WebElement proceed=driver.findElement(By.xpath("//span[@class='a-button a-button-normal a-button-span12 a-button-primary']"));
      proceed.click();
      
      WebElement usrname=  driver.findElement(By.name("email"));
    	usrname.sendKeys("+41765220387");
    	WebElement continue1=     driver.findElement(By.xpath("//span[@id='continue']"));
    	continue1.click();
    	WebElement pwd=driver.findElement(By.xpath("//input[@name='password']"));
    	pwd.sendKeys("Hema@123" + Keys.ENTER);
    	Thread.sleep(3000);
    	//WebElement signin=driver.findElement(By.xpath("//span[.='Sign in']"));
    //	signin.click();
    	
    	WebElement address=driver.findElement(By.xpath("(//div[@class='a-radio'])[10]"));
    	       address.click();
    	     WebElement address1=driver.findElement(By.xpath(" (//input[@class='a-button-input'])[2]"));
  	       address1.click();
  	       Thread.sleep(8000);   
  	       WebElement payment=  driver.findElement(By.xpath("(//div[@class='a-radio'])[4]"));    
  	       Thread.sleep(3000);
  	       payment.click();
    	       

	}

}
