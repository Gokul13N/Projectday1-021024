package org.gitprojects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Gitprojectsday6drop {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://letcode.in/dropdowns");
		WebElement drop = driver.findElement(By.id("superheros"));
		Select s = new Select(drop);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		
		List<WebElement> options = s.getOptions();
		WebElement webElement = options.get(1);
		String text = webElement.getText();
		System.out.println(text);
		
		for(int i =0;i<options.size();i++) {
			WebElement web = options.get(i);
			String text2 = web.getText();
			System.out.println(text2);
		}
		for(WebElement X:options) {
			System.out.println(X.getText());
		}
		
		List<WebElement> all = s.getAllSelectedOptions();
		
		for(int i =0;i<all.size();i++) {
			WebElement ww = all.get(i);
			
			String text4 = ww.getText();
			System.out.println(text4);
		}
		WebElement fs = s.getFirstSelectedOption();
		String text2= fs.getText();
		System.out.println(text2);
	}
}
