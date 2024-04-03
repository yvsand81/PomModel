package Utility;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Helper {
	public static WebDriver driver;
	public static Wait<WebDriver> wait;
	
	
	public  Helper(WebDriver driver )
	{
		this.driver = driver;
		
		wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
	}
	
	
	public static WebElement getElementID(String locator)
	{
		
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locator)));
		
	}
	
	public static WebElement getElementClassName(String locator)
	{
		
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(locator)));
		
	}
	
	public static WebElement getElementName(String locator)
	{
		
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(locator)));
		
	}
	public static WebElement getElementXpath(String locator)
	{
		
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
		
	}
	public static WebElement getElementCSS(String locator)
	{
		
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(locator)));
		
	}

}
