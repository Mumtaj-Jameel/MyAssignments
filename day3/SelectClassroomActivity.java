package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.messages.types.Duration;

public class SelectClassroomActivity {

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
		  
		  //Click on the Leads tab.
		  driver.findElement(By.xpath("//a[text()='Leads']")).click();
		  
		  //Click on the Create Lead link from shortcuts.
		  driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		  
		  //Enter a FirstName
		  driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		  
		  //Enter a LastName.
		  driver.findElement(By.id("createLeadForm_firstName")).sendKeys("mothi");
		  
		  //- Enter a CompanyName
		  driver.findElement(By.id("createLeadForm_lastName")).sendKeys("laal");
		  
		  //Enter a Title .
		  driver.findElement(By.id("createLeadForm_generalProfTitle")).
		  sendKeys("Testleaf Tester");
		  
		  //Click the "Create Lead" button
		 
		  
		  //ByIndex
		  WebElement element1=driver.findElement(By.id("createLeadForm_dataSourceId"));
		  Select select=new Select(element1);
		  select.selectByIndex(4);
		  
		  //Bytext
		  WebElement element2=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		  Select select1=new Select(element2);
		  select1.selectByVisibleText("Automobile");
		  
		  //ByValue
		  WebElement element3=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		  Select select2=new Select(element3);
		  select2.selectByValue("OWN_CCORP");  
		  
		 driver.findElement(By.name("submitButton")).click();
		  
		  
		  
	}

}
