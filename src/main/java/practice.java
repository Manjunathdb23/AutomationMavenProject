import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	static WebDriver driver = new ChromeDriver();
	static boolean flag=false;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		driver.navigate().to("https://demo.guru99.com/test/web-table-element.php#");
		//driver.navigate().to("https://www.google.com/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		String cname = "Equitas Holdings Ltd";
		List<WebElement> tabname = driver.findElements(By.xpath("//div[@id='leftcontainer']/div[4]/a"));
		int size = tabname.size();
		while(size>0) {
			int k = 0;
			if(flag) {
				System.out.println("company found");
			}
			else {
			tabname.get(k).click();
			List<WebElement> name= driver.findElements(By.xpath("//table[@class='dataTable']//a"));
			int i=1;
			for(WebElement ele : name) {
				if(ele.getText().contains(cname)) {
					System.out.println(i+1);
					flag = true;
					
				}
				i++;
			}
			size--;
				
			}
		}
		
		
		
	}

}
