import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenuim_Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//FireFox driver
//		WebDriver fdriver = new FirefoxDriver();
//		fdriver.get("https://www.youtube.com/");
//		fdriver.close();
		
		//Chrome Driver
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		System.out.println(driver.getTitle());
		driver.close();

	}

}
