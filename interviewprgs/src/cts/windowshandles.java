package cts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowshandles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "S:\\New folder\\projectworkplace\\interviewprgs\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.popuptest.com/");
		
		driver.findElement(By.xpath("html/body/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[1]/font[1]/b/a")).click();
		
				Set<String> ss = driver.getWindowHandles();
				Iterator<String> it = ss.iterator();
				
				String parent =		it.next();
				System.out.println("Parent window ID : "+ parent);
		
				String child = it.next();
				System.out.println("Child window :"+ child);
				
				driver.switchTo().window(child);
				System.out.println("child window title :"+ driver.getTitle());
				driver.close();
				
				driver.switchTo().window(parent);
				System.out.println("parent window title : " + driver.getTitle());
				driver.quit();
	}
	
	
	
	
	
	
	
	///html/body/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[1]/font[1]/b/a
}
