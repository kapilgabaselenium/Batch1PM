package org.testing.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.assertions.assertion;
import org.testng.Assert;
import org.testng.annotations.Test;





public class TC1 {

	
	@Test
	public void testcase1()
	{
		String expected_email="Deepakdeep1992@gmail.com";
		// Login l=new Login(driver,pr);
		l.signin(expected_email,"password1");
		
		WebElement guide=driver.findELement(By.id("id"));
		guide.click();
		WebElement mail=driver.findElement(By.id("id"));
		String actual_email=mail.getText();
		Assert.assertEquals(assertion.assert1(expected_email, actual_email), true);
		
		
		
		
		
		// trending 
		
		
		
	}
}
