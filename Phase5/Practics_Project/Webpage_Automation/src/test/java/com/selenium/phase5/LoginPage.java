package com.selenium.phase5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPage {
	  @Test
	  public void login() {
	  
		  WebDriver driver=new ChromeDriver();
	  
		  driver.manage().window().maximize();
	  
		  driver.get("https://www.browserstack.com/users/sign_in");
	  
		  WebElement username=driver.findElement(By.id("user_email_login"));
	  
		  WebElement password=driver.findElement(By.id("user_password"));
	 
		  WebElement login=driver.findElement(By.name("commit"));
		  
		  System.out.println("entering email");
	  
		  username.sendKeys("ankitapatil88060@gmail.com");
		  
		  System.out.println("entering password");
	  
		  password.sendKeys("abcd123");
		  
		  System.out.println("click on login button");
	  
		  login.click();
	  
		
	  
  }
}
