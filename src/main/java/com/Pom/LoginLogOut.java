package com.Pom;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Generics.AutoConstant;
import com.Generics.ExcelLiberary;

public class LoginLogOut implements AutoConstant
{
	public WebDriver driver;

	@FindBy(name="name")
	private WebElement name;

	@FindBy(name="pwd")
	private WebElement password;

	@FindBy(xpath="//a[@id='loginButton']")
	private WebElement login;

	@FindBy(xpath="//a[@id='logoutLink']")
	private WebElement logout;


	public void loginlogout (WebDriver driver)
	{

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void loginmethod() throws InterruptedException, IOException
	{
		name.sendKeys(ExcelLiberary.getcellvalue(excel_path, Sheet_Name, 1, 0));
		password.sendKeys(ExcelLiberary.getcellvalue(excel_path, Sheet_Name, 2, 1));
		login.click();
		Thread.sleep(2000);
	}

	public void logoutmethod()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",logout);

	}




}
