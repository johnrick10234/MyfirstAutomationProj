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
		driver.findElement(By.linkText("Sign In")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement loginInput = wait.until(ExpectedConditions.elementToBeClickable(By.id("login_id")));
		loginInput.sendKeys("johnrickpogi23@gmail.com");
		
		driver.findElement(By.xpath("//button[@id='nextbtn']")).click();
		
		WebElement loginPass = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='password']")));
		
		loginPass.sendKeys("Testonly1234!");
//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Testonly1234!");
		driver.findElement(By.xpath("//button[@id='nextbtn']//span[contains(text(),'Sign in')]")).click();
		
		
	}

}
