package seleniumprgs;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cookiessession {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "S:\\New folder\\projectworkplace\\interviewprgs\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	Set<Cookie> cookie = driver.manage().getCookies();
System.out.println("size of cookies :"+ cookie.size());
		
		/*
		 * for(Cookie c: cookie) { System.out.println(c.getName()+ " :"+ c.getValue());
		 * }
		 */
	System.out.println(driver.manage().getCookieNamed("wd"));
	
			Cookie newcookie = new Cookie("mycookie","1223214");
			driver.manage().addCookie(newcookie);
	
			cookie= driver.manage().getCookies();
			System.out.println("size of cookies :"+ cookie.size());
			
			for(Cookie c: cookie) {
				System.out.println(c.getName()+ " :"+ c.getValue());
			}
			driver.manage().deleteCookieNamed("mycookie");
			
			cookie= driver.manage().getCookies();
			System.out.println("size of cookies :"+ cookie.size());
			
			for(Cookie c: cookie) {
				System.out.println(c.getName()+ " :"+ c.getValue());
			}
	
	
				driver.manage().deleteAllCookies();
				
				cookie= driver.manage().getCookies();
				System.out.println("size of cookies :"+ cookie.size());
				
				for(Cookie c: cookie) {
					System.out.println(c.getName()+ " :"+ c.getValue());
				}
		
	
	
		








	
	
}
}
