package findElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 
public class Get_Methods {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver\\chromedriver.exe");  
		WebDriver driver = new ChromeDriver();
		driver.get("http:google.com");
		WebElement searchButton = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div[1]/a[1]"));
		System.out.println("getLocation:"+searchButton.getLocation());
		System.out.println("getSize:"+searchButton.getSize());
		System.out.println("getTagName:"+searchButton.getTagName());
		System.out.println("getText:"+searchButton.getText());
		driver.close();
	}
}