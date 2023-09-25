package com.PARA.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.PARA.base.TestBase;

public class LoginTest extends TestBase {
	
	@Test (priority = 1)
	public void login() throws InterruptedException {
		
		WebElement userID= driver.findElement(By.cssSelector(OR.getProperty("UserIdField")));
		Thread.sleep(1000);
		userID.sendKeys(LoginData.getProperty("Username"));
		
		WebElement password= driver.findElement(By.cssSelector(OR.getProperty("UserPasswordField")));
		Thread.sleep(1000);
		password.sendKeys(LoginData.getProperty("password"));
		
		driver.findElement(By.cssSelector(OR.getProperty("LoginButton"))).click();
		Thread.sleep(3000);	
		
	}

}
