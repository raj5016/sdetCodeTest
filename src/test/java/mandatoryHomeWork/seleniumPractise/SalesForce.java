package mandatoryHomeWork.seleniumPractise;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SalesForce {
	WebDriver driver;
	@Test
	public void findDriverName() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf$1234");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.id("//p[text()='Sales']//following::p[text()='Manage your sales process with accounts, leads, opportunities,...']")).click();
		driver.findElement(By.id("//p[text()='Accounts']")).click();
		driver.findElement(By.id("//div[text()='New']")).click();
		driver.findElement(By.xpath("//label[text()='Account Name']//following::div[1]/input")).sendKeys("Rah78");
		driver.findElement(By.id("//button[text()='Save']")).click();
		driver.close();
	}
	}




