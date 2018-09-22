package pkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Class1 {
	
	public static void main(String[] args) throws InterruptedException 
	{
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\chromedriver.exe");
	 ChromeDriver driver=new ChromeDriver();
	 driver.get("url");
	 driver.navigate().to("url");
	 driver.navigate().back();
	 driver.navigate().forward();
	 Thread.sleep(3000);
	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 WebElement login=driver.findElement(By.id("anc"));
	 WebDriverWait w=new WebDriverWait(driver, 5);
	 w.until(ExpectedConditions.elementToBeClickable(login));
	 System.out.println("file updated");
	 
	 
		
	}

}
