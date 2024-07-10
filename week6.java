package kavya;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class week6 {
public static void main(String[] args) throws InterruptedException{
System.setProperty("webdriver.chromedriver", "C:\\Users\\student\\Downloads\\chromedriver-win64 (7).zip\\chromedriver-win64");
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
driver.manage () .window () .maximize();
Thread.sleep (2000);
WebElement searchBar=driver.findElement(By.name("q")); 
searchBar.sendKeys ("ajio");
searchBar.sendKeys (Keys.ENTER);
Thread.sleep (2000);
driver.get("https://www.ajio.com/");
Thread.sleep (2000);
WebElement signin=driver.findElement(By.xpath("//*[@id=\"loginAjio\"]"));
signin.click();
Thread.sleep (2000);
WebElement phnno=driver.findElement(By.xpath("//*[@id=\"login-modal\"]/div/div/div[2]/div/form/div[2]/div[1]/label/input")); 
phnno.sendKeys ("1234567890");
Thread.sleep (2000);
WebElement submit=driver.findElement(By.xpath("//*[@id=\"login-modal\"]/div/div/div[2]/div/form/div[2]/div[2]/input")); 
submit.click();
Thread.sleep (2000);
WebElement gender=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/header/div[1]/ul/li[1]/div/div/div/div[2]/div[2]/form/div[3]/label[1]"));
gender.click();
Thread.sleep (2000);
WebElement name=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/header/div[1]/ul/li[1]/div/div/div/div[2]/div[2]/form/div[5]/input"));
name.sendKeys("xxxxxxx");
Thread.sleep (2000);
WebElement mail=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/header/div[1]/ul/li[1]/div/div/div/div[2]/div[2]/form/div[7]/input"));
mail.sendKeys("cmrithyderabad8@gmail.com");
Thread.sleep(2000);
WebElement terms=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/header/div[1]/ul/li[1]/div/div/div/div[2]/div[2]/form/div[10]/label/span"));
terms.click();
Thread.sleep (2000);
WebElement otp=driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/header/div[1]/ul/li[1]/div/div/div/div[2]/div[2]/form/div[12]/input"));
otp.click();
}
}