package kavya;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class week2{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.mercurytravels.co.in/");
		Thread.sleep(1000);
		WebElement customer=driver.findElement(By.xpath("/html/body/nav[2]/div/div[2]/ul/li[1]/a"));
		customer.click();
		Thread.sleep(1000);
		WebElement register=driver.findElement(By.xpath("/html/body/nav[2]/div/div[2]/ul/li[1]/ul/li[2]/a"));
		register.click();
		Thread.sleep(1000);
		WebElement firstname=driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/form/div/div[1]/input"));
		firstname.click();
		firstname.sendKeys("vanisathvika");
		firstname.sendKeys(Keys.ENTER);
		WebElement ln=driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/form/div/div[2]/input"));
		ln.click();
		ln.sendKeys("vanisathvika");
		ln.sendKeys(Keys.ENTER);
		WebElement email=driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/form/input[1]"));
		email.click();
		email.sendKeys("vanisathvika@gmail.com");
		email.sendKeys(Keys.ENTER);
		WebElement pass=driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/form/input[2]"));
		pass.click();
		pass.sendKeys("vanisathvika6060");
		pass.sendKeys(Keys.ENTER);
		WebElement cpass=driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/form/input[3]"));
		cpass.click();
		cpass.sendKeys("vanisathvika6060");
		cpass.sendKeys(Keys.ENTER);
		WebElement ph=driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/form/input[4]"));
		ph.click();
		ph.sendKeys("9390405044");
		ph.sendKeys(Keys.ENTER);
		WebElement sub=driver.findElement(By.xpath("//*[@id=\"modalUserLogin\"]/div/div/div[2]/form/button"));
		sub.click();
		Thread.sleep(3000);
		driver.close();
		
}
}