package test.test_qa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/jquery-dropdown-search-demo.html");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		WebElement email = driver.findElement(By.name("email"));
		sendKeys(driver, email, 10, "test@test.com");
		WebElement forgotAcct = driver.findElement(By.linkText("Забыли пароль?"));
		sendKeys(driver, email, 10, "test@test.com");
		clickOn(driver, forgotAcct, 10);
		driver.close();
	}

	public static void sendKeys(WebDriver driver1, WebElement element, int timeout, String value) {
		new WebDriverWait(driver1, timeout).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}

	public static void clickOn(WebDriver driver1, WebElement element, int timeout) {
		new WebDriverWait(driver1, timeout).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

}