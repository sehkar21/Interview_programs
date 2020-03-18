package seleniumprgs;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {
 
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","S:\\New folder\\projectworkplace\\interviewprgs\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
			
		String ele = driver.findElement(By.xpath("//tr//th//following-sibling::td[contains(text(),'2008')]")).getText();
		System.out.println(ele);
		
//		List<WebElement> trows = driver.findElements(By.tagName("tr"));
//		
//		for(int i=0;i<trows.size();i++) {
//			List<WebElement> tdata = driver.findElements(By.tagName("td"));
//			
//			
//			for(int j=0;j<tdata.size();j++) {
//				System.out.println(tdata.get(j).getText()); 
//		}
//	
//		
//		}
				
				
		/*
		 * List<WebElement> trows = driver.findElements(By.tagName("tr")); for(int
		 * i=0;i<trows.size();i++) { List<WebElement> tdata
		 * =driver.findElements(By.tagName("td"));
		 * 
		 * for(int j=0;j<tdata.size();j++) { System.out.println(tdata.get(j).getText());
		 * 
		 * }
		 * 
		 * }
		 */	
			
	driver.quit();
	}
}

