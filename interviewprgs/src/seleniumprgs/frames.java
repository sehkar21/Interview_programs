package seleniumprgs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frames {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","S:\\New folder\\projectworkplace\\interviewprgs\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.crmpro.com/index.cfm?CFID=122321&CFTOKEN=82922474&jsessionid=8e30edb9353c39b8f4714070185972459724");
		driver.findElement(By.name("username")).sendKeys("sehkar");
		driver.findElement(By.name("password")).sendKeys("csksehkar1");
		
//		 WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
//		 JavascriptExecutor js = (JavascriptExecutor)driver;
//		 js.executeScript("arguments[0].click();", loginBtn);

		
		driver.switchTo().frame("intercom-borderless-frame");
		Actions action =new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("///div[contains(@class,'intercom-chat-card-author')]"))).build().perform();
		driver.findElement(By.xpath("//div[contains(@class,'intercom-borderless-dismiss-button')]//span")).click();
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.switchTo().frame("mainpanel");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(text(),'contacts')]")).click();
		
		
		
		
		
	}		
}
