package org.fb;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addcart {
	
	

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","E:\\Greentech_Class\\Selenium\\Facebook\\Driver\\chromedriver.exe" );
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			WebElement user = driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']"));
			user.sendKeys("ramac660@gmail.com");
			WebElement pass= driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']"));
			pass.sendKeys("Rama@1591");
			WebElement sub = driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']"));
			sub.click();
			Thread.sleep(5000);
			try {
			WebElement search = driver.findElement(By.xpath("//input[@class='LM6RPg']"));
			search.sendKeys("iphone 7");
			}
			catch(org.openqa.selenium.StaleElementReferenceException e)
			{
			}
			
			Thread.sleep(5000);
			
			WebElement submit=  driver.findElement(By.xpath("//button[@class='vh79eN']"));
			submit.click();
			
			Thread.sleep(5000);
			
			WebElement select = driver.findElement(By.xpath("//img[@class='_1Nyybr  _30XEf0']"));
			select.click();
			
		String pwid =	driver.getWindowHandle();
		System.out.println(pwid);
		
		
		Set<String> li = driver.getWindowHandles();
		
		for (String x : li) {
			
		     if(!pwid.equals(x)) {
		    	 driver.switchTo().window(x);
		    	 System.out.println(x);
		    	 
		    	 WebElement pincode = driver.findElement(By.id("pincodeInputId"));
		    	 pincode.sendKeys("600015");
		    	 
		    	 WebElement check = driver.findElement(By.xpath("//span[@class='_2aK_gu']"));
		    	 check.click();
		    	 
		    	 Thread.sleep(5000);
		    	 WebElement addCart = driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']"));
		    	 addCart.click();
		    	 Thread.sleep(5000);
		    	WebElement print =  driver.findElement(By.xpath("//span[@class='pMSy0p XU9vZa']"));
		    	String text = print.getText();
		    	System.out.println(text);
		     }
			
		}
			
			

}
}
