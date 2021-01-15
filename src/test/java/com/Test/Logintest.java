package com.Test;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Generics.BaseTestClass;
import com.Pom.LoginLogOut;

@Listeners(com.Generics.ScreenShot_Utility.class)
public class Logintest extends BaseTestClass
{
	@Test
	public void shotmethod() throws InterruptedException, IOException
	{
		LoginLogOut sc = new LoginLogOut();
		sc.loginmethod();
	}
}
