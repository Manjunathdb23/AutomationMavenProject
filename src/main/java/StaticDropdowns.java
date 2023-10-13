import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement staticDropdowns = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select dropdowns = new Select(staticDropdowns);
		dropdowns.selectByIndex(2);
		System.out.println(dropdowns.getFirstSelectedOption().getText());
		dropdowns.selectByVisibleText("USD");
		System.out.println(dropdowns.getFirstSelectedOption().getText());
		dropdowns.selectByValue("INR");
		System.out.println(dropdowns.getFirstSelectedOption().getText());
		
		

	}

}
