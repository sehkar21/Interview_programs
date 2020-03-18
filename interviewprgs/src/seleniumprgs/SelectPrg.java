package seleniumprgs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectPrg {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "S:\\New folder\\projectworkplace\\interviewprgs\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.ironspider.ca/forms/dropdowns.htm");
		WebElement w = driver.findElement(By.name("coffee"));
		Select s = new Select(w);
		s.selectByIndex(3);
		System.out.println(w.getText());
		System.out.println(s.getFirstSelectedOption());
		
	}
	
}
