package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HAlertOKdemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","G:\\Selenium\\Selenium Essentials\\chromedriver_win32 (2)//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(text(),'Alert with OK ')]/following::button[1]")).click();
		Thread.sleep(2000);
		Alert Halert = driver.switchTo().alert();
		String popuptext = Halert.getText();
		System.out.println(popuptext);
		
		Thread.sleep(3000);
		Halert.accept();
		Thread.sleep(3000);
		driver.quit();
		
					
		

	}

}
