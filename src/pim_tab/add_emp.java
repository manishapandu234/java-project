package pim_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class add_emp {

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
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.xpath("//*[@id=\'menu_pim_viewPimModule\']")).click();
		driver.findElement(By.xpath("//*[@id=\'empsearch_employee_name_empName\']")).sendKeys("Cassidy Hope");
		driver.findElement(By.xpath("//*[@id=\'empsearch_id\']")).sendKeys("0319");
		driver.findElement(By.xpath("//*[@id=\'empsearch_supervisor_name\']")).sendKeys("Fiona Grace");
		driver.findElement(By.xpath("//*[@id=\'searchBtn\']")).click();
		driver.findElement(By.xpath("//*[@id=\'btnAdd\']")).click();
		driver.findElement(By.xpath("//*[@id=\'firstName\']")).sendKeys("Manisha");
		driver.findElement(By.xpath("//*[@id=\'lastName\']")).sendKeys("Gundepangu");
		driver.findElement(By.xpath("//*[@id=\'chkLogin\']")).click();

	}
}


	


