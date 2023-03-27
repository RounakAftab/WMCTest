package com.WMC.testcasesCalender;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.WMC.base.TestBase;

public class DeleteCalender extends TestBase {
	
	@Test(priority= 4)
	public void calenderDelete() throws InterruptedException {
		
			
			driver.findElement(By.linkText("Edit")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.linkText(OR.getProperty("DeleteButton"))).click();
			Thread.sleep(2000);
			
			driver.findElement(By.cssSelector("button[class='swal2-confirm btn btn-danger']")).click();
			Thread.sleep(5000);
	}

}
