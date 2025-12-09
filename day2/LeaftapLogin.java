package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeaftapLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Driver
		ChromeDriver driver=new ChromeDriver();
		
		//Maximize Window
		driver.manage().window().maximize();
		
		//loading URl
		driver.get(" http://leaftaps.com/opentaps/");

		//Username
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		//password 
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Login Button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		 //  CRM/SFA link
        driver.findElement(By.linkText("CRM/SFA")).click();

        //  Accounts 
        driver.findElement(By.linkText("Accounts")).click();

        // Create Account
        driver.findElement(By.linkText("Create Account")).click();

        //  Account Name
        driver.findElement(By.id("accountName")).sendKeys("JameelJ");

        //  Description
        driver.findElement(By.name("description")).sendKeys("I am a Selenium Automation Tester");

        //  Number of Employees
        driver.findElement(By.id("numberEmployees")).sendKeys("20");

        //  Site Name
        driver.findElement(By.id("officeSiteName")).sendKeys("Jameel LeafTaps");

        // Create Account button
        driver.findElement(By.className("smallSubmit")).click();

        // Print the title of the page
        String title=driver.getTitle();
        System.out.println("Page Title: " + title);

        // Close the browser
        driver.quit();
		
	}

}
