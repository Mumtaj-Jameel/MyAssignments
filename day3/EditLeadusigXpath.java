package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLeadusigXpath {

	public static void main(String[] args) {
		 // Initialize ChromeDriver
		
				ChromeOptions opt = new ChromeOptions();
				opt.addArguments("--guest");
				//opt.addArguments("--incognito");
				//opt.addArguments("--headless");
				opt.addArguments("--disable-notifications");
			

				//Instantiate the Browser driver
				ChromeDriver driver= new ChromeDriver(opt);

				//Maximize the browser window.

				driver.manage().window().maximize();
				//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

				//Load the url
				driver.get("http://leaftaps.com/opentaps/");

				//Enter the username as ‘demosalesmanager’
				driver.findElement(By.id("username")).sendKeys("DemoSalesManager");

				//Enter the password as 'crmsfa'
				driver.findElement(By.id("password")).sendKeys("crmsfa");

			
				//Click on the Login button.
				driver.findElement(By.className("decorativeSubmit")).click();
				  
				  //Click on the CRM/SFA link
				  driver.findElement(By.partialLinkText("CRM/SFA")).click();

        //  Leads button
        driver.findElement(By.linkText("Leads")).click();

        // Create Lead
        driver.findElement(By.linkText("Create Lead")).click();

        // Company Name using XPath
        driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf Pvt Ltd");

        //  First Name using XPath
        driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Jessi");

        //  Last Name using XPath
        driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Jones");

        //  First Name (Local) using XPath
        driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("JessiJo");

        //  Department
        driver.findElement(By.id("createLeadForm_departmentName")) .sendKeys("Quality Assurance");

        //  Description 
        driver.findElement(By.name("description")).sendKeys("I am Manual Test lead.");

        //  Email 
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("jessi.joe@testleaf.com");

        //  State/Province 
        WebElement ele4 = driver.findElement(By.id("generalStateProvinceGeoId"));
        Select sel4 = new Select(ele4);
        sel4.selectByVisibleText("New York");

        //  Create Button
        driver.findElement(By.className("smallSubmit")).click();

        //  Edit button
        driver.findElement(By.linkText("Edit")).click();

        
        driver.findElement(By.name("description")).clear();

      
        driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("I am Automation Tester");

        //  Update button
        driver.findElement(By.className("smallSubmit")).click();

        
        System.out.println("Page Title after Update: " + driver.getTitle());

        driver.quit();

	}

}
