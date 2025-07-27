package testcase;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.BaseTest;

public class  TestLogInFunctionality extends BaseTest {
	
	@Test (dataProvider="testdata")
	
	public static void LoginTest(String username, String password) throws InterruptedException
	{
		driver.findElement(By.linkText(loc.getProperty("signin_link"))).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement loginInput = wait.until(ExpectedConditions.elementToBeClickable(By.id(loc.getProperty("email_field"))));
		loginInput.sendKeys(username);
		
		driver.findElement(By.xpath(loc.getProperty("next_button"))).click();
		
		WebElement loginPass = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(loc.getProperty("password_field"))));
		
		loginPass.sendKeys(password);
//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Testonly1234!");
		driver.findElement(By.xpath(loc.getProperty("login_next_button"))).click();
		
		
	}
	
	@DataProvider(name="testdata")
	public Object[][] tData()
	{
		return new Object[][] 
		{
			{"johnrickpo@gmail.com","test"},
			{"johnrickpogi23@gmail.com","test"},
			{"johnrickpogi23@gmail.com","Testonly1234!"}
			
		};
	}

}
