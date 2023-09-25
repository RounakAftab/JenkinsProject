package com.PARA.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;



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
				
				//WebDriverManager.chromedriver().setup();
			    System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspace\\DummyProject\\src\\test\\resources\\driver\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
				driver.manage().window().maximize();
				
				
			}else if (config.getProperty("browser").equals("firefox")) {
				
				WebDriverManager.firefoxdriver().setup();
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
