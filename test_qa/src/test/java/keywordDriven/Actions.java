package keywordDriven;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
 
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
 
public class Actions 
{
 public static WebDriver driver;
  
 public static void openBrowser()
 { 
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver\\chromedriver.exe");
 driver=new ChromeDriver();
 }
  
 public static void navigate()
 { 
 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 driver.get("https://facebook.com");
 }
  
 public static void input_Username()
 {
	 driver.findElement(By.id("email")).sendKeys("facebook"); 
 }
  
 public static void input_Password()
 {
	 driver.findElement(By.id("pass")).sendKeys("facebook");
 }
  
 public static void click_Login()
 {
	 driver.findElement(By.name("login")).click();
 }
 
@Test
 public static void verify_login()
 {
 //String pageTitle = driver.getTitle();
 Assert.assertTrue(driver.getTitle().matches("Facebook — Выполните вход или зарегистрируйтесь"), "Invalid credentials");

 //Assert.assertEquals(pageTitle, "Facebook — Выполните вход или зарегистрируйтесь");
 }
 
 public static void closeBrowser()
 {
 driver.quit();
 }
}