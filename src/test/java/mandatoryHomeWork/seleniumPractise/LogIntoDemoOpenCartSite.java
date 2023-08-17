package mandatoryHomeWork.seleniumPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogIntoDemoOpenCartSite {
	
	public void loginIntoOpencart(WebDriver driver,String password,String emailId) {
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.id("input-email")).sendKeys(emailId);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.xpath("//h2[text()='Returning Customer']//following::input[3]")).click();

	}
	
}
