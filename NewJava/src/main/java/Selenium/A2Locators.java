package Selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A2Locators {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().fullscreen();
		WebElement uname = driver.findElement(By.name("txtUsername"));
		WebElement pword = driver.findElement(By.name("txtPassword"));
		WebElement submit = driver.findElement(By.name("Submit"));
		uname.sendKeys("Admin");
		pword.sendKeys("admin123");
		submit.click();
		Thread.sleep(4000);
		List<WebElement> list = driver.findElements(By.id("mainMenuFirstLevelUnorderedList"));
		
		for(int i=0;i<=list.size();i++) {
			
			//String ele= driver.findElement(By.id("//ul[@id='mainMenuFirstLevelUnorderedList']/li["+i+"]/a").g
			System.out.println(list.get(i));
		}
	}

}
