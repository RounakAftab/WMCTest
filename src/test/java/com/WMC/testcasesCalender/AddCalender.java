package com.WMC.testcasesCalender;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.WMC.base.TestBase;

public class AddCalender extends TestBase {
	
	@Test(priority = 2)
	public void goCalenderPage() throws InterruptedException {
		
		driver.findElement(By.cssSelector(OR.getProperty("Calender_Menu"))).click();
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("New Appointment")).click();
		Thread.sleep(7000);
		
		WebElement CalendarSubject= driver.findElement(By.cssSelector(OR.getProperty("Calendar_Subject")));
		CalendarSubject.sendKeys(LoginData.getProperty("Calendar_Subject_Data"));
		Thread.sleep(2000);
		
		driver.findElement(By.id(OR.getProperty("Calendar_View"))).click();
		Thread.sleep(2000);
		
		List <WebElement> CV= driver.findElements(By.cssSelector(OR.getProperty("Calendar_View_Data")));
		Thread.sleep(2000);

		for(WebElement Cvs : CV) {
			
			if(Cvs.getText().equalsIgnoreCase(LoginData.getProperty("CVNameData"))) {
				
				Thread.sleep(2000);
				Cvs.click();
				break;
			}
				}
		
		WebElement CalenderCity= driver.findElement(By.id(OR.getProperty("Calender_City")));
		CalenderCity.sendKeys(LoginData.getProperty("Calendar_City"));
		Thread.sleep(2000);
		
		WebElement CalendarRemarks= driver.findElement(By.id(OR.getProperty("Calender_Remarks")));
		CalendarRemarks.sendKeys(LoginData.getProperty("Calendar_Remarks_Data"));
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(OR.getProperty("Calendar_Save_Button"))).click();
		Thread.sleep(7000);
		
		
		
	}

}
