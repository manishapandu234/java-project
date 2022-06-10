package Admin_tab;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class add_user {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D://manisha//chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
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
	    List<WebElement> chk_box=driver.findElements(By.xpath("//input[@id='ohrmList_chkSelectAll']"));
	    int a=0;
	    for( WebElement ele:chk_box)
	    {
	    	if(ele.isSelected())
	    	{
	    		System.out.println("check box is selected");
	    	}
	    	else
	    	{
	    		ele.click();
	    	}
	    	a++;
	    	System.out.println(a);
	    	
	    }
		
	}
}
        
        
        

		
	
			






	


