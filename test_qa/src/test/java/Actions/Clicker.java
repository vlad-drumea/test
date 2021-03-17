package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Clicker {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html");
		WebElement two = driver
				.findElement(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[7]/td/select/option[2]"));
System.out.println("X coordinate:" +two.getLocation().getX()+" Y coordinate:" + two.getLocation().getY());
Actions builder = new Actions (driver);
builder.moveToElement(two).click();
builder.perform();
//builder.release().perform();
	}
}