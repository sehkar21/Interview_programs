package seleniumprgs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollusingJavescirpt {
public static void main(String[] args) {
	

	System.setProperty("webdriver.chrome.driver", "S:\\New folder\\projectworkplace\\interviewprgs\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/");

				JavascriptExecutor js = (JavascriptExecutor)driver;
				
				//scroll by pixel
				//js.executeScript("window.scrollBy(0,1000)", "");
				
				//scroll till bottom
				//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	
				//scroll by element
				
					WebElement flag = driver.findElement(By.xpath("//div[@id='HTML12']//div[@class='widget-content']//img[1]"));
				
				js.executeScript("arguments[0].scrollIntoView();",flag);
				
				
				
				
				
}
}