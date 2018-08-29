/**
 * 
 */
package com.wong;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author John Wong
 * Version 1.0
 * 2018年8月26日
 */
public class Browser {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.baidu.com");
		driver.manage().window().maximize();  
		driver.manage().window().setSize(new Dimension(480, 800));
	       
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		new WebDriverWait(driver, 1).until(ExpectedConditions.presenceOfElementLocated(By.id("kw")));
		WebElement element =  driver.findElement(By.id("kw"));//.send_keys("qqq.com");
		element.sendKeys("你好坏呀-----------------------");
		driver.findElement(By.id("su")).click();
	}
}
