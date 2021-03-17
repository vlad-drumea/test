package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/drag-and-drop-demo.html");
	WebElement dragMe = driver.findElement(By.xpath("//*[@id=\"todrag\"]/span[1]"));
	WebElement trg = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[3]/h3"));
Actions builder = new Actions(driver);
		System.out.println(dragMe.getLocation());
		System.out.println(trg.getLocation());
//builder.dragAndDropBy(dragMe, 500, 500).build().perform();
		builder.dragAndDrop(dragMe,trg).build().perform();
//	driver.close();
	}
}