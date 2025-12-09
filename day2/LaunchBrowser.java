package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	public static void main(String args[])
	{
		//Setup Driver
		ChromeDriver driver=new ChromeDriver();
		
		//Load url
		driver.get("https://www.instagram.com/");
		
	}

}
