import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCart {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		String[] productsToBeAdded = {"Cucumber", "Brocolli"};
		String name;
		List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
		int index=0;
		//implicit wait applicable for globally
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		for(String prod : productsToBeAdded) {
			name = prod;
			index=0;
		for(WebElement ele : products) {
			if((ele.getText()).contains(name)){
				driver.findElements(By.xpath("// button[text()='ADD TO CART']")).get(index).click();
			}
			index++;
		}
		}
		//driver.findElements(By.xpath("// button[text()='ADD TO CART']")).get(index).click();
				//System.out.println(index);
		driver.findElement(By.className("cart-icon")).click();
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		//Explicit wait used to find wait until a locator is available
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoCode")));
		driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.className("promoBtn")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoInfo")));
		System.out.println(driver.findElement(By.className("promoInfo")).getText());
		
		driver.close();
	}

}
