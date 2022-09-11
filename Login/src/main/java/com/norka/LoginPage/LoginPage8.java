package com.norka.LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage8 {
	WebDriver driver;
	@FindBy(xpath="/html/body/app-root/app-home-main/app-header/div[2]/div/div/div/div/div/div/div/div[2]/form/div[1]/input")
	 WebElement Username;
	
	@FindBy(xpath="/html/body/app-root/app-home-main/app-header/div[2]/div/div/div/div/div/div/div/div[2]/form/div[2]/input")
	 WebElement Password;
	
	@FindBy(xpath="/html/body/app-root/app-home-main/app-header/div[1]/div/div/nav/div/div/ul/li[7]/a")
	WebElement LoginButton;
	
	@FindBy(xpath="/html/body/app-root/app-home-main/app-header/div[2]/div/div/div/div/div/div/div/div[2]/form/div[3]")
	WebElement SubmitButtons;
	
	//@FindBy(xpath="/html/body/div[2]/div/div[6]/button[1]")
	//WebElement Okaybutton;
	public LoginPage8(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void SubmitButton() {
		LoginButton.click();
		}
	public void setUsername(String UserName) {
		Username.sendKeys(UserName);
	}
	public void SetPassword(String PassWord) {
		Password.sendKeys(PassWord);
	}
	
	public void SubmitButton2() {
		SubmitButtons.click();
		}
		
	//public void SubmitButton3() {
		//Okaybutton.click();
		//}
	

}
