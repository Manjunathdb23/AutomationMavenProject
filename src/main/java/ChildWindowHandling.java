import java.io.File;
import java.io.IOException;
import java.util.*;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowHandling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.className("blinkingText")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		String s = driver.findElement(By.cssSelector(".im-para.red")).getText();
		String mail= "";
		String [] str = s.split(" ");
		for(String ele : str) {
			if(ele.contains(".com")) {
				mail = ele;
				System.out.println(mail);
			}
		}
		
		driver.switchTo().window(parentId);
		driver.findElement(By.id("username")).sendKeys(mail);
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C://Users//manjunath.db//Documents//manju//screenshot.png"));


	}

}
