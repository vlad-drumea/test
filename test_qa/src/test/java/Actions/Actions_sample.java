package Actions;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Actions_sample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.edureka.co/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(1000);
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.xpath("/html/body/nav/div[1]"))).build().perform();
		driver.findElement(By.linkText("Software Testing")).click();
		Thread.sleep(1000);
		WebElement act = driver.findElement(By.className("new-search-inp"));
		builder.moveToElement(act).perform();
		Thread.sleep(1000);
		WebElement search = driver.findElement(By.className("search_result_web"));
		builder.moveToElement(search).build().perform();
		Thread.sleep(1000);
		Action seriesOfActions;
		seriesOfActions = builder.sendKeys(act, "Selenium").keyDown(search, Keys.SHIFT).keyUp(search, Keys.SHIFT)
				.build();
		seriesOfActions.perform();
		Thread.sleep(3000);
		driver.quit();
	}

}