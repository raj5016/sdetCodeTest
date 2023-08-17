package mandatoryHomeWork.seleniumPractise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Formula {
	WebDriver driver;
	@Test
	public void findDriverName() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.formula1.com/");
		handleCookie();
		Actions ac = new Actions(driver);
		WebElement resultMenu=driver.findElement(By.xpath("//span[text()='Results']"));
		ac.moveToElement(resultMenu).build().perform();
		driver.findElement(By. xpath("//a[contains(text(),'Driver Standings')]")).click();
		handleCookie();
		
        WebElement table = driver.findElement(By.xpath("//table[@class='resultsarchive-table']/tbody"));
        
        List<WebElement> tableRows = table.findElements(By.tagName("tr"));
		
		for (int row=1;row<tableRows.size();row++) {
			
			List<WebElement> tablecells = tableRows.get(row).findElements(By.tagName("td"));
			
			for (int column=1;column<tablecells.size();column++) {
				
				String name=tablecells.get(column).getText();
				
					if(name.equalsIgnoreCase("Oscar Piastri")) {
						System.out.println("Name :"+ name);
						
						String position=driver.findElement(By.xpath("/html/body/div[2]/main/article/div/div[2]/div[2]/div[2]/div/table/tbody/tr["+(row+1)+"]/td[2]")).getText();
						
						System.out.println("The position is :"+ position);
						
						if (Integer.parseInt(position)<10) {
							System.out.println("Driver name is :"+ name +"is within 10 positions");
						}else {
							int value=Integer.parseInt(position)-10;
							System.out.println("Driver name is :"+ name +" he is in "+position+" th position and differnce  is from 10 to is position is : "+ value);
						}
						break;
					}
			}
		}
		driver.close();
	}
	

	public void handleCookie() {
		try {
			driver.findElement(By.xpath("//div[@id='truste-consent-buttons']//button[2]")).click();
		} catch (Exception e) {
			WebElement ele = driver.findElement(By.xpath("//iframe[@title='SP Consent Message']"));
			driver.switchTo().frame(ele);
			driver.findElement(By.xpath("//button[@title='ACCEPT ALL']")).click();
			driver.switchTo().defaultContent();
		}
	}
	}




