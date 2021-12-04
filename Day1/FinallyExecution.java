package Week8.Day1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FinallyExecution {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		try {
			driver.findElement(By.id("username1")).sendKeys("Demo");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
		}catch(Exception e) {
			System.out.println(e);
		}
		finally {
			Runtime.getRuntime().exec("taskkill/f/imchromedriver.exe");
		}
		System.out.println("End of the Program");
	}
}
