package com.Comcast.crmorgtest;

import org.testng.annotations.Test;

public class OrgTest {
	@Test(groups = "Smoke")
	public void createorgTest() {
		System.out.println("Running createorgTest");
	}
	
	@Test(groups = "Regression")
	public void deleteorgTest() {
		System.out.println("running deleteorgTest");
		
	}
	
	@Test (groups = "Smoke")
	public void editorgTest() {
		System.out.println("running editorgTest");
		
	}

}
