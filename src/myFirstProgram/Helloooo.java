package myFirstProgram;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Helloooo {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		/*driver.get("https://www.instagram.com/");
		Thread.sleep(4000);
		System.out.println("current page title is:"+driver.getTitle());
		Thread.sleep(4000);
		System.out.println("current page url is:"+driver.getCurrentUrl());
		Thread.sleep(4000);
		driver.navigate().to("https://www.qualiquesttechnologies.com/");
		Thread.sleep(4000);
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(4000);
		
        System.out.println(driver.getWindowHandles());
        Thread.sleep(4000);
		
		System.out.println(driver.getWindowHandle());
		Thread.sleep(4000);
		
		//System.out.println(driver.getPageSource());
		//   Thread.sleep(4000);
		
		driver.manage().window().maximize();
		Thread.sleep(4000);
		//driver.manage().window().minimize();
		driver.manage().window().fullscreen();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().forward();
		driver.findElement(By.className("_1TOQfO")).click();
		Thread.sleep(10000);
		*/
		driver.get("https://www.flipkart.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("")).click();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()=\"Mobiles\"]")).click();
		driver.quit();
	
		
	}

}
