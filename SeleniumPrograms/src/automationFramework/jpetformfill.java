package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class jpetformfill {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:\\Selenium\\Selenium Essentials\\chromedriver_win32 (2)//chromedriver.exe ");
		WebDriver driver = new ChromeDriver();
		driver.get("https://petstore.octoperf.com/actions/Account.action?newAccountForm=");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys("vetri223");
		driver.findElement(By.name("password")).sendKeys("vv@123");
		driver.findElement(By.name("repeatedPassword")).sendKeys("vv@123");
		driver.findElement(By.name("account.firstName")).sendKeys("Vetri");
		driver.findElement(By.name("account.lastName")).sendKeys("vel");
		driver.findElement(By.name("account.email")).sendKeys("VeV@gmail.com");
		driver.findElement(By.name("account.phone")).sendKeys("5555544444");
		driver.findElement(By.name("account.address1")).sendKeys("333,Regendstreet");
		driver.findElement(By.name("account.address2")).sendKeys("111,Regendstreet");
		driver.findElement(By.name("account.city")).sendKeys("Michigan");
		driver.findElement(By.name("account.state")).sendKeys("colorado");
		driver.findElement(By.name("account.zip")).sendKeys("20002");
		driver.findElement(By.name("account.country")).sendKeys("Michigan");
		Select language = new Select(driver.findElement(By.name("account.languagePreference")));
		language.selectByVisibleText("japanese");
		Select category = new Select(driver.findElement(By.name("account.favouriteCategoryId")));
		category.selectByVisibleText("BIRDS");
		WebElement mylist = driver.findElement(By.name("account.listOption"));
		mylist.click();
		WebElement myBanner = driver.findElement(By.name("account.bannerOption"));
		myBanner.click();
		driver.findElement(By.name("newAccount")).click();
		
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		String PageURL = driver.getCurrentUrl();
		System.out.println(PageURL);
		
		String Tagname = driver.findElement(By.name("newAccount")).getTagName();
		System.out.println(Tagname);
		
		
		
	}

}
