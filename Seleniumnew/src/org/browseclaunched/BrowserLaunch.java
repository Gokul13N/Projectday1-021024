package org.browseclaunched;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Seleniumnew\\Drivers\\chromedriver.exe");
	
		//Object
		WebDriver driver = new ChromeDriver();
	
		//get
	driver.get("https://www.instagram.com/");
	
	
	//getCurrentUrl
//	String url = driver.getCurrentUrl();
//	System.out.println(url);
//	
	//getTittle
//	String title = driver.getTitle();
//	System.out.println(title);
	
	//quit
	//driver.quit();
	
	WebElement user = driver.findElement(By.name("username"));
	user.sendKeys("gokul1306");
	
//	WebElement pass = driver.findElement(By.name("password"));
//	pass.sendKeys("Mech2001#");
	}

}
