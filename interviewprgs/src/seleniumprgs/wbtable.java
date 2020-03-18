package seleniumprgs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class wbtable {

//	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver","S:\\New folder\\projectworkplace\\interviewprgs\\driver\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.toolsqa.com/automation-practice-table/");
//		
//		WebElement txt = driver.findElement(By.xpath("//td[contains(text(),'Sau')]"));
//		System.out.println(txt.getText());
//	}
	
	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","S:\\New folder\\projectworkplace\\democucum\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		
		WebElement txt  = driver.findElement(By.xpath("//td[contains(text(),'Sau')]"));
		System.out.println(txt.getText());
		
		
		
		
	}

	
	
	
	
	
}