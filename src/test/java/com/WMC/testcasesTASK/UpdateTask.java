package com.WMC.testcasesTASK;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.WMC.base.TestBase;

public class UpdateTask extends TestBase{
	
	@Test (priority = 3)
	public void taskUpdate() throws InterruptedException {
		
		Thread.sleep(3000);
		
		driver.findElement(By.id(OR.getProperty("TaskSearch"))).click();
		
		WebElement subjectSearch= driver.findElement(By.id(OR.getProperty("TaskSearch")));
		subjectSearch.sendKeys(LoginData.getProperty("SubjectValue"));
		Thread.sleep(1000);
		subjectSearch.sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		
		driver.findElement(By.cssSelector(OR.getProperty("ClickonSubjectColumnValue"))).click();
		Thread.sleep(4000);
		
		driver.findElement(By.linkText(OR.getProperty("EditButton"))).click();
		Thread.sleep(5000);
		
		WebElement subjectField= driver.findElement(By.id(OR.getProperty("SubjectField")));
		subjectField.clear();
		subjectField.sendKeys(LoginData.getProperty("UpdatedSubjectValue"));
		Thread.sleep(1000);
		
		WebElement remarksField= driver.findElement(By.id(OR.getProperty("RemarksField")));
		remarksField.clear();
		remarksField.sendKeys(LoginData.getProperty("UpdatedRemarksValue"));
		Thread.sleep(1000);
		
		
		driver.findElement(By.linkText(OR.getProperty("SaveButton"))).click();
		Thread.sleep(7000);
	    

		
		
	}

}
