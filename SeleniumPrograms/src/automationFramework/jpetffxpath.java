package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class jpetffxpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:\\Selenium\\Selenium Essentials\\chromedriver_win32 (2)//chromedriver.exe ");
		WebDriver driver = new ChromeDriver();
		driver.get("https://petstore.octoperf.com/actions/Account.action?newAccountForm=");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//td[contains(text(),'User')]//following::input[1]")).sendKeys("vetri45");
		driver.findElement(By.xpath("//td[contains(text(),'New password:')]//following::input[1]")).sendKeys("vi123");
		driver.findElement(By.xpath("//td[contains(text(),'Repeat password:')]//following::input[1]")).sendKeys("vi123");
		
		driver.findElement(By.xpath("//td[contains(text(),'First')]/following::input[1]")).sendKeys("Vetri");
		driver.findElement(By.xpath("//td[contains(text(),'Last')]/following::input[1]")).sendKeys("Vetri");
		driver.findElement(By.xpath("//td[contains(text(),'Email')]/following::input[1]")).sendKeys("Viv@gmail.com");
		driver.findElement(By.xpath("//td[contains(text(),'Phone')]/following::input[1]")).sendKeys("987654321");
		driver.findElement(By.xpath("//td[contains(text(),'Address 1:')]/following::input[1]")).sendKeys("1,A road");
		driver.findElement(By.xpath("//td[contains(text(),'Address 2:')]/following::input[1]")).sendKeys("2,A road");
		driver.findElement(By.xpath("//td[contains(text(),'City')]/following::input[1]")).sendKeys("LA LAkes");
		driver.findElement(By.xpath("//td[contains(text(),'State')]/following::input[1]")).sendKeys("Denver");
		driver.findElement(By.xpath("//td[contains(text(),'Zip:')]/following::input[1]")).sendKeys("Denver");
		driver.findElement(By.xpath("//td[contains(text(),'Country:')]/following::input[1]")).sendKeys("Denver");
		
		Select language = new Select(driver.findElement(By.xpath
								("//td[contains(text(),'Language Preference:')]/following::select[1]")));
		language.selectByVisibleText("english");
		Select category = new Select(driver.findElement(By.xpath("//td[contains(text(),'Favourite')]/following::select[1]")));
		category.selectByVisibleText("FISH");
		WebElement mylist = driver.findElement(By.xpath("//td[contains(text(),'Enable MyList')]/following::input[1]"));
		mylist.click();
		WebElement myBanner = driver.findElement(By.xpath("//td[contains(text(),'Enable MyBanner')]/following::input[1]"));
		myBanner.click();
		driver.findElement(By.xpath("//td[contains(text(),'Enable MyBanner')]/following::input[2]")).click();
		
				
	}

}
