package com.WMC.testcasesMonitor;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.WMC.base.TestBase;

public class UpdateMonitor extends TestBase {
	
	@Test(priority = 3)
	public void monitorUpdated() throws InterruptedException {
		
        Thread.sleep(4000);
		
		driver.findElement(By.linkText("Edit")).click();
		Thread.sleep(4000);
		
		 driver.findElement(By.id(OR.getProperty("Vacation_Field_Click"))).click();
			
		WebElement ct= driver.findElement(By.cssSelector(OR.getProperty("Vacation_Type")));
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
        
        driver.findElement(By.id(OR.getProperty("Status_DI"))).click(); 
        List<WebElement> sv= driver.findElements(By.cssSelector(OR.getProperty("Status_Values")));
       
         
        for(WebElement Svs : sv) {
 			
 			if( Svs.getText().equalsIgnoreCase(LoginData.getProperty("Update_V_Data"))) {
 				
 				Thread.sleep(2000);
 				Svs.click();
 				break;
 				
 			}
 				}
        Thread.sleep(2000);
        
        WebElement ta= driver.findElement(By.id(OR.getProperty("Text_Area")));
        ta.sendKeys(LoginData.getProperty("Updated_text_Data"));
        Thread.sleep(2000);
        
        driver.findElement(By.linkText("Save")).click();
        Thread.sleep(5000);
	}

}
