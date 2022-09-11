package com.norka.scripts;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.norka.Excelutility.Excelutility;
import com.norka.LoginPage.LoginPage;
import com.norka.LoginPage.LoginPage7;
import com.norka.LoginPage.LoginPage8;
import com.norka.automationconstants.AutomationConstants;
public class TestClass8 extends TestBase{
static LoginPage8 objlogin;
	
	
	@Test(priority=1)
	
	public static void verifyvalidlogin() throws IOException {
		String Inputname=Excelutility.getcelldata(6, 0);
		String EnterPassword=Excelutility.getcelldata(6, 1);
		objlogin = new LoginPage8(driver);
		objlogin.SubmitButton();
		objlogin.setUsername(Inputname);
		objlogin.SetPassword(EnterPassword);
		objlogin.SubmitButton2();
		//objlogin.SubmitButton3();
		
		String ActualTitle= AutomationConstants.HOMEPAGETITLE;
		String ExpectedTitle=driver.getTitle();
		
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//driver.quit();
}
}
