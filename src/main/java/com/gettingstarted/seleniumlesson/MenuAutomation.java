package com.gettingstarted.seleniumlesson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MenuAutomation {

	@Test
	public void menu() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PSAdmin\\Desktop\\important libraries\\Working_with_selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.spicejet.com/");

		driver.manage().window().maximize();
		
		WebElement leavingFrom = driver
				.findElement(By.cssSelector("input[id='ctl00_mainContent_ddl_originStation1_CTXT']"));

		// leavingFrom.sendKeys("Dubai");

		WebElement from = driver.findElement(By.cssSelector(("select[id='ctl00_mainContent_ddl_Adult']")));
		Select adults = new Select(from);
		adults.selectByIndex(4);
		// adults.selectByVisibleText("8 adults");
		Thread.sleep(14);

		WebElement second = driver.findElement(By.cssSelector(("select[id='ctl00_mainContent_ddl_Child']")));
		Select kids = new Select(second);
		kids.selectByIndex(3);

		WebElement webInfant = driver.findElement(By.cssSelector(("select[id='ctl00_mainContent_ddl_Infant']")));
		Select infants = new Select(webInfant);
		infants.selectByIndex(3);
		
		
		WebElement webCurrency = driver.findElement(By.cssSelector(("select[id='ctl00_mainContent_DropDownListCurrency']")));
		Select currency = new Select(webCurrency);
		currency.selectByIndex(0);
	
	}

}
