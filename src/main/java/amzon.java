import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amzon {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/s?bbn=84514752031&rh=n%3A84514752031%2Cp_85%3A10440599031&_encoding=UTF8&content-id=amzn1.sym.1c82c58f-ba94-4c7f-addd-8abb3f123860&pd_rd_r=d7a9b74e-f416-42ef-a6d3-c42fda889254&pd_rd_w=fWQc4&pd_rd_wg=MhVZq&pf_rd_p=1c82c58f-ba94-4c7f-addd-8abb3f123860&pf_rd_r=25C312X7CD2HFBW1CE5Z&ref=pd_gw_unk");
		List<WebElement> whripool = driver.findElements(By.cssSelector("span[class='a-size-base-plus a-color-base a-text-normal']"));
		String s = "Whirlpool 7.5 Kg 5 Star Royal Fully-Automatic Top Load Washing Machine (WHITEMAGIC ROYAL 7.5 GENX, Grey, Hard Water Wash, ZPF Technology)";
		for ( WebElement ele : whripool) {
			//System.out.println(ele.getText());
			if(ele.getText().contains(s)) {
				System.out.println(ele.getText());
				System.out.println(driver.findElement(By.cssSelector("span[class='a-truncate-cut']")).getText());
				//System.out.println(driver.findElemt(By.cssSelector("")))
			}
		}

	}

}
