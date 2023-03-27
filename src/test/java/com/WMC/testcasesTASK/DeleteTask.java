package com.WMC.testcasesTASK;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.WMC.base.TestBase;

public class DeleteTask extends TestBase {
	
	@Test(priority = 4)
	public void TaskDelete() throws InterruptedException {
		
		Thread.sleep(4000);
		driver.findElement(By.linkText(OR.getProperty("EditButton"))).click();
		Thread.sleep(4000);
		
		driver.findElement(By.linkText(OR.getProperty("DeleteButton"))).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector(OR.getProperty("DeleteAllButton"))).click();
		Thread.sleep(5000);
	
	}

}
