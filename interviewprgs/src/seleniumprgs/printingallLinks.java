package seleniumprgs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class printingallLinks {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","S:\\New folder\\projectworkplace\\interviewprgs\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for(int i=0;i<links.size();i++) {
			
		String linktext =	links.get(i).getText();
			System.out.println(linktext);
					
		}
		driver.quit();
		
	}
	
}
