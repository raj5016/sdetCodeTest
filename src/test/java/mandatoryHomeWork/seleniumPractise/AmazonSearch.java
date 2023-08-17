package mandatoryHomeWork.seleniumPractise;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AmazonSearch {
	
	//https://samedesilva.medium.com/how-to-get-driver-path-in-selenium-java-4-10-0-624694af9691
	//Now selenium manager will download exe automatically and store in user/cache/selenium
	WebDriver driver=new ChromeDriver();
	
	@Test
	public void searchProducts() {
   
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		selectBooksMenu();
		getNameOfBooks();
		getAuthorOfFirstResult();
		driver.close();
	}
	
	public void selectBooksMenu() {
		WebElement element=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select options=new Select(element);
		options.selectByVisibleText("Books");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Atomic Habits");
		driver.findElement(By.id("nav-search-submit-button")).click();
	}
	
	public void getNameOfBooks() {
		List<WebElement> elements=driver.findElements(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span"));
		for (WebElement webElement : elements) {
			System.err.println(webElement.getText());
		}
	}
	
	public void getAuthorOfFirstResult() {
		driver.findElement(By.xpath("//span[contains(text(),'Results')]//following::h2[1]/a[contains(@href,'/sspa')]/span[1]")).click();
		  ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
	      //switch to new tab
	      driver.switchTo().window(newTb.get(1));
	      String authorName=driver.findElement(By.xpath("//span[contains(text(),'Author')]//ancestor::span/a")).getText();
	      System.out.println("Author name :" + authorName);
	      driver.close();
	    //switch to parent window
	      driver.switchTo().window(newTb.get(0));	
	}

}
