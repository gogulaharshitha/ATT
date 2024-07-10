package kavya;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class exp1 {


		// TODO Auto-generated method stub

   public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chromedriver","C:\\Users\\student\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");

	}

}