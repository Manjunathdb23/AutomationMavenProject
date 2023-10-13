import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class streamsExample {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.findElement(By.xpath("//span[@class='sort-icon sort-descending']")).click();
		List<WebElement> original = driver.findElements(By.xpath("//table[@class='table table-bordered']/tbody/tr/td[1]"));
		original.stream().map(s->s.getText());
		//sibling traversal //tbody/tr/td[1]/following-sibling::td[1]
		
	}

}
