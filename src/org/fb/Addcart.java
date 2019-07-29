package org.fb;

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
			

}
}
