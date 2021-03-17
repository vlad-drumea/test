package test.test_qa;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 
public class Is_Methods {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver\\chromedriver.exe");  
		WebDriver driver = new ChromeDriver();
		driver.get("http:google.com");
		WebElement searchButton = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div[1]/a[1]"));
		System.out.println("Displayed:"+searchButton.isDisplayed());
		System.out.println("Enabled:"+searchButton.isEnabled());
		System.out.println("Selected:"+searchButton.isSelected());
		driver.close();
	}
}