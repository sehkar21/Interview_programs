package cts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicWEbtable {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","S:\\New folder\\projectworkplace\\interviewprgs\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("//div[contains(@class, 'cp-overlay-close cp-image-close cp-inside-close cp-adjacent-right')]/img[contains(@class, 'lazyloading')]/@src")).click();
		
		
		
		/*
		 * driver.findElement(By.name("username")).sendKeys("sehkar");
		 * driver.findElement(By.name("password")).sendKeys("csksehkar1");
		 * Thread.sleep(2000); driver.manage().window().maximize();
		 * 
		 * driver.findElement(By.xpath("//input[@type='submit']")).click();
		 * driver.switchTo().frame("mainpanel"); Thread.sleep(1000);
		 * 
		 */
		
		//driver.findElement(By.xpath("//td[contains(text(),'Contacts')]")).click();
		
		
		String name =driver.findElement(By.xpath("//td[contains(text(),'China')]")).getText();
		System.out.println(name);
		
		
		
	}
	
	
	
	
	
}
