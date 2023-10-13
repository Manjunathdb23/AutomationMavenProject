import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		Assert.assertFalse(driver.findElement(By.xpath("//div[@id='ctl00_mainContent_SeniorCitizenDiv']")).isSelected());
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_SeniorCitizenDiv']")).click();
		Thread.sleep(2000);
		//Assert.assertTrue(driver.findElement(By.xpath("//div[@id='ctl00_mainContent_SeniorCitizenDiv']")).isSelected());
		
		WebElement UpdatedDropdown = driver.findElement(By.id("divpaxinfo"));
		UpdatedDropdown.click();
		Thread.sleep(2000);
		int i=1;
		while(i<5) {
		driver.findElement(By.id("hrefIncAdt")).click();
		i++;
	}
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		
		// To extract a int number from string
//		String[] str= driver.findElement(By.id("divpaxinfo")).getText().split(" ");
//		int k = Character.getNumericValue(str[0].);//for single digit numeric value it will work
		
//		int k = Integer.parseInt(str[0]);//for all the digit numeric value it will work
//		
//		System.out.println(k);
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		
		if(driver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style").contains("1")) {
			System.out.println("Enabled");
			Assert.assertTrue(true);
		}
		
		else {
			System.out.println("Disabled");
			Assert.assertTrue(false);
		}
		
		//Assert.assertTrue(driver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style").contains("1"));
		//driver.close();
}
}
