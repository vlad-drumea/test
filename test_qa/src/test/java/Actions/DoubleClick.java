package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/jquery-dropdown-search-demo.html");
		WebElement dClick = driver
				.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div/div[2]/span/span[1]/span"));
		Actions builder = new Actions(driver);
		// builder.moveToElement(dClick).doubleClick().perform();
		builder.doubleClick(dClick).perform();
//	driver.close();
	}
}