package test.test_qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html");
		WebElement two = driver
				.findElement(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[7]/td/select/option[2]"));
		WebElement three = driver
				.findElement(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[7]/td/select/option[3]"));
		WebElement four = driver
				.findElement(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[7]/td/select/option[4]"));
		Actions builder = new Actions(driver);
		builder.click(four);
		builder.build().perform();
		builder.click(two);
		builder.build().perform();
		builder.click(three);
		builder.build().perform();

		// OR

		builder.click(four).click(two).click(three);
		// builder.clickAndHold(four);
		builder.perform();
	}
}