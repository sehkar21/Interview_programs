package seleniumprgs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectsort {

	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver","S:\\New folder\\projectworkplace\\interviewprgs\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	
	WebElement  element=driver.findElement(By.xpath("//select[@id='animals']"));
	System.out.println(element);
	
	Select se = new Select(element);
	
	List original = new ArrayList();
	List temp = new ArrayList();
	
							List<WebElement>	options=	se.getOptions();
							
						for(WebElement e : options) {
							
							original.add(e.getText());
							temp.add(e.getText());
								
							}
							System.out.println("original options before sorting:"+original);
							System.out.println("Temporary value before sorting:"+temp);
							
								Collections.sort(temp);
								System.out.println("original options After sorting:"+original);
								System.out.println("Temporary value After sorting:"+temp);
	
								
								if(original==temp)
								{
									
								System.out.println("dropdown sorted");	
								}
								else
								{
									System.out.println("dropdown not sorted");
								}
	driver.quit();
	
}
}