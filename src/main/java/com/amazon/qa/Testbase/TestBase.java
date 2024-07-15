package com.amazon.qa.Testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.amazon.qa.util.TestUtil;


public class TestBase {
	
public	 static WebDriver driver;
public	static  Properties prop;
	
	
	
	
	
	
	public TestBase() {
		try {
		
	//	Properties prop=new Properties();
			prop=new Properties();
			
		FileInputStream ip= new FileInputStream("C://Users//Abhimanyu//eclipse-workspace//CRMTest//src//main//java//com//amazon//qa//config//Config.Properties");
		prop.load(ip);
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}catch (IOException e) {
		e.printStackTrace();
	}
	}
	

	
	public static void initialization() {
//		prop.getProperty("browser");
		
		String browsername=prop.getProperty("browser");
		
		if(browsername.equals("chrome")) {
	//		WebDriver driver=new ChromeDriver();
			driver=new ChromeDriver();
			
						
		}
		else if (browsername.equals("FF")) {
			driver=new FirefoxDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	//driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_Load_Timeout , TimeUnit.SECONDS);
	//	driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Wait, TimeUnit.SECONDS);
		//driver.get("url");
		driver.get(prop.getProperty("url"));
		
		
		
	}
	
}
