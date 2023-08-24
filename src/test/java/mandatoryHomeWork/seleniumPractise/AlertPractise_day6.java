package mandatoryHomeWork.seleniumPractise;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertPractise_day6 {

	@Test
	public void test() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alert=driver.switchTo().alert();
		String alertText=alert.getText();
		System.out.println(alertText);
		// Accept the alert (click OK)
        alert.accept();
        if (alertText.contains("OK")) {
        	String expectedtext=driver.findElement(By.xpath("//p[text()='You pressed OK!']")).getText();
			Assert.assertEquals(expectedtext, "You pressed OK!");
		}
        driver.close();

	}

}
