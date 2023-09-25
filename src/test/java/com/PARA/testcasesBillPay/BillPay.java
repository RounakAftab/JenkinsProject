package com.PARA.testcasesBillPay;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.PARA.base.TestBase;

public class BillPay extends TestBase{

    @Test (priority = 2)
	public void goContactPage() throws InterruptedException {

		
		
		driver.findElement(By.linkText(OR.getProperty("Bill_Pay"))).click();
		Thread.sleep(2000);
		
		//Update Contact
		
		WebElement PayName= driver.findElement(By.cssSelector(OR.getProperty("Payee_Name")));
		PayName.sendKeys("Roza");
		Thread.sleep(2000);
	
		
		WebElement PAddress= driver.findElement(By.cssSelector(OR.getProperty("payee_Address")));
	    PAddress.sendKeys("Badda");
	    Thread.sleep(2000);
		
		WebElement PCity= driver.findElement(By.cssSelector(OR.getProperty("payee_City")));
		PCity.sendKeys("Dhaka");
		Thread.sleep(2000);
		
		WebElement PState= driver.findElement(By.cssSelector(OR.getProperty("payee_State")));
	    PState.sendKeys("State Dhaka");
		Thread.sleep(2000);
		
		WebElement PZip= driver.findElement(By.cssSelector(OR.getProperty("payee_Zip")));
		PZip.sendKeys("1216");
		Thread.sleep(2000);
		
		WebElement PNumber= driver.findElement(By.cssSelector(OR.getProperty("payee_number")));
		PNumber.sendKeys("0193938338");
		Thread.sleep(2000);
		
		WebElement PANumber= driver.findElement(By.cssSelector(OR.getProperty("payee_Acc_Number")));
		PANumber.sendKeys("212121");
		Thread.sleep(2000);
		
		WebElement PVerifyNumber= driver.findElement(By.cssSelector(OR.getProperty("payee_Verify_Number")));
		PVerifyNumber.sendKeys("212121");
		Thread.sleep(2000);
		
		WebElement Pamount= driver.findElement(By.cssSelector(OR.getProperty("payee_Amount")));
		Pamount.sendKeys("555");
		Thread.sleep(2000);
		
		WebElement PSendButton= driver.findElement(By.cssSelector(OR.getProperty("payee_send")));
		PSendButton.click();
		Thread.sleep(4000);
		

		
	}


}
