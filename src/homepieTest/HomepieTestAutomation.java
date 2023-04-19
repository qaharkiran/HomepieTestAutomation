package homepieTest;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomepieTestAutomation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\harki\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		
		//login as existing user
		driver.navigate().to("https://staging.zympyl.com/");
		driver.findElement(By.xpath("/html/body/header/div/div[2]/div[3]/div[1]/a[7]")).click();
		driver.findElement(By.id("LogForm_email")).sendKeys("harkiran.net@gmail.com");
		driver.findElement(By.id("LogForm_password")).sendKeys("hptest123");
		driver.findElement(By.xpath("/html/body/main/div[2]/div/div/form[1]/button")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/header/div/div[2]/div[3]/div/div[2]/div[1]/span[1]/img")));
		driver.close();
		driver.quit();
		
	}

}
