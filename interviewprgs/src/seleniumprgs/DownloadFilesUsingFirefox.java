package seleniumprgs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DownloadFilesUsingFirefox {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver",
				"S:\\New folder\\projectworkplace\\interviewprgs\\driver\\geckodriver.exe");

		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "text/plain,application/pdf");

		profile.setPreference("browser.download.manager.showWhenStarting", false);
		
		profile.setPreference("pdfjs.disabled", true);

		
		FirefoxOptions option = new FirefoxOptions();
		option.setProfile(profile);

		WebDriver driver = new FirefoxDriver(option);

		driver.get("http://demo.automationtesting.in/FileDownload.html");

		// txt file

		driver.findElement(By.xpath("//textarea[@id='textbox']")).sendKeys(" This is a  text file");
		driver.findElement(By.xpath("//button[@id='createTxt']")).click();
		driver.findElement(By.xpath("//a[@id='link-to-download']")).click();

		// pdf file
		
		  driver.findElement(By.xpath("//textarea[@id='pdfbox']")). sendKeys("This is a pdf file");
		 driver.findElement(By.xpath("//button[@id='createPdf']")).click();
		  driver.findElement(By.xpath("//a[@id='pdf-link-to-download']")).click();
		  
		  Thread.sleep(3000);
		 
	driver.quit();

	}
}
