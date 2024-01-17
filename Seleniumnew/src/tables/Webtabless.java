package tables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtabless {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/table");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//System.out.println("-----print all datas");
//		WebElement table = driver.findElement(By.id("customers"));
//		String text = table.getText();
//		System.out.println(text);
//
//System.out.println("----------get particular row------");
//		List<WebElement> rows = table.findElements(By.tagName("tr"));
//		WebElement line = rows.get(1);
//		String text2 = line.getText();
//		System.out.println(text2);
//
//System.out.println("-----print all rows----------");
//		for(int i =0;i<rows.size();i++) {
//			WebElement allrows = rows.get(i);
//			String text3 = allrows.getText();
//			System.out.println(text3);
//		}
//
//System.out.println("----------print headings table>> tr>>th-----");
//		for(int i =0;i<rows.size();i++) {
//			WebElement allrows = rows.get(i);
//			List<WebElement> headings = allrows.findElements(By.tagName("th"));
//			for(int j=0;j<headings.size();j++) {
//				WebElement head = headings.get(j);
//				String text4 = head.getText();
//				System.out.println(text4);
//			}
//		}
//System.out.println("-----print table>>th----");
//		List<WebElement> headings1 = table.findElements(By.tagName("th"));
//		for(int j=0;j<headings1.size();j++) {
//			WebElement headings = headings1.get(j);
//			String text5 = headings.getText();
//			System.out.println(text5);
//		}
//System.out.println("----print datas from table>>tr>>td----");
//		for(int i =0;i<rows.size();i++) {
//			WebElement allrows = rows.get(i);
//			List<WebElement> datas = allrows.findElements(By.tagName("td"));
//			for(int j=0;j<datas.size();j++) {
//				WebElement data1 = datas.get(j);
//				String text6 = data1.getText();
//				System.out.println(text6);
//			}
//		}
//		System.out.println("----print particular data from table >>tr>>td---");
//		for(int i =0;i<rows.size();i++) {
//			WebElement allrows = rows.get(i);
//		List<WebElement> datas = allrows.findElements(By.tagName("td"));
//		for(int j=0;j<datas.size();j++) {
//			WebElement data1 = datas.get(j);
//			String text7 = data1.getText();
//			if(text7.equals("Austria")) {
//			System.out.println(text7);
//			System.out.println(allrows.getText());
//			}
//		}
//		}
//		System.out.println("---print lastrow-----");
//		WebElement lastrow = rows.get(rows.size()-1);
//		String text8 = lastrow.getText();
//		System.out.println(text8);
//		
//		List<WebElement> td = lastrow.findElements(By.tagName("td"));
//		for(WebElement gok:td) {
//			System.out.println(gok.getText());
//		}
//	}
		WebElement rows=driver.findElement(By.id("simpletable"));
		String text = rows.getText();
		System.out.println(text);
		
		List<WebElement> table = rows.findElements(By.tagName("tr"));
		WebElement rowss = table.get(0);
		String text2 = rowss.getText();
		System.out.println(text2);
		
		for(int i =0;i<table.size();i++) {
			WebElement allrow = table.get(i);
			String text3 = allrow.getText();
			System.out.println(text3);
		}
		for(int i =0;i<table.size();i++) {
			WebElement allrow = table.get(i);
		List<WebElement> head = allrow.findElements(By.tagName("th"));
for(int j =0;j<head.size();j++) {
	WebElement allhead = head.get(j);
	String text4 = allhead.getText();
	System.out.println(text4);
}
		}
		
		List<WebElement> heading = rows.findElements(By.tagName("th"));
		for(int j =0;j<heading.size();j++) {
			WebElement head1 = heading.get(j);
			String text4 = head1.getText();
			System.out.println(text4);
		}
		for(int i =0;i<table.size();i++) {
			WebElement allrow = table.get(i);
			List<WebElement> datas = allrow.findElements(By.tagName("td"));
for(int j=0;j<datas.size();j++) {
	WebElement alldata = datas.get(j);
	String text5 = alldata.getText();
	System.out.println(text5);
}
		}
	}
}