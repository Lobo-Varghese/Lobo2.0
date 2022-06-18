package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A1StartSelenium {

	public static void main(String[] args) {
		//System.setProperty("webdeiver.chrome.driver", "C:\\Users\\LOBO\\.m2\\repository\\org\\seleniumhq\\selenium\\selenium-chrome-driver\\4.1.1\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().fullscreen();
		driver.findElement(By.name("q")).sendKeys("Selenium"+Keys.ENTER);
		//driver.findElement(By.name("btnK")).click();
		
		/*driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.partialLinkText("Selenium: Definition, How it works and Why you need it")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//*[text()=\"Free Trial\"]/../following-sibling::li/button")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.findElement(By.xpath("//input[@id='doc-search-box-input']")).sendKeys("Hi There");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.findElement(By.xpath("//input[@id='doc-search-box-input']")).clear();*/
		driver.navigate().back();
		String val = driver.findElement(By.name("q")).getAttribute("value");
		System.out.println(val);
		
		/*********Find thr position************/
		
		WebElement ele = driver.findElement(By.xpath("//input[@aria-label='Google Search']"));
		Point pp = ele.getLocation();
		int x = pp.x;
		int y = pp.y;
		System.out.println(x+" "+y);
		
		WebElement button = driver.findElement(By.xpath("//a[@target='_top'][contains(text(),'Sign in')]"));
		String col = button.getCssValue("color");
		System.out.println(col);
		int h = button.getSize().height;
		int w = button.getSize().width;
		System.out.println("Height : "+ h +" "+ "width :"+ w);
	}

}
