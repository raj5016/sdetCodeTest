package mandatoryHomeWork.seleniumPractise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LeafTaps {
	
	@Test
	public void createLead() {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//div[@id='label']//following::a")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("IgInfotech");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sundar");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("rao");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("raoji");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("hrteam");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("My Hr team will hire");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("rajguru@gmail.com");
		
		WebElement element=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select select=new Select(element);
		select.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		Assert.assertEquals("View Lead | opentaps CRM", driver.getTitle());
		

	}

}
