package seleniumprgs;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowshandles {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","S:\\New folder\\projectworkplace\\interviewprgs\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.popuptest.com/goodpopups.html");
	
	
	driver.findElement(By.linkText("Good PopUp #3")).click();
	
	Set<String> handler = driver.getWindowHandles();
	Iterator<String> it= handler.iterator();
	
	String parent = it.next();
	System.out.println("Parent window id :"+ parent);
	
	String child = it.next();
	System.out.println("child window id" + child);
	
	driver.switchTo().window(child);
	System.out.println("child window title"+ driver.getTitle());
	Thread.sleep(3000);
	driver.close();

	
	driver.switchTo().window(parent);
	System.out.println("parent window title is"+ driver.getTitle());
	driver.close();
	
	
}
}