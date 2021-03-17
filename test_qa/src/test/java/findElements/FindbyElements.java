package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindbyElements {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:google.com");
		List<WebElement> buttons = driver.findElements(By.tagName("button"));
		System.out.println(buttons.size());
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Pack Publishing");
		searchBox.submit();
		WebElement instruction = driver.findElement(By.id("hdtb-tls"));
		instruction.click();
		driver.findElement(By.className("hide-focus-ring")).click();
		// driver.findElement(By.xpath("//*[@id=\"islrg\"]/div[1]/div[1]/a[2]")).click();
		// WebElement link = driver.findElement(By.partialLinkText("Отправить"));
		// link.click();
		driver.close();
	}

}
