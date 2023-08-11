package com.seleniumPractise;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.supportclass.RandomGenerator;

public class HomePageOfOpenCart {
	WebDriver driver;
	String password="Govind@2023";
	String firstName=RandomGenerator.randomFirstName();
	String lastName=RandomGenerator.randomLastName();
	String existingEmailIdAsUser="oliviajohnson0581@example.com";
	
	@BeforeTest
	public void launchBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.tutorialsninja.com/demo/");
	}
	
	@Test
	public void homePageBySignUpAndLogin() {
		
		SignUpClassForOpenCart signUpPage=new SignUpClassForOpenCart();
		String randomEmailid=RandomGenerator.randomEmailAddress(firstName,lastName);
				
		signUpPage.signUpDetailsFollowedByLoginAndLogout(driver, firstName, 
				lastName, randomEmailid, 
				RandomGenerator.randomPhoneNumber(), password);
		
		LogIntoDemoOpenCartSite loginPage=new LogIntoDemoOpenCartSite();
		loginPage.loginIntoOpencart(driver, password, randomEmailid);
		
		//Validating user is launched to home page or not
		System.out.println(driver.getTitle());
		Assert.assertEquals("My Account", driver.getTitle());
		
		driver.close();
		
	}
	
	@Test
	public void loginAsExsitingCustomer() {
		LogIntoDemoOpenCartSite loginPage=new LogIntoDemoOpenCartSite();
		loginPage.loginIntoOpencart(driver, password, existingEmailIdAsUser);
		
		//Validating user is launched to home page or not
		System.out.println(driver.getTitle());
		Assert.assertEquals("My Account", driver.getTitle());
		
		driver.close();
	}
	
	

}
