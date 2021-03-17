package findElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 
public class Get_CssValue {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver\\chromedriver.exe");  
		WebDriver driver = new ChromeDriver();
		driver.get("http:google.com");
		WebElement searchButton = driver.findElement(By.name("btnK"));
		System.out.println(searchButton.getCssValue("font-family"));
		System.out.println(searchButton.getCssValue("background-color"));
		driver.close();
	}
}