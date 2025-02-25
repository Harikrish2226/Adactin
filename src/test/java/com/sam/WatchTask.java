package com.sam;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WatchTask {
	static WebDriver driver = null;
	static Actions action = null;

	public static void main(String[] args) throws InterruptedException {
		String brand = "Titan";
		String page = "10";
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		try {
			WebElement fashion = driver.findElement(By.xpath("(//div[@class='_2GaeWJ'])[3]//following::span[2]"));
			if (fashion.isDisplayed())
				fashion.click();
		} catch (Exception e) {

			driver.findElement(By.name("q")).sendKeys("fashion");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
		}

		driver.findElement(By.xpath("//span[text()='Men']")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='" + brand + "']")).click();

		Thread.sleep(3000);

		WebElement tenp = driver.findElement(By.xpath("//a[text()='" + page + "']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", tenp);
		js.executeScript("arguments[0].click()", tenp);

		Thread.sleep(3000);
		WebElement elvenp = driver.findElement(By.xpath("//a[text()='11']"));
		js.executeScript("arguments[0].scrollIntoView(true)", elvenp);
		js.executeScript("arguments[0].click()", elvenp);

		Thread.sleep(3000);

		List<WebElement> watches = driver.findElements(By.xpath("//a[contains(@class,'WKTcLC')]"));

		List<WebElement> prices = driver.findElements(By.xpath("//div[@class='Nx9bqj']"));

		Map<String, String> mp = new HashMap<>();
		for (int i = 0; i < watches.size(); i++) {
			String name =watches.get(i).getText();
			String price = prices.get(i).getText();
			mp.put(name, price);
		}

		Set<Entry<String, String>> watchandprice = mp.entrySet();
		for (Entry wp : watchandprice) {

			System.out.println(wp);
		}

	}
}
