package crossBrowser;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
 
public class CrossBrowserScript {
 
WebDriver driver;
 
/**
* This function will execute before each Test tag in testng.xml
* @param browser
* @throws Exception
*/
@BeforeTest
@Parameters("browser")
public void setup(String browser) throws Exception{
//Check if parameter passed from TestNG is 'firefox'
if(browser.equalsIgnoreCase("firefox")){
//create firefox instance
System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver\\geckodriver.exe");
driver = new FirefoxDriver();
}
 
//Check if parameter passed as 'chrome'
else if(browser.equalsIgnoreCase("chrome")){
//set path to chromedriver.exe
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver\\chromedriver.exe");
driver = new ChromeDriver();
 
}
else if(browser.equalsIgnoreCase("Edge")){
//set path to Edge.exe
System.setProperty("webdriver.edge.driver","C:Selenium-java-edurekaMicrosoftWebDriver.exe");
}
else{
//If no browser passed throw exception
throw new Exception("Browser is not correct");
}
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
 
@Test
public void testParameterWithXML() throws InterruptedException{
	driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");
WebElement first = driver.findElement(By.name("first_name"));
first.sendKeys("First name");
Thread.sleep(4000);
WebElement last = driver.findElement(By.name("last_name"));
//Fill user name
last.sendKeys("Last name");
Thread.sleep(4000);
 
WebElement btn = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[13]/div/button"));
//Hit search button
btn.click();
}
}
