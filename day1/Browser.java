package week2.day1;

public class Browser {
	public String launchBrowser(String browserName)
	{
		System.out.println("Current Lunching Browser is" + browserName);
		return browserName;
	}
	public void loadUrl() {
		System.out.println ("URL Loaded Sucessfully");
	}
public static void main(String args[]) {
	Browser launchobj = new Browser();
	launchobj.launchBrowser("Chrome Browser");
	launchobj.loadUrl();
	
}
}
