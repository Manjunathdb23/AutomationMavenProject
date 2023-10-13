import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class invokingtabs {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.TAB);
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parent = it.next();
		String child = it.next();
		
		driver.switchTo().window(child);
		driver.get("https://rahulshettyacademy.com/");
		String s = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
		System.out.println(driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(2).getText());
		
		Thread.sleep(5000);
		driver.switchTo().window(parent);
		
		driver.findElement(By.xpath("(//input[@name='name'])[1]")).sendKeys(s);
		
		//Screenshot
		WebElement name = driver.findElement(By.xpath("(//input[@name='name'])[1]"));
		File src = name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\manjunath.db\\Documents\\manju\\webelement.png"));
		
		//Height and width
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getWidth());

	}

}
