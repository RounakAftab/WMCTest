package com.WMC.testcasesCalender;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.WMC.base.TestBase;

public class UpdateCalender extends TestBase {
	
	@Test(priority = 3)
	public void calenderUpdate() throws InterruptedException {
		
        Thread.sleep(2000);
		
		driver.findElement(By.linkText("Edit")).click();
		Thread.sleep(3000);
		
		WebElement CalendarSubject= driver.findElement(By.cssSelector(OR.getProperty("Calendar_Subject")));
		CalendarSubject.clear();
		Thread.sleep(1000);
		CalendarSubject.sendKeys(LoginData.getProperty("Updated_Calendar_Subject_Data"));
		Thread.sleep(2000);
		
		driver.findElement(By.id(OR.getProperty("Calendar_View"))).click();
		Thread.sleep(2000);
		
		List <WebElement> CV= driver.findElements(By.cssSelector(OR.getProperty("Calendar_View_Data")));
		Thread.sleep(2000);

		for(WebElement Cvs : CV) {
			
			if(Cvs.getText().equalsIgnoreCase(LoginData.getProperty("UpdatedCVNameData"))) {
				
				Thread.sleep(2000);
				Cvs.click();
				break;
			}
				}
		
		WebElement CalenderCity= driver.findElement(By.id(OR.getProperty("Calender_City")));
		CalenderCity.clear();
		Thread.sleep(1000);
		CalenderCity.sendKeys(LoginData.getProperty("Updated_Calendar_City"));
		Thread.sleep(2000);
		
		WebElement CalendarRemarks= driver.findElement(By.id(OR.getProperty("Calender_Remarks")));
		CalendarRemarks.clear();
		Thread.sleep(1000);
		CalendarRemarks.sendKeys(LoginData.getProperty("Updated_Calendar_Remarks_Data"));
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Save")).click();
		Thread.sleep(6000);
		
	}

}
