package com.WMC.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class TestBase {


	public static WebDriver driver;
	public static Properties config = new Properties();
	public static Properties OR = new Properties();
	public static Properties LoginData = new Properties();
	public static FileInputStream fis;
	


	@BeforeSuite
	public void setUP() throws IOException {

		if (driver== null) {
			
			 fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\Config.properties");
			 config.load(fis);
			 
			 fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\OR.properties");
			 OR.load(fis);
			 
			 fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\LoginData.properties");
			 LoginData.load(fis);
			 
			}
			
			if (config.getProperty("browser").equals("chrome")) {
				
				ChromeOptions co = new ChromeOptions();
				co.addArguments("--remote-allow-origins=*");
				driver = new ChromeDriver(co);
				driver.manage().window().maximize();
				
				
			}else if (config.getProperty("browser").equals("firefox")) {
				
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
			}
				
				driver.get(config.getProperty("testsiteurl"));
				driver.manage().window().maximize();
			   
	}

	@AfterSuite
	public void tearDown() {

		if (driver != null) {
			driver.quit();

		}
	}

}
