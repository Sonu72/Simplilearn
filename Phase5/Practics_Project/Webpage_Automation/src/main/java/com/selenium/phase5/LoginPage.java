package com.selenium.phase5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPage 
{
	@Test
    public static void main( String[] args )
    {
    	WebDriver driver=new ChromeDriver();

    	driver.manage().window().maximize();

    	String url = "https://www.lambdatest.com/";
    	
    	driver.get(url);
    	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    	
    	WebElement login = driver.findElement(By.linkText("Login"));
    	System.out.println("Clicking on login element in main page");
    	login.click();
    	
    	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    	
    	WebElement email= driver.findElement(By.id("email"));
    	WebElement password= driver.findElement(By.id("password"));
    	WebElement loginButton= driver.findElement(By.id("login-button"));
    	
    	email.clear();
    	System.out.println("entering email");
    	email.sendKeys("abcd@gmail.com");
    	
    	
    	password.clear();
    	System.out.println("entering password");
    	password.sendKeys("abcd123");
    	
    	loginButton.click();
    	
    	String actualTitle = driver.getTitle();
    	System.out.println("tile of webpage is"+ actualTitle);
    	
    	String expectedTitle= "welcome - LambdaTest";
    	
    	Assert.assertEquals(actualTitle,expectedTitle,"The actual and expected title don't match");
    	
    	
    	
    }
}
