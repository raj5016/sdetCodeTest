package mandatoryHomeWork.seleniumPractise.salesForce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JiraTestCaseCreation {
	
	WebDriver driver;
	String summary="TestCase creation by Govind1";
	@Test
	public void createTestCase() throws InterruptedException{
		
		ChromeOptions options = new ChromeOptions();	
		options.addArguments("--disable-notifications");	

		driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://api-training.atlassian.net/");
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@testleaf.com");
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
		driver.findElement(By.id("password")).sendKeys("India@123");
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		driver.findElement(By.xpath("//p[normalize-space()='SDET-5']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[normalize-space()='Create']")).click();
		driver.findElement(By.id("summary-field")).sendKeys(summary);
		driver.findElement(By.xpath("//button[@type='submit']/span")).click();
		driver.findElement(By.xpath("//span[text()='Backlog']")).click();
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys(summary);
		String verifiedSummary=driver.findElement(By.xpath("//div[@data-rbd-droppable-id='TRANSITION-ZONE::BACKLOG']/following-sibling::div//mark")).getText();
		Assert.assertEquals(summary, verifiedSummary);
		driver.quit();

}
}