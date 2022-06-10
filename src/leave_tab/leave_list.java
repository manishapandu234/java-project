package leave_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class leave_list {

	public static void main(String[] args) {
		 String From_year="2007";
		  String To_year="2022";   
		  String From_month="Jan";
		  String To_month="Feb";
		  int Fdate=25;
		  int Tdate=20;
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
			driver.findElement(By.xpath("//*[@id=\'menu_leave_viewLeaveModule\']")).click();
//			from Date picker
			driver.findElement(By.xpath("//*[@id='calFromDate']")).click();	
			Select dw_fMM=new Select(driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/select[1]")));
			dw_fMM.selectByVisibleText(From_month);
			Select dw_fYY=new Select(driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/select[2]")));
			dw_fYY.selectByVisibleText(From_year);
			driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr/td/a[contains(text(),'"+Fdate+"')]")).click();
//			to date picker
           driver.findElement(By.xpath("//*[@id='calToDate']")).click();
           Select dw_tMM=new Select(driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/select[1]")));
			dw_tMM.selectByVisibleText(To_month);
			Select dw_tYY=new Select(driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div/select[2]")));
			dw_tYY.selectByVisibleText(To_year);
			driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr/td/a[contains(text(),'"+Tdate+"')]")).click();
           driver.findElement(By.xpath("//*[@id=\'leaveList_chkSearchFilter_checkboxgroup_allcheck\']")).click();
           driver.findElement(By.xpath("//*[@id=\'leaveList_txtEmployee_empName\']")).sendKeys("Cassidy Hope");
           driver.findElement(By.xpath("//*[@id=\'leaveList_cmbWithTerminated\']")).click();
           driver.findElement(By.xpath("//*[@id=\'btnSearch\']")).click();
	 }

}
		
			



	


