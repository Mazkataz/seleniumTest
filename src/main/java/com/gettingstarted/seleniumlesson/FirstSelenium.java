package com.gettingstarted.seleniumlesson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FirstSelenium {
	

	public static final String PASSWORD = "$ABC321";
	public static final String FIRSTNAME = "Joe";
	public static final String LASTNAME = "Shmoe";
	public static final String EMAIL = "abc123@gmail.com";


	
	
@Test
	public void firstTime() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PSAdmin\\Desktop\\important libraries\\Working_with_selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.facebook.com/");

		//driver.manage().window().maximize();
		//Thread.sleep(100); 
		
		
		
		WebElement firstname = driver.findElement(By.id("u_0_9"));
		firstname.click(); 
		firstname.sendKeys(FIRSTNAME);

		WebElement lastname = driver.findElement(By.id("u_0_b"));
		lastname.click(); 
		lastname.sendKeys(LASTNAME);
		

		WebElement email = driver.findElement(By.id("u_0_e"));
		email.click(); 
		email.sendKeys(EMAIL);
		
		WebElement password = driver.findElement(By.id("u_0_l"));
		password.click(); 
		password.sendKeys(PASSWORD);
		
		Thread.sleep(19);
		WebElement conEmail = driver.findElement(By.id("u_0_h"));
		conEmail.click(); 
		conEmail.sendKeys(EMAIL);
		


		//WebElement month = driver.findElement(By.xpath(".//select[@id = 'month']"));
		//WebElement year = driver.findElement(By.xpath(".//select[@id = 'year']"));

		driver.findElement(By.cssSelector("select[@id = 'month']"));
		
		// month.click();  
		// year.click(); 
		
		
		//select.getFirstSelectedOption();
		
		
		
		
		//driver.findElement(By.id("u_0_2")).click();

		Thread.sleep(5000);

		driver.close();

	}

	





}
