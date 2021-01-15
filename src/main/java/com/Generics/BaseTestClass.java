package com.Generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTestClass implements AutoConstant
{
	public static WebDriver driver;

	@BeforeMethod
	public void BaseClass()
	{
		System.setProperty(chrome_key,chrome_value);
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		//BaseTestClass.driver = driver;
	}

	@AfterMethod
	public void CloseDriver()
	{
		//driver.quit();
	}
}
