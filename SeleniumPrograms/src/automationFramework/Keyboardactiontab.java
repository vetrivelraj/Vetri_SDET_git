package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboardactiontab {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:\\Selenium\\Selenium Essentials\\chromedriver_win32 (2)//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.findElement(By.id("email")).sendKeys("VV@gmail.com");
		Actions Act = new Actions(driver);
		Act.sendKeys(Keys.TAB,"V123").build().perform();
		Act.sendKeys(Keys.RETURN).build().perform();

	}

}
