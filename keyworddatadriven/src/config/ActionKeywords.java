package config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionKeywords {
public static WebDriver driver;
	
	public static void openBrowser()
	{ 
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares Required For Testing Batch\\Testing Softwares\\selenium jar\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();

	}

	public static void navigate()
	 { 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				//driver=new ChromeDriver();

		driver.get("http://localhost:8585/");
		driver.manage().window().maximize();
	 }
	 
	 public static void Input_Username()
	 {
		 driver.findElement(By.id("cyclosUsername")).sendKeys("hemanth");
	 }
	 public static void Input_Password()
	 {
		 	driver.findElement(By.xpath("//*[@class='virtualKeyboardButton virtualKeyboardContrastNormal' and @value='0']")).click();
			driver.findElement(By.xpath("//*[@class='virtualKeyboardButton virtualKeyboardContrastNormal' and @value='0']")).click();
			driver.findElement(By.xpath("//*[@class='virtualKeyboardButton virtualKeyboardContrastNormal' and @value='0']")).click();
			driver.findElement(By.xpath("//*[@class='virtualKeyboardButton virtualKeyboardContrastNormal' and @value='0']")).click();
	 }
	 public static void click_login()
	 {
		 driver.findElement(By.xpath("//div[@id='virtualKeyboard']//div//input[@class='button']")).click();
		 }
	 public static void onpersonal()
	 {
		 driver.findElement(By.xpath("//span[contains(text(),'Personal')]")).click();
		 }
	 public static void onmessage()
	 {
		 driver.findElement(By.xpath("//span[contains(text(),'Messages')]")).click();
		 }
	 public static void ontext()
	 {
		 driver.findElement(By.xpath("//tr[@class='readMessage ClassColor1']//td//table//tbody//tr//a[@class='linkList messageDetails'][contains(text(),'Transaction feedback')]")).click();
		 }

	
	 

}
