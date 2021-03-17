package dataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Facebook_DataParam {
// this will take data from dataprovider which we created
	@Test(dataProvider = "testdata")
	public void TestFireFox(String uname, String password) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
// Maximize browser
		driver.manage().window().maximize();
// Load application
		driver.get("http://www.facebook.com");
// clear email field
		driver.findElement(By.id("email")).clear();
// Enter usename
		driver.findElement(By.id("email")).sendKeys(uname);
// Clear password field
		driver.findElement(By.id("pass")).clear();
// Enter password
		driver.findElement(By.id("pass")).sendKeys(password);
		Thread.sleep(2000);

		driver.close();

	}

	@DataProvider(name = "testdata")
	public Object[][] TestDataFeed() {

// Create object array with 2 rows and 2 column- first parameter is row and second is //column
		Object[][] facebookdata = new Object[2][2];

// Enter data to row 0 column 0
		facebookdata[0][0] = "username1@gmail.com";
// Enter data to row 0 column 1
		facebookdata[0][1] = "Password1";
// Enter data to row 1 column 0
		facebookdata[1][0] = "username2@gmail.com";
// Enter data to row 1 column 0
		facebookdata[1][1] = "Password2";
// return arrayobject to testscript
		return facebookdata;
	}
}