import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendraHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companions");
		Thread.sleep(5000);
		driver.findElement(By.name("form_fields[travel_comp_date]")).click();
		boolean flag = true;
		
		while(flag) {
			if(((driver.findElement(By.className("nulcur-monthl")).getText()).contains("December")) && ((driver.findElement(By.className("numInput cur-year")).getText()).contains("2023")) ){
				flag=false;
			}
			else {
				driver.findElement(By.className("flatpickr-next-month")).click();
			}
		}
		

	}

}
