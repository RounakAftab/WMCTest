package com.WMC.testcasesVacation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.WMC.base.TestBase;

public class AddVacation extends TestBase {

	@Test (priority = 2)
	public void goVacationPage() throws InterruptedException {

		Thread.sleep(3000);	

		driver.findElement(By.xpath(OR.getProperty("V_M"))).click();
		Thread.sleep(2000);

		List <WebElement> cv=driver.findElements(By.cssSelector(OR.getProperty("vacation_Select")));
		Thread.sleep(2000);

		for(WebElement cvs : cv) {

			if(cvs.getText().equalsIgnoreCase(LoginData.getProperty("vacation_Value"))) {

				Thread.sleep(2000);
				cvs.click();
				break;
			}
		}
		
		Thread.sleep(5000);
		
		driver.findElement(By.linkText(OR.getProperty("create_Vacation"))).click();
		Thread.sleep(2000);
		driver.findElement(By.id(OR.getProperty("User_Field_Click"))).click();

		WebElement vacaType= driver.findElement(By.cssSelector(OR.getProperty("User_Field_Type")));
		vacaType.sendKeys("an");
		Thread.sleep(2000);

		List <WebElement> names	=driver.findElements(By.cssSelector(OR.getProperty("User_Name_List")));
		Thread.sleep(2000);

		for(WebElement name : names) {

			if(name.getText().equalsIgnoreCase(LoginData.getProperty("user_name"))) {

				Thread.sleep(2000);
				name.click();
				break;
			}
		}

		Thread.sleep(5000);
		
		driver.findElement(By.id(OR.getProperty("Type_Click"))).click();
		List <WebElement> tList = driver.findElements(By.cssSelector(OR.getProperty("Type_List")));
		Thread.sleep(2000);

		for(WebElement tl : tList) {

			if(tl.getText().equalsIgnoreCase(LoginData.getProperty("type_name"))) {

				Thread.sleep(2000);
				tl.click();
				break;
			}
		}

	
		Thread.sleep(5000);
		
		driver.findElement(By.id(OR.getProperty("Deputy_click"))).click();
		WebElement dt= driver.findElement(By.cssSelector(OR.getProperty("Deputy_Type")));
		dt.sendKeys(LoginData.getProperty("deputy_Value"));
		Thread.sleep(2000);

		List <WebElement> dvs= driver.findElements(By.cssSelector(OR.getProperty("Deputy_Values")));

		Thread.sleep(2000);

		for(WebElement dv : dvs ) {

			if(dv.getText().equalsIgnoreCase(LoginData.getProperty("deputy_Name"))) {

				Thread.sleep(2000);
				dv.click();
				break;
			}
		}

		WebElement messageField= driver.findElement(By.id(OR.getProperty("Message")));
		messageField.sendKeys(LoginData.getProperty("messageValue"));

		driver.findElement(By.linkText(OR.getProperty("SaveButton"))).click();
		Thread.sleep(9000);

		driver.findElement(By.linkText(OR.getProperty("ViewButton"))).click();
		Thread.sleep(5000);


	}

}
