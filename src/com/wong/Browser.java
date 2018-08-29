/**
 * 
 */
package com.wong;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

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
	}
}
