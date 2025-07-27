package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.BaseTest;

public class  MyFirstTestFW extends BaseTest {
	
	@Test
	
	public static void LoginTest()
	{
		driver.findElement(By.linkText(loc.getProperty("signin_link"))).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement loginInput = wait.until(ExpectedConditions.elementToBeClickable(By.id(loc.getProperty("email_field"))));
		loginInput.sendKeys("johnrickpogi23@gmail.com");
		
		driver.findElement(By.xpath(loc.getProperty("next_button"))).click();
		
		WebElement loginPass = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(loc.getProperty("password_field"))));
		
		loginPass.sendKeys("Testonly1234!");
//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Testonly1234!");
		driver.findElement(By.xpath(loc.getProperty("login_next_button"))).click();
		
		
	}

}
