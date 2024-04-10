package com.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Basics {
	
	@BeforeSuite
	public void setup() {
		System.out.println("set up the chrome properties");
	}
	
	@BeforeTest
	public void launchchrome() {
		System.out.println("Launch chrome");
	}
	
	@BeforeClass
	public void Enterurl() {
		System.out.println("Enter the url");
	}
	
	@BeforeMethod
	public void Login() {
		System.out.println("Login");
	}
	
	@Test
	public void GetTitle() {
		System.out.println("GetTitle");
	}
	@Test
	public void googlesearch() {
		System.out.println("Google search");
	}
	
	@Test
	public void gmail() {
		System.out.println("Gmail");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("Logout");
	}
	@AfterClass
	public void delcookies() {
		System.out.println("delete all cookies");
	}
	
	@AfterTest
	public void closebrowser() {
		System.out.println("Close browser");
	}
	
	@AfterSuite
	public void GenerateReport() {
		System.out.println("Generate report");
	}

}
