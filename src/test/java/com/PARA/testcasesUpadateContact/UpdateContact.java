package com.PARA.testcasesUpadateContact;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.PARA.base.TestBase;

public class UpdateContact extends TestBase{

    @Test (priority = 2)
	public void goContactPage() throws InterruptedException {

		
		
		driver.findElement(By.linkText(OR.getProperty("Contact_update"))).click();
		Thread.sleep(2000);
		
		//Update Contact
		
		WebElement Fname= driver.findElement(By.cssSelector(OR.getProperty("first_Name_Update")));
		Fname.clear();
		Thread.sleep(2000);
		Fname.sendKeys(LoginData.getProperty("Fname_Value"));
		
		WebElement Lname= driver.findElement(By.cssSelector(OR.getProperty("last_Name_Update")));
		Thread.sleep(2000);
		Lname.clear();
		Thread.sleep(2000);
		Lname.sendKeys(LoginData.getProperty("Lname_Value"));
		
		WebElement Caddress= driver.findElement(By.cssSelector(OR.getProperty("update_Address")));
		Thread.sleep(2000);
		Caddress.clear();
		Thread.sleep(2000);
		Caddress.sendKeys(LoginData.getProperty("Address_Value"));
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(OR.getProperty("update_button"))).click();
		Thread.sleep(4000);

		
	}


}
