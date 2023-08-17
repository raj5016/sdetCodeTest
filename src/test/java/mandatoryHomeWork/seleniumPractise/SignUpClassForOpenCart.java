package mandatoryHomeWork.seleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpClassForOpenCart {
	
	
	public void signUpDetailsFollowedByLogin(WebDriver driver, String firstname,String lastname,String emailId,String telephone,String password) {
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		
		driver.findElement(By.id("input-firstname")).sendKeys(firstname);
		driver.findElement(By.id("input-lastname")).sendKeys(lastname);
		driver.findElement(By.id("input-email")).sendKeys(emailId);
		driver.findElement(By.id("input-telephone")).sendKeys(telephone);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.id("input-confirm")).sendKeys(password);
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.xpath("//input[@name='agree']//following::input")).click();
		driver.findElement(By.xpath("//h1[text()='Your Account Has Been Created!']//following::div/div/a")).click();
	}
	
	public void signUpDetailsFollowedByLoginAndLogout(WebDriver driver, String firstname,String lastname,String emailId,String telephone,String password) {
		signUpDetailsFollowedByLogin(driver, firstname, lastname, emailId, telephone, password);
		driver.findElement(By.xpath("//aside[@id='column-right']/div/a[text()='Logout']")).click();
	}
	

}
