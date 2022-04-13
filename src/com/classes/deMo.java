package com.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class deMo {
	public static void main(String[] args) throws InterruptedException {
		 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VINO\\eclipse-workspace\\classes\\Ch\\chromedriver.exe");
		WebDriver W = new ChromeDriver();
		W.get("https://www.flipkart.com/");
		W.manage().window().maximize();
		
		
		WebElement cli = W.findElement(By.xpath("//a[@class='_14Me7y']"));
		cli.click();
		WebElement mo = W.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		mo.sendKeys("9080655955");
		WebElement cl2 = W.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		cl2.click();
		WebElement c3 = W.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		c3.click();
		WebElement c4 = W.findElement(By.xpath("//div[@class='xtXmba']"));
		c4.click();
		
		WebElement down = W.findElement(By.xpath("(//span[@class='hDTmm5'])[3]"));
		WebElement up = W.findElement(By.xpath("(//img[@class='kJjFO0 _3DIhEh'])[4]"));
		
		
		
		
		
		
}

}
