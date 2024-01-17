package org.locators;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locators {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Navigation nv = driver.navigate();
	driver.navigate().to("https://www.facebook.com/");
//driver.navigate().to("https://www.flipkart.com/");
//Thread.sleep(3000);
//driver.navigate().back();
//Thread.sleep(3000);
//driver.navigate().forward();
//Thread.sleep(3000);
//driver.navigate().refresh();

WebElement txtuser = driver.findElement(By.id("email"));
boolean displayed = txtuser.isDisplayed();
System.out.println(displayed);

WebElement cnac = driver.findElement(By.xpath("//a[contains(text(),'Create new')]"));
boolean enabled = cnac.isEnabled();
System.out.println(enabled);
cnac.click();
boolean enabled2 = cnac.isEnabled();
System.out.println(enabled2);

WebElement rbtn = driver.findElement(By.xpath("//input[@value='2']"));
boolean selected = rbtn.isSelected();
System.out.println(selected);
rbtn.click();
boolean selected2 = rbtn.isSelected();
System.out.println(selected2);
			}
}
