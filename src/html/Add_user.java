package html;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Add_user {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String title=driver.getTitle();
		System.out.println(title);
		System.out.println("this is title of our title of our page--->"+driver.getTitle());
		String Title="orageHRM";
		if(Title.contains("HRM"))
		{
			System.out.println("test case pass");
		}
		else
		{
			System.out.println("test case fail");
		}
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();

}


	}


