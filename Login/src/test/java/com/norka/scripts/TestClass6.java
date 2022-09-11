package com.norka.scripts;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.norka.Excelutility.Excelutility;
import com.norka.LoginPage.LoginPage;
import com.norka.LoginPage.LoginPage6;
import com.norka.automationconstants.AutomationConstants;
public class TestClass6 extends TestBase {
static LoginPage6 objlogin;
	
	
	@Test(priority=1)
	
	public static void verifyvalidlogin() throws IOException {
		double Inputname=Excelutility.getcelldata1(5, 0);
		double EnterPassword=Excelutility.getcelldata1(5, 1);
		objlogin = new LoginPage6(driver);
		objlogin.SubmitButton();
		objlogin.setUsername(Inputname);
		objlogin.SetPassword(EnterPassword);
		objlogin.SubmitButton();
		
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
