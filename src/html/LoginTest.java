package html;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author DELL
 *
 */
public class LoginTest {
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
			int size_menu=driver.findElements(By.className("main_menu_first_level_list_item")).size();
	        System.out.println(size_menu);
	        int Even_rows=driver.findElements(By.className("Even")).size();
	        System.out.println("number of even rows is---->"+Even_rows);
	        int odd_rows=driver.findElements(By.className("Odd")).size();
	        System.out.println("number of odd rows is---->"+odd_rows);
	        
	        System.out.println("six_row");
	        	
	        
        }

	
		}

	        
	        
	        

			
		
				




