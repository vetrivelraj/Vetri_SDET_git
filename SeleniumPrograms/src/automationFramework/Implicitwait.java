package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Implicitwait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:\\Selenium\\Selenium Essentials\\chromedriver_win32 (2)//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("Sachin Tendulkar");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
		
		driver.manage().timeouts().implicitlyWait(750,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//h3[contains(text(),'Sachin Tendulkar - Wikipedia')]")).click();
		driver.quit();

	}

}
