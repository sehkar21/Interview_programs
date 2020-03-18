package seleniumprgs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectby {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "S:\\New folder\\projectworkplace\\interviewprgs\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://automate-apps.com/select-multiple-options-from-a-drop-down-list/");
	WebElement selectList = driver.findElement(By.xpath("//select[@name='cars']"));
    Select select = new Select(selectList);
    select.selectByVisibleText("Maruti");
    select.selectByVisibleText("Honda");
    select.selectByIndex(3);
    
    Thread.sleep(5000);
    select.deselectByIndex(3);
    
} 
}