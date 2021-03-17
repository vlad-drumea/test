package dataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
 
public class DDTExcel
{
 ChromeDriver driver;
  
 @Test(dataProvider="testdata")
 public void DemoProject(String username, String password) throws InterruptedException
 {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
  
 driver.get("https://www.facebook.com");
  
 driver.findElement(By.id("email")).sendKeys(username);
 driver.findElement(By.id("pass")).sendKeys(password);
 driver.findElement(By.className("login")).click();
  
 Thread.sleep(5000);
  
 Assert.assertTrue(driver.getTitle().matches("Facebook — Выполните вход или зарегистрируйтесь"), "Invalid credentials");
 System.out.println("Login successful");
 }
 //it has some issues with closing browser window 
 @AfterTest
 void ProgramTermination()
 {
driver.quit();
 }


@DataProvider(name="testdata")
 public Object[][] TestDataFeed()
 {
  
 ReadExcelFile config = new ReadExcelFile("C:\\Users\\vlad_\\OneDrive\\Документы\\Spreadsheet.xlsx");
  
 int rows = config.getRowCount(0);
  
 Object[][] credentials = new Object[rows][2];
 
for(int i=0;i<rows;i++)
 {
 credentials[i][0] = config.getData(0, i, 0);
 credentials[i][1] = config.getData(0, i, 1);
 }
  
 return credentials;
 }
}
