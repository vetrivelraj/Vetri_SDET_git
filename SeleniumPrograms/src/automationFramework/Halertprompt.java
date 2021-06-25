package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Halertprompt {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","G:\\Selenium\\Selenium Essentials\\chromedriver_win32 (2)//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox ')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box ')]")).click();

		Alert Halert = driver.switchTo().alert();
		String popuptext = Halert.getText();
		System.out.println(popuptext);
		Thread.sleep(2000);
		Halert.sendKeys("Superstar  Subashkar");
		Thread.sleep(2000);
		Halert.accept();
		
		String iname = driver.findElement(By.id("demo1")).getText();
		System.out.println(iname);
		
		
		
		
	}

}
