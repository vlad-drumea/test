package test.test_qa;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserCapabilities {

	public static void main(String[] args) {
		Map capabilitiesMap = new HashMap();
		capabilitiesMap.put("takeScreenShot", true);
		DesiredCapabilities capabilities = new DesiredCapabilities(capabilitiesMap);
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver\\chromedriver.exe");
		@SuppressWarnings("deprecation")
		WebDriver driver = new ChromeDriver(capabilities);
		driver.get("http://www.google.com");
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		// Copy the file to a location and use try catch block to handle exception
		try {

			FileHandler.copy(screenshot, new File("C:\\Users\\vlad_\\OneDrive\\Изображения\\Screenshots\\homePageScreenshot.png"));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}