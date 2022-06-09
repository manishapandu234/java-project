package Learn_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_invoke {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D://manisha//chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String title=driver.getTitle();
		System.out.println(title);
		System.out.println("this is title of our title of our page--->"+driver.getTitle());
		String Title="orageHRM";
		if(Title.contains(Title))
		{
			System.out.println("test case pass");
		}
		else
		{
			System.out.println("test case fail");
			
		}
		
		
	}

}
