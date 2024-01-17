package org.browseclaunched;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Brosecc {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
//	WebElement fe = driver.findElement(By.id("captchacharacters"));
//	fe.sendKeys("hjsfief");
//	
//	WebElement fe1 = driver.findElement(By.id("twotabsearchtextbox"));
//	fe1.sendKeys("Iphone14pro");
	
//	WebElement fe = driver.findElement(By.xpath("(//input[@autocomplete='off'])[2])"));
//	fe.sendKeys("9047040874");
	
	WebElement fe = driver.findElement(By.id("email"));
	fe.sendKeys("Gokulakannan@1306.com");
	
//	WebElement fp = driver.findElement(By.id("pass"));
//	fp.sendKeys("Mech2001");
	
	WebElement ffe = driver.findElement(By.xpath("//input[@type='password']"));
	ffe.sendKeys("esjbhbe");
}
}
