package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerTest.class)

public class TestCases {
public WebDriver driver;

//Test to pass as to verify listeners.
@Test
public void Login() throws Exception
{
	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver\\chromedriver.exe");
driver = new ChromeDriver();
driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");
JavascriptExecutor js = (JavascriptExecutor) driver;
driver.manage().window().maximize();
driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[1]/div/div/input")).sendKeys("Test");
//driver.findElement(By.className("typeahead__button")).click();
js.executeScript("window.scrollBy(0,500)");
Thread.sleep(3000);
js.executeScript("window.scrollBy(0,700)");
Thread.sleep(4000);
js.executeScript("window.scrollBy(0,700)");
Thread.sleep(4000);
}

//Forcefully failed this test as verify listener.
@Test
public void TestToFail()
{
System.out.println("This method to test fail");
Assert.assertTrue(false);
}
}