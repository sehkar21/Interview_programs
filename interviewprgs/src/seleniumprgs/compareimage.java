package seleniumprgs;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class compareimage {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "S:\\New folder\\projectworkplace\\interviewprgs\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
	WebElement Logoimage =	driver.findElement(By.xpath("//div[@id='divLogo']//img"));
	Screenshot logoimagescreenshot = new AShot().takeScreenshot(driver, Logoimage);

	ImageIO.write(logoimagescreenshot.getImage(), "png", new File("S://Image comparison/logo/orangelogo.png"));
	
	File f = new File("S://Image comparison/logo/orangelogo.png");
	if(f.exists())
	{
		System.out.println("image is available");
	}
	else
	{
		System.out.println("image not available");
	}
	
	driver.quit();
	
	
	
	
		
	}
	
}
