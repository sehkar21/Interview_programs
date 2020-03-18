package seleniumprgs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFilesUsingChrome {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","S:\\New folder\\projectworkplace\\interviewprgs\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/FileDownload.html");
		
		//txt file
		
		driver.findElement(By.xpath("//textarea[@id='textbox']")).sendKeys(" This is a  text file");
		driver.findElement(By.xpath("//button[@id='createTxt']")).click();
		driver.findElement(By.xpath("//a[@id='link-to-download']")).click();
		
		//pdf file
		
		driver.findElement(By.xpath("//textarea[@id='pdfbox']")).sendKeys("This is a pdf file");
		driver.findElement(By.xpath("//button[@id='createPdf']")).click();
		driver.findElement(By.xpath("//a[@id='pdf-link-to-download']")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
	}
	
}
