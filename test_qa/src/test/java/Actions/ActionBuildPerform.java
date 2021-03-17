package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionBuildPerform {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html");
		WebElement one = driver
				.findElement(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[7]/td/select/option[1]"));
		WebElement three = driver
				.findElement(By.xpath("//*[@id=\"HTMLFormElements\"]/table/tbody/tr[7]/td/select/option[3]"));
		Actions builder = new Actions(driver);
		builder.keyDown(Keys.CONTROL).click(one).click(three).keyUp(Keys.CONTROL);
//		Action compositeAction = builder.build();
//		compositeAction.perform();
//		driver.close(); 
		
	// OR 
		builder.perform();
	}
}