package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingalertpopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","G:\\Selenium\\Selenium Essentials\\chromedriver_win32 (2)//chromedriver.exe ");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//button[contains(text(),'Click me!')])[2]")).click();
		
		Alert aler = driver.switchTo().alert();
		String PopupText = aler.getText();
		System.out.println(PopupText);
		Thread.sleep(2000);
		aler.dismiss();
		//driver.quit();

	}

}
