package org.gitprojects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gitprojectsday2 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
	WebElement txtuser = driver.findElement(By.id("email"));
	txtuser.sendKeys("Gokul");
	WebElement txtpass = driver.findElement(By.name("pass"));
	txtpass.sendKeys("mech2001");
	WebElement login = driver.findElement(By.name("login"));
	login.click();
	}

}
