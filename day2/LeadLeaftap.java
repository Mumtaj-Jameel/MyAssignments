package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeadLeaftap {

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

     // Click Leads tab
        driver.findElement(By.linkText("Leads")).click();

        // Click Create Lead
        driver.findElement(By.linkText("Create Lead")).click();

        // Enter FirstName
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jameel");

        // Enter LastName
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Jafar");

        // Enter CompanyName
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("zoho");

        // Title of the profile
        driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Manager");

        //   Lead button
        driver.findElement(By.className("smallSubmit")).click();

        // Close the browser
        driver.quit();
	}

}
