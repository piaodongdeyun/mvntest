package com.wong;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {
	public static void main(String[] args) {
		
		WebDriver driver = null;
		try {
			System.out.println("start firefox browser...");
			driver = new FirefoxDriver();
			String url = "https://www.baidu.com"; //百度的地址
			driver.get(url);

			// 感觉这个不起作用
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);////设置隐式等待10秒钟
			// new WebDriverWait(driver, 15).until(ExpectedConditions.presenceOfElementLocated(By.id("kw")));
			// 等待1s，出现id为kw元素出现后才继续执行
			//new WebDriverWait(driver, 100).until(ExpectedConditions
			//		.presenceOfElementLocated(By.id("kw")));
			WebElement element = driver.findElement(By.id("kw"));// .send_keys("qqq.com");
			element.sendKeys("你好坏呀-----------------------");
			driver.findElement(By.id("su")).click();
			driver.manage().window().setSize(new Dimension(480, 800));
			
			Thread.sleep(3000); // 让线程等待3秒钟
			driver.manage().window().maximize();
		} catch (InterruptedException e) {
			e.printStackTrace();
			driver.quit(); // 退出driver
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			driver.quit(); // 退出driver
		}

	}
}