package seleniumprgs;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

public class Barcodereading {

	public static void main(String[] args) throws IOException, NotFoundException {
		
		System.setProperty("webdriver.chrome.driver", "S:\\New folder\\projectworkplace\\interviewprgs\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		String barcodeurl = driver.findElement(By.xpath("//div[@id='HTML4']//div[@class='widget-content']//img")).getAttribute("src");
		URL url = new URL(barcodeurl);
		
		BufferedImage bufferimage = ImageIO.read(url);
		
		LuminanceSource luminance = new BufferedImageLuminanceSource(bufferimage);
		BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(luminance));
		
		Result result = new MultiFormatReader().decode(bitmap);
		
		System.out.println(result.getText());
		
		
	}
}
