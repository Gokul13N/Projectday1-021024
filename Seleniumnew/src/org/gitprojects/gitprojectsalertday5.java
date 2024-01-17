package org.gitprojects;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gitprojectsalertday5 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://demo.automationtesting.in/Alerts.html");

			WebElement alert = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
			alert.click();

			Alert a = driver.switchTo().alert();

			String text = a.getText();
			System.out.println(text);
			Thread.sleep(3000);
			a.accept();

			WebElement confm = driver.findElement(By.xpath("//a[@href='#CancelTab']"));
			confm.click();
			
			WebElement confirm = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
			confirm.click();
			Alert a1= driver.switchTo().alert();
			String text2 = a.getText();
			System.out.println(text2);
			a.accept();
			
		WebElement prompt = driver.findElement(By.xpath("//a[@href='#Textbox']"));
		prompt.click();

		WebElement prom = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		prom.click();
		Alert a2 = driver.switchTo().alert();
		String text1 = a.getText();
		System.out.println(text1);
		a.sendKeys("Gokul");
		a.accept();


	}
}
