package org.gitprojects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class gitprojectsday4actions {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//driver.get("http://greenstech.in/selenium-course-content.html");
	Actions a = new Actions(driver);
//	WebElement course = driver.findElement(By.xpath("//div[contains(text(),'Courses')]"));
//	a.moveToElement(course).perform();
//	WebElement test = driver.findElement(By.xpath("//span[contains(text(),'Software Testing (12)')]"));
//	a.moveToElement(test).perform();
//	WebElement mobile = driver.findElement(By.xpath("//span[contains(text(),'Mobile Testing Certification Training')]"));
//	a.click(mobile).perform();
	driver.get("http://demo.guru99.com/test/drag_drop.html");
	WebElement src = driver.findElement(By.xpath("//a[contains(text(),'BANK')]"));
	WebElement des = driver.findElement(By.xpath("//li[@class='placeholder']"));
	a.dragAndDrop(src, des).perform();
	
}
}
