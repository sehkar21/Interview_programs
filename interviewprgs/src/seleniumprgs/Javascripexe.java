package seleniumprgs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascripexe {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "S:\\New folder\\projectworkplace\\interviewprgs\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor j = (JavascriptExecutor) driver;
		WebElement w = driver.findElement(By.xpath("//a[@title='Learn about cookies and Facebook.']"));
		j.executeScript("arguments[0].scrollIntoView(true);",w);
		w.click();
		
		
		
		
		
	}
	
	
	
	
	
}
