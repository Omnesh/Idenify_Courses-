package Base;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	protected WebDriver driver;

	public void launchBrowser(String browser, String url) {

		if (browser.equalsIgnoreCase("chrome")) {

			// declaring and initializing
			// browser...................................................

			System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();

			// opening
			// website...............................................................
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		}
	}

}
