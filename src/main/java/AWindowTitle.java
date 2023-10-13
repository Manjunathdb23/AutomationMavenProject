import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AWindowTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://qaclickacademy.com/practice.php");
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement Footer = driver.findElement(By.id("gf-BIG"));
		System.out.println(Footer.findElements(By.tagName("a")).size());
		
		WebElement footerLinks = Footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(footerLinks.findElements(By.tagName("a")).size());
		
		for(int i=1 ; i <footerLinks.findElements(By.tagName("a")).size() ; i++ ) {
			footerLinks.findElements(By.tagName("a")).get(i).sendKeys(Keys.CONTROL,Keys.ENTER);
		}
		
		Set<String> window = driver.getWindowHandles();
		for ( String ele : window) {
			System.out.println(driver.switchTo().window(ele).getTitle());
		}
		
		

	}

}
