package com.norka.scripts;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.norka.Excelutility.Excelutility;
import com.norka.LoginPage.LoginPage;
import com.norka.LoginPage.LoginPage3;
import com.norka.automationconstants.AutomationConstants;
public class TestClass3 extends TestBase {
	static LoginPage3 objlogin;
	
	
	@Test(priority=1)
	
	public static void verifyvalidlogin() throws IOException {
		String Inputname=Excelutility.getcelldata(2, 0);
		String EnterPassword=Excelutility.getcelldata(2, 1);
		objlogin = new LoginPage3(driver);
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