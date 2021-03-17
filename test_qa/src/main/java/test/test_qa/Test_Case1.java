package test.test_qa;

    import org.openqa.selenium.By;  
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver;  
      
    public class Test_Case1 {  
      
        public static void main(String[] args) throws InterruptedException {  
            
        // declaration and instantiation of objects/variables  
            System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver\\chromedriver.exe");  
        WebDriver driver=new ChromeDriver();  
          
    // Launch website  
        driver.navigate().to("http://www.google.com/");  
              
        // Click on the search text box and send value  
        driver.findElement(By.name("q")).sendKeys("Маша Чебурашка");  
        Thread.sleep(4000);      
        // Click on the search button  
        driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).click(); 
        driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[3]/div/div/div[1]/div/div/div[2]/g-header-menu/a")).click();
        driver.findElement(By.xpath("//*[@id=\"lb\"]/div/a[4]")).click();
        driver.findElement(By.xpath("//*[@id=\"CwYCWc\"]")).sendKeys("test1");
        driver.findElement(By.xpath("//*[@id=\"mSoczb\"]")).sendKeys("test2");
        driver.findElement(By.xpath("//*[@id=\"t2dX1c\"]")).sendKeys("test3");
        driver.findElement(By.xpath("//*[@id=\"LK5akc\"]")).sendKeys("test4");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id=\"s1zaZb\"]/div[5]/div[9]/div[2]/input[2]")).click(); 
      
        
        driver.close();
          
        }  
      
    }  