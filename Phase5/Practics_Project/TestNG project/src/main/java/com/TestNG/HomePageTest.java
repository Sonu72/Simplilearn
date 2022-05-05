package com.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest {

WebDriver driver;
	
    @BeforeMethod
    public void setUp() {
    	driver = new ChromeDriver();
    	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	driver.manage().window().maximize();
    	driver.manage().deleteAllCookies();
    	driver.get("http://www.freecrm.com");    	
    	login("naveenk", "test@123");
    	driver.switchTo().frame("mainpanel");
    }
    
    @Test(priority=1)
    public void clickOnContactsLinkTest() {
    	WebElement contacts = driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
    	contacts.click();
    }
    
    @Test(priority=2)
    public void clickOnDealsLinkTest() {
    	WebElement deals = driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
    	deals.click();
    }
    
    @AfterMethod
    public void tearDown() {
    	driver.quit();
    }
    
    
    public void login(String email, String password) {
    	driver.findElement(By.name("email")).sendKeys(email);
    	driver.findElement(By.name("password")).sendKeys(password);
    	
    	WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]"));
    	JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("arguments[0].click();", loginBtn);
    }
}
