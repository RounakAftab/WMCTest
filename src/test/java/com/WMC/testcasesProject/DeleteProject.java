package com.WMC.testcasesProject;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.WMC.base.TestBase;

public class DeleteProject extends TestBase {

	@Test(priority= 4)
	public void projectDelete() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Edit")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText(OR.getProperty("DeleteButton"))).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("button[class='swal2-confirm btn btn-danger']")).click();
		Thread.sleep(5000);
		
	}
}
