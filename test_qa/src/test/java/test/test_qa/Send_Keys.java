package test.test_qa;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 
public class Send_Keys {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver\\chromedriver.exe");  
		WebDriver driver = new ChromeDriver();
		driver.get("http:google.com");
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys(Keys.chord(Keys.SHIFT, "test qa1"));
		searchBox.clear();
		searchBox.sendKeys(Keys.chord(Keys.SHIFT, "test qa"));
		//searchBox.sendKeys(Keys.ENTER); 
		searchBox.submit();
		driver.close();
	}
}