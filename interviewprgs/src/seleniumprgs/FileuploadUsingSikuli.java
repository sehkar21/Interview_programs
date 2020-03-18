package seleniumprgs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class FileuploadUsingSikuli {
		
	
	public static void main(String[] args) throws InterruptedException, FindFailed {
		
		System.setProperty("webdriver.chrome.driver", "S:\\New folder\\projectworkplace\\interviewprgs\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='imagesrc']")).click();
		
		
	//	String sikulipath ="S:\\sikuli\\pictures";
	//	String upload ="S:\\sikuli";
		
		Screen s = new Screen();
		Pattern fileinputtext = new Pattern("S:\\sikuli\\pictures\\fileinputtext.PNG");
		Pattern openbutton = new Pattern("S:\\sikuli\\pictures\\openbutton.PNG");
		
		Thread.sleep(3000);
		
		s.wait(fileinputtext,20);
		s.type(fileinputtext, "S:\\sikuli\\fresh-apple-500x500.jpg");
		s.click(openbutton);
	}
}
