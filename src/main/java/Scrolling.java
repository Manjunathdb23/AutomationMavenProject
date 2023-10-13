import java.util.List;
import java.io.File;
import java.io.IOException;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator.RelativeBy;
import org.testng.Assert;
import org.apache.commons.io.FileUtils;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class Scrolling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=200");
		
		int sum = 0 ; 
		List<WebElement> number = driver.findElements(By.xpath("//div[@class='tableFixHead']//td[4]"));
		for(int i=0 ; i < number.size(); i++) {
			String temp = number.get(i).getText();
			sum = Integer.parseInt(temp)+ sum;
		}
		
		System.out.println(sum);
		
		int Expected = Integer.parseInt(driver.findElement(By.xpath("//div[@class='totalAmount']")).getText().split(" ")[3]);
		System.out.println(Expected);
		Assert.assertEquals(sum, Expected);
		System.out.println(driver.findElement(By.xpath("//table[@class='table-display']//tr[3]")).getText());
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C://Users//manjunath.db//Documents//manju//screenshot.png"));
		
		//Relative locators
		WebElement nameBox = driver.findElement(By.xpath("//input[@id='displayed-text']"));
//		nameBox.sendKeys("Ravi");
//		String s = driver.findElement(with(By.tagName("legend")).above(nameBox)).getText();
//		System.out.println(s);
		
	 // driver.findElement(with(By.tagName("input")).above(nameBox)).click();

	}

}
