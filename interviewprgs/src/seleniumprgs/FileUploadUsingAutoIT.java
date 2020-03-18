package seleniumprgs;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadUsingAutoIT {

	public static void main(String[] args) throws IOException, InterruptedException {
	
		
		System.setProperty("webdriver.gecko.driver",
				"S:\\New folder\\projectworkplace\\interviewprgs\\driver\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
	int size = driver.findElements(By.tagName("iframe")).size();
	    // prints the total number of frames inside outer frame           
	    System.out.println("Total Frames --" + size);
		
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@class='file_upload']")).click();
		
		Runtime.getRuntime().exec("C://Users//sehkar//Documents//AutoItexample.exe"+"  " +"C://Users//sehkar//Documents//photo-tiger.jpg");
		
		
		
		
		
	}
		
}
