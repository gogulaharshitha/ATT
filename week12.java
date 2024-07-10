package kavya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class week12 {
 public static void main(String[] args) throws InterruptedException {

 WebDriver driver=new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("https://www.adobe.com/in/acrobat/online/pdf-to-word.html");
 Thread.sleep(1000);
  WebElement el = driver.findElement(By.id("fileInput"));
el.sendKeys("D:\\pdf to word");
 Thread.sleep(1000);
 Thread.sleep(20000);
 WebElement downloadBtn = driver.findElement(By.xpath("/html/body/main/div[1]/div/div[2]/div/div[1]/div/div/div/section[1]/div/div/div/div[1]/div[2]/div[1]/button[1]"));
 downloadBtn.click();
 }
 } 