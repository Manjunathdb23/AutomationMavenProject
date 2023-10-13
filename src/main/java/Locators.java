import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String info, password;
		
		//First time login attempt with wrong password
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("hello@123");
		driver.findElement(By.className("signInBtn")).click();
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	System.out.println(driver.findElement(By.className("error")).getText());
	
	//driver.findElement(By.cssSelector("div.forgot-pwd-container")).click();
	
	//Getting a new password to login
	
	driver.findElement(By.linkText("Forgot your password?")).click();
	driver.findElement(By.cssSelector("input[placeholder$='Name']")).sendKeys("rahul");
	driver.findElement(By.cssSelector("input[placeholder$='Email']")).sendKeys("rahul@gmail.com");
	driver.findElement(By.cssSelector("input[placeholder$='Phone Number']")).sendKeys("8882345678");
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
	info = driver.findElement(By.cssSelector("p[class=infoMsg]")).getText();
	password = GetPassword(info);
	driver.findElement(By.cssSelector("button[class= 'go-to-login-btn']")).click();
	
	//second time login attempt
	
	driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("rahul");
	driver.findElement(By.name("inputPassword")).sendKeys(password);
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.cssSelector("input[id='chkboxOne']")).click();
	driver.findElement(By.cssSelector("input[id='chkboxTwo']")).click();
	driver.findElement(By.className("signInBtn")).click();
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(driver.findElement(By.xpath("//div/p")).getText());
	Assert.assertEquals(driver.findElement(By.xpath("//div/p")).getText(),"You are successfully logged in.");
	
	driver.findElement(By.xpath("//button[text()='Log Out']")).click();
	driver.close();
		

	}

	public static String GetPassword(String S) {
		return S.split("'")[1].split("'")[0];
		
	}
}
