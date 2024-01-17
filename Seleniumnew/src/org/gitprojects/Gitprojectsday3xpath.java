package org.gitprojects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gitprojectsday3xpath {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		WebElement ctrnew = driver.findElement(By.xpath("//a[contains(text(),'Create new account')]"));
		ctrnew.click();
		WebElement fname = driver.findElement(By.xpath("//input[@name='firstname']"));
		fname.sendKeys("Gokul");
		WebElement lname = driver.findElement(By.xpath("//input[@name='lastname']"));
		lname.sendKeys("kannan");
		WebElement phno = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		phno.sendKeys("9047040874");
		WebElement pass = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		pass.sendKeys("mech2001");
		String attribute = fname.getAttribute("value");
		System.out.println(attribute);
		String attribute2 = lname.getAttribute("value");
		System.out.println(attribute2);
		String attribute3 = phno.getAttribute("value");
		System.out.println(attribute3);
		String attribute4 = pass.getAttribute("value");
		System.out.println(attribute4);
		WebElement txtinner = driver.findElement(By.xpath("//div[contains(text(),'Sign Up')]"));
		String text = txtinner.getText();
		System.out.println(text);
	}
}
