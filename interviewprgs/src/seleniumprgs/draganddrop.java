package seleniumprgs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","S:\\New folder\\projectworkplace\\interviewprgs\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		
		WebElement from = driver.findElement(By.xpath("//*[@id='credit2']/a"));
		
        WebElement To=driver.findElement(By.xpath("//*[@id='bank']/li"));	
		
		
		Actions acc = new Actions(driver);
		
		acc.dragAndDrop(from, To).build().perform();
		
		WebElement from1 = driver.findElement(By.xpath("//*[@id='fourth']"));
		WebElement To1 = driver.findElement(By.xpath("//*[@class='placeholder']"));
			
		Actions acc1 = new Actions(driver);
		
		
		acc1.dragAndDrop(from1, To1).build().perform();
		
		
		
		
		//driver.quit();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
