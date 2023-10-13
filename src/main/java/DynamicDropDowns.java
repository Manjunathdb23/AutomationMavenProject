import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDowns {

	public static void main(String [] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.cssSelector("input[id=\"ctl00_mainContent_ddl_originStation1_CTXT\"")).click();
		
		driver.findElement(By.xpath("//a[@value = 'BLR']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@value = 'MAA'])[2]")).click();//xpath using Indexing
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();//xpath using parent-child relationship
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		//class name can be used as css selector by providing dot in the front of the name and 
		//whenever there is a space in between classname it has to be replaced with dot
		
		
		
	}
}
