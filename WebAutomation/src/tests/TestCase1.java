package tests;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
	
	public class TestCase1 {
	
		public static void main(String[] args) throws InterruptedException {
	
			// Set System property
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\jc\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
			// Create Object of ChromeDriver browser
			WebDriver driver = new ChromeDriver();
	
			// Delete Cookies
			driver.manage().deleteAllCookies();
	
			// Apply time
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
			// Maximised the Web
			driver.manage().window().maximize();
	
			// URL
			driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");  
			
			
			// Check one button and mutilple 
			//driver.findElement(By.xpath("(//input[@name='radioButton'])[1]")).click(); 
			
			List<WebElement> radiobutton = driver.findElements(By.xpath("//input[@name='radioButton']")); 
			
		   System.out.println("Total element is " + radiobutton.size()); 
		   
		   
		   for (int i = 0; i < radiobutton.size(); i++)
		    {
		    	radiobutton = driver.findElements(By.xpath("//input[@name='radioButton']")); 
		    	
		    	System.out.println(radiobutton.get(i).getAttribute("value"));
		    	
		    	radiobutton.get(i).click();
		    	Thread.sleep(3000);
		    }
	
		   
		   // Dropdown - select method 
		    driver.findElement(By.id("dropdown-class-example")).click();
		    Thread.sleep(3000);
		   
		    		
		    Select s = new Select(driver.findElement(By.id("dropdown-class-example")));
		    
		    s.selectByValue("option2"); 
		    
		    // Dynamic drop down 
		    driver.findElement(By.id("autocomplete")).sendKeys("United Kingdom (UK)");   
		    
		    
		   
			// Check one box and mutilple boxes 
			//driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		    
			List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']")); 
			
		   System.out.println("Total element is " + checkbox.size());
		    
		   for (int j = 0; j < checkbox.size(); j++) 
		    {
		    	checkbox = driver.findElements(By.xpath("//input[@type='checkbox']")); 
		    	
		    	System.out.println(checkbox.get(j).getAttribute("value"));
		    	
		    	checkbox.get(j).click();
		    	Thread.sleep(3000);
		    	
		    	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Jackson");   
		    	 
		    	
		    	System.out.println(driver.findElement(By.xpath("//a[@class='blinkingText']")).getText());
		    	
		    	
		    	driver.quit();
		    }
        }
}
