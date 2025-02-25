package com.sam;

import java.util.HashMap;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartMobilePrice {
	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();

		driver.get("http://www.flipkart.com/");

		driver.findElement(By.name("q")).sendKeys("IPhone 16");

		driver.findElement(By.xpath("//div[@class='_1sFryS _2alaMB']//child::button")).click();

		/*
		 * String mobile = driver.findElement(By.className("KzDlHZ")).getText(); String
		 * price =
		 * driver.findElement(By.xpath("//div[@class='Nx9bqj _4b5DiR']")).getText();
		 * 
		 * Map<String, String> mprice = new HashMap<>(); mprice.put(mobile, price);
		 * 
		 * Set<Entry<String, String>> entrySet = mprice.entrySet(); for(Entry<String,
		 * String> mp :entrySet) { System.out.println(mp);
		 */

		List<WebElement> mobiles = driver.findElements(By.className("KzDlHZ"));

		List<WebElement> prices = driver.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));

		Map<String, String> mp = new HashMap<>();
		for (int i = 0; i < mobiles.size(); i++) {
			mp.put(mobiles.get(i).getText(), prices.get(i).getText());

		}

		Set<Entry<String, String>> entrySet = mp.entrySet();
		for (Entry ent : entrySet) {
			// System.out.println(ent.getKey());
			// System.out.println(ent.getValue());
			System.out.println(ent);

		}

	}

}