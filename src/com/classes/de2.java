package com.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class de2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VINO\\eclipse-workspace\\classes\\Ch\\chromedriver.exe");
		WebDriver W = new ChromeDriver();
		W.get("https://www.flipkart.com/");
		W.manage().window().maximize();
		
		WebElement cil = W.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		cil.click();
		
		//user search Realme mobile
		WebElement real = W.findElement(By.xpath("//input[@class='_3704LK']"));
		real.sendKeys("realme");
		W.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		W.findElement(By.xpath("//span[text()='Cart']")).click();

	
	
	
		
		
		
		
		
		
		
		
	}

}
