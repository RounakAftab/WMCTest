package com.WMC.testcasesProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.WMC.base.TestBase;

public class UpdateProject extends TestBase {

	@Test(priority = 3)
	public void projectUpdate() throws InterruptedException {
		
        Thread.sleep(4000);
		
		driver.findElement(By.linkText("Edit")).click();
		Thread.sleep(4000);
		
        driver.findElement(By.id(OR.getProperty("Contact_Field_Click"))).click();
		
		WebElement ct= driver.findElement(By.cssSelector(OR.getProperty("Contact_Type")));
		ct.clear();
		Thread.sleep(1000);
		ct.sendKeys(LoginData.getProperty("Update_Contact_Type"));
		Thread.sleep(3000);
		
		List <WebElement> PCV= driver.findElements(By.cssSelector(OR.getProperty("Project_Contact_Data")));
		Thread.sleep(2000);
		
        for(WebElement Pcvs : PCV) {
			
			if( Pcvs.getText().equalsIgnoreCase(LoginData.getProperty("Update_PCVData"))) {
				
				Thread.sleep(2000);
				Pcvs.click();
				break;
				
			}
				}
        
        Thread.sleep(2000);
        
        driver.findElement(By.id(OR.getProperty("Project_Status_Field_Click"))).click();
        
        WebElement psft= driver.findElement(By.cssSelector(OR.getProperty("Project_Status_Field_Type")));
        psft.sendKeys(LoginData.getProperty("Project_Status_Value"));
        
        List <WebElement> PSValues= driver.findElements(By.cssSelector(OR.getProperty("Project_Status_Values")));
		Thread.sleep(2000);
		
            for(WebElement PSVal : PSValues) {
			
			if(PSVal.getText().equalsIgnoreCase(LoginData.getProperty("Update_Project_Status_Data"))) {
				
				Thread.sleep(2000);
				PSVal.click();
				break;
			}
				}
		
            WebElement ProTitle= driver.findElement(By.id(OR.getProperty("Project_Title")));
            ProTitle.clear();
            Thread.sleep(1000);
            ProTitle.sendKeys(LoginData.getProperty("Update_Project_Title"));
            Thread.sleep(1000);
         
            WebElement proinfo= driver.findElement(By.id(OR.getProperty("Project_Info")));
            proinfo.clear();
            Thread.sleep(1000);
            proinfo.sendKeys(LoginData.getProperty("Update_Info_Data"));
            Thread.sleep(1000);
            
            driver.findElement(By.linkText("Save")).click();
            Thread.sleep(5000);
	}
}
