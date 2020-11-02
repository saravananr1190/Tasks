package org.tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver d;
	public static void Launch(String url) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Task1\\driver\\chromedriver.exe");
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.get(url);
		
	
	}
	public static WebElement findById(String name){
		return d.findElement(By.id(name));
	}
	public static WebElement findByname(String name){
		return d.findElement(By.name(name));
	}
	public static WebElement findByClassname(String name){
		return d.findElement(By.className(name));
	}
	public static WebElement findByxpath(String name){
		return d.findElement(By.xpath(name));
	}
	public static void type(WebElement e, String name) {
		e.sendKeys(name);	
	}

}
