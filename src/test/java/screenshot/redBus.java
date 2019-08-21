package screenshot;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class redBus 
{
	@Test
	public void bookticket() throws InterruptedException
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");	
		driver.findElement(By.xpath("//div/input[@id='src']")).sendKeys("Bangalore (All Locations)",Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.id("dest")).sendKeys("Mumbai (All Locations)",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[.='Onward Date']")).click();
		driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']/descendant::tr[6]/td[6]")).click();
//		driver.findElement(By.xpath("//label[.='Return Date']")).click();
//		driver.findElement(By.xpath("//div[@id='rb-calendar_return_cal']/descendant::tr[7]/td[3]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[.='Search Buses']")).click();	
	}
}

