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
import utilities.ReadXLSdata;

public class  TestLeadCreation extends BaseTest {
	
	@Test (dataProviderClass=ReadXLSdata.class,dataProvider="bvtdata")
	
	public void LeadCreate(String username, String password, String FirstName, String LastName, String Company) throws InterruptedException
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
		
		WebElement calendar = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(loc.getProperty("calendar"))));
		calendar.click();
//	    driver.findElement(By.linkText(loc.getProperty("leadbutton"))).click();
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
		WebElement leadbutton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(loc.getProperty("lead_button"))));	
		leadbutton.click();
		
		WebElement clb = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(loc.getProperty("Create_lead_button"))));
		clb.click();
		
		WebElement fn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(loc.getProperty("FirstName"))));
		
		fn.sendKeys(FirstName);
//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Testonly1234!");
		WebElement ln = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(loc.getProperty("LastName"))));
		
		ln.sendKeys(LastName);
		
		WebElement cp = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(loc.getProperty("Company"))));
		
		cp.sendKeys(Company);
		
		driver.findElement(By.xpath(loc.getProperty("lead_save_button"))).click();
		
	}


}
