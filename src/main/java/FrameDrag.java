import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameDrag {

	public static void main(String[] args) {
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String s = "https://jqueryui.com/droppable/";
		driver.get(s);
		WebElement iframe = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(iframe);
		driver.findElement(By.id("draggable")).click();
		
		Actions a = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement dest = driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, dest).build().perform();
		
		driver.switchTo().defaultContent();
		
		a.moveToElement(driver.findElement(By.linkText("Accordion"))).keyDown(Keys.CONTROL).click().build().perform();
		
		
	}

}
