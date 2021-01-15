package com.Generics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BasePageClass

{
	public WebDriver driver;
	public void SelectByVisibleText(WebElement element, String text)

	{
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}

	public void SelectByValue(WebElement element, String value)
	{
		Select sel = new Select(element);
		sel.selectByValue(value);
	}


	public void SelectByIndex(WebElement element, int index)
	{
		Select sel = new Select (element);
		sel.selectByIndex(index);
	}

	public void MoveToElement(WebElement target)
	{
		Actions act=new Actions(driver);
		act.moveToElement(target).perform();

	}

	public void enterrobot() throws AWTException
	{
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
	}

	public void PopupHandler()
	{
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
		//al.dismiss();
	}

}


