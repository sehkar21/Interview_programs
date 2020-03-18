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
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class CompareimageCont {

		public static void main(String[] args) throws IOException {
			System.setProperty("webdriver.chrome.driver", "S:\\New folder\\projectworkplace\\interviewprgs\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

			BufferedImage expected = ImageIO.read(new File("S://Image comparison/logo/orangelogo.png"));
			
			WebElement Logoimage =	driver.findElement(By.xpath("//div[@id='divLogo']//img"));
			Screenshot logoimagescreenshot = new AShot().takeScreenshot(driver, Logoimage);
			
			BufferedImage actual = logoimagescreenshot.getImage();

			ImageDiffer imgDiff = new ImageDiffer();
			ImageDiff diff = imgDiff.makeDiff(expected, actual);
			
			if(diff.hasDiff()==true) {
				System.out.println("images are not same");
			}
			else
			{
				System.out.println("images are same");
			}
			
	}
	
}
