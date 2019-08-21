package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class mapsOfBluestone 
{
	@Test
	public void mapsImages() throws IOException, InterruptedException
	{
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver= new FirefoxDriver();	
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//a[.='Visit Our Stores']")).click();
		Thread.sleep(3000);
		List<WebElement> images=driver.findElements(By.xpath("//div[@class='map-image']"));
		int i=1;
		String name="Map";
		Thread.sleep(7000);
		for(WebElement a:images)
		{	
			Thread.sleep(5000);
			File src=a.getScreenshotAs(OutputType.FILE);
			File dest=new File("E:\\project\\workspace\\programs\\SeleniumDemo\\Photo\\"+name+i+".png");
			FileUtils.copyFile(src, dest);
			i++;
		}
	    driver.close();	
	}
}
