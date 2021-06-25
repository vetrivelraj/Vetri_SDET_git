package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Halertconfirm {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","G:\\Selenium\\Selenium Essentials\\chromedriver_win32 (2)//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel ')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box ')]")).click();
		
		Alert Halert = driver.switchTo().alert();
		String popuptext = Halert.getText();
		System.out.println(popuptext);
		
		Thread.sleep(2000);
		Halert.accept();
		Thread.sleep(2000);
		
		String abcd = driver.getTitle();
		System.out.println(abcd);
		
		String eee = driver.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box ')]")).getCssValue("font-size");
		System.out.println(eee);
		
	}

}
