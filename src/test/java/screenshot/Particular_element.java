package screenshot;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Particular_element 
{
	@Test
	public void element_screenshot() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();	
		driver.get("https://demo.actitime.com/login.do");
		File src=driver.findElement(By.id("username")).getScreenshotAs(OutputType.FILE);
		File dest=new File("E:\\project\\workspace\\programs\\SeleniumDemo\\Photo\\username.png");
		FileUtils.copyFile(src, dest);
		driver.close();	
	}
}
