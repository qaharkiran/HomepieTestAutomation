package homepieTestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class HomepieTestNGBeginning {

	@BeforeTest
	public void launchBrowser() {
		System.out.println("launch browser");
	}
		
	@AfterTest
	public void closeBrowser(){
		System.out.println("close browser");
		
	}
}
