package org.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Greentech_Class\\Selenium\\Selenium\\Drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		
		
		
		try {
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("iphone x");
		}
		catch(org.openqa.selenium.StaleElementReferenceException e)
		{
		}
		
		Thread.sleep(5000);
		
		WebElement submit=  driver.findElement(By.xpath("(//input[@class='nav-input'])[1]"));
		submit.click();
		
		Thread.sleep(5000);
		
		WebElement select = driver.findElement(By.xpath("(//span[text()='Simple Mobile Prepaid - Apple iPhone X (64GB) - Silver'])[2]"));
		select.click();
	}

}
