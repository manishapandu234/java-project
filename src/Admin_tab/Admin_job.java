package Admin_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Admin_job {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D://manisha//chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	    driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		System.out.println("this is title of our  page--->"+driver.getTitle());
		String Title="orageHRM";
		if(Title.contains(Title))
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
		driver.findElement(By.xpath("//b[text()='Admin']")).click();
		driver.findElement(By.xpath("//a[@id='menu_admin_Job']")).click();

	}

}
