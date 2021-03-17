package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class WebDriverListenerMain {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
JavascriptExecutor js = (JavascriptExecutor)driver;
EventFiringWebDriver eventHandler = new EventFiringWebDriver(driver);
EventCapture eCapture = new EventCapture();
//Registering with EventFiringWebDriver
//Register method allows to register our implementation of WebDriverEventListner to listen to the WebDriver events
eventHandler.register(eCapture);
//navigating to the webpage "www.edureka.co"
eventHandler.navigate().to("https://www.edureka.co/blog/");
js.executeScript("window.scrollBy(0,400)");
Thread.sleep(3000);
eventHandler.findElement(By.linkText("Software Testing")).click();
//navigating to the webpage "www.edureka.co/all-courses/"
eventHandler.navigate().to("https://www.edureka.co/all-courses");
//navigating back to the first page
eventHandler.navigate().back();
eventHandler.quit();
//Unregister allows to detach
eventHandler.unregister(eCapture);
System.out.println("End of Listners Class");
}
}