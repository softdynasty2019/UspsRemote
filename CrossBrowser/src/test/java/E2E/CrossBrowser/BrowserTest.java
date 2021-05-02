package E2E.CrossBrowser;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;



public class BrowserTest {

	@Test

	public void setup() throws MalformedURLException {
		String URL = "https://setubabu25:ca19145a-3f90-49de-aa19-a3f9397af499@ondemand.us-west-1.saucelabs.com:443/wd/hub";

		DesiredCapabilities cap = new DesiredCapabilities().chrome();

		cap.setCapability("platform", "Windows 10");
		cap.setCapability("version", "latest");

		WebDriver driver = new RemoteWebDriver(new URL(URL), cap);

		driver.get("https://www.usps.com/");
		driver.manage().window().maximize();
		System.out.println("USPS Login Successfully");
		System.out.println(driver.getTitle());
		System.out.println(" Login Successfully");

		
		
	}

}
