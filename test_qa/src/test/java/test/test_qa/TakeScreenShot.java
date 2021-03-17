package test.test_qa;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShot {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html");
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		// Copy the file to a location and use try catch block to handle exception
		try {

			FileHandler.copy(screenshot, new File("C:\\Users\\vlad_\\OneDrive\\Изображения\\Screenshots\\homePageScreenshot.png"));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}