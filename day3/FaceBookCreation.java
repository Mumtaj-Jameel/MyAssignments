package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;

public class FaceBookCreation {

    public static void main(String[] args) throws InterruptedException {

       
        WebDriver driver = new ChromeDriver();

      
        driver.get("https://en-gb.facebook.com/");

      
        driver.manage().window().maximize();

       
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();

        
        Thread.sleep(2000);

        driver.findElement(By.name("firstname")).sendKeys("Jameel");

        driver.findElement(By.name("lastname")).sendKeys("Jafar");

       
        driver.findElement(By.name("reg_email__")).sendKeys("jameelj123@gmail.com");

        
        driver.findElement(By.name("reg_passwd__")).sendKeys("Password@123");

        
        WebElement day = driver.findElement(By.id("day"));
        Select selectDay = new Select(day);
        selectDay.selectByVisibleText("15");

        WebElement month = driver.findElement(By.id("month"));
        Select selectMonth = new Select(month);
        selectMonth.selectByVisibleText("May");

        WebElement year = driver.findElement(By.id("year"));
        Select selectYear = new Select(year);
        selectYear.selectByVisibleText("1995");

        
        driver.findElement(By.xpath("//label[text()='Male']")).click();

        
        Thread.sleep(3000);
        driver.quit();
    }
}