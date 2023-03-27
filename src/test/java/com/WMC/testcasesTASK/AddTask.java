package com.WMC.testcasesTASK;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.WMC.base.TestBase;


public class AddTask extends TestBase {
	
	@Test (priority = 2)
	public void goTaskPage() throws InterruptedException {
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(OR.getProperty("Task_Menu"))).click();
		Thread.sleep(5000);
		
		//Create Task
		driver.findElement(By.linkText(OR.getProperty("NewTaskCreateButton"))).click();
		Thread.sleep(2000);
		
        driver.findElement(By.id(OR.getProperty("ClickOnPriorityField"))).click();
        Thread.sleep(2000);
		
		List <WebElement> priorities =driver.findElements(By.cssSelector(OR.getProperty("PriorityAllData")));
		Thread.sleep(2000);
		
		for(WebElement prioritie : priorities) {
			
			if(prioritie.getText().equalsIgnoreCase(LoginData.getProperty("PriorityValue"))) {
				
				Thread.sleep(2000);
				prioritie.click();
				break;
			}
			
		}
		
		WebElement subjectField= driver.findElement(By.id(OR.getProperty("SubjectField")));
		subjectField.sendKeys(LoginData.getProperty("SubjectValue"));
		Thread.sleep(1000);
		
		WebElement remarksField= driver.findElement(By.id(OR.getProperty("RemarksField")));
		remarksField.sendKeys(LoginData.getProperty("RemarksValue"));
		Thread.sleep(3000);
		
		
		driver.findElement(By.linkText(OR.getProperty("SaveButton"))).click();
		Thread.sleep(9000);
	    
	    driver.findElement(By.linkText(OR.getProperty("ViewButton"))).click();
		Thread.sleep(5000);
		
		
		
		
	}

}
