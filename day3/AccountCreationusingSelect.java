package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class AccountCreationusingSelect {

	public static void main(String[] args) {
		//Driver
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
		  
		  //  Accounts 
	        driver.findElement(By.linkText("Accounts")).click();

	        // Create Account
	        driver.findElement(By.linkText("Create Account")).click();

	        //  Account Name
	        driver.findElement(By.id("accountName")).sendKeys("MumtajJameel");

	        //  Description
	        driver.findElement(By.name("description")).sendKeys("I am a Selenium Automation Tester");
	        
	       //Selecting Industry
	        WebElement ele=driver.findElement(By.name("industryEnumId"));
	        Select sel=new Select(ele);
	        sel.selectByIndex(3);
	        
	        //Selecting Ownership
	        
	        WebElement ele1 = driver.findElement(By.name("ownershipEnumId"));
	        Select sel1 = new Select(ele1);
	        sel1.selectByVisibleText("S-Corporation");
	        
	        
	        //Selecting Source as Employee
	        
	        WebElement ele2 = driver.findElement(By.id("dataSourceId"));
	        Select sel2 = new Select(ele2);
	        sel2.selectByValue("LEAD_EMPLOYEE");
	        
	       
	   
	        
	       //Marketing Campaign
	        
	        WebElement ele3 = driver.findElement(By.id("marketingCampaignId"));
	        Select sel3 = new Select(ele3);
	        sel3.selectByIndex(6);
	        
	        
	        // Selecting State
	        
	        WebElement ele4 = driver.findElement(By.id("generalStateProvinceGeoId"));
	        Select sel4 = new Select(ele4);
	        sel4.selectByValue("TX");
	        
	        //Create Account
	     
	      driver.findElement(By.className("smallSubmit")).click();
	        
	     // Print the title of the page
	        String title=driver.getTitle();
	        System.out.println("Page Title: " + title);

	        // Close the browser
	        driver.quit(); 
			
	      
	        


	}

}
