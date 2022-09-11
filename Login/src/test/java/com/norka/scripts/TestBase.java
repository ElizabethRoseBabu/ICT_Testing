package com.norka.scripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class TestBase {
	static WebDriver driver;
	public  static Properties prop=null;
	
	String DriverPath1="D:\\selenium_drivers\\chromedriver.exe";
	String DriverPath2="D:\\selenium_drivers\\geckodriver.exe";
	public static void TestBase() {
		
		try {
			 prop=new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources"+"/config.properties");
			
			
			prop.load(ip);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@BeforeTest
	void onsetup() {
		TestBase();
		//String BrowserName= prop.getProperty("browser");
		System.out.println("Enter your preferred browsername, chrome or firefox:" );
		Scanner input =new Scanner(System.in);
		String BrowserName=input.next();
		if(BrowserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", DriverPath1);
			 driver= new ChromeDriver();
		}
		else if(BrowserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", DriverPath2);
			 driver= new FirefoxDriver();
			
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		
	}
}
