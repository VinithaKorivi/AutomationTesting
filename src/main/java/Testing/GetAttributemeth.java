package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributemeth {

	public static void main(String[] args) {
    WebDriver driver =new ChromeDriver();
    driver.get("http://www.adactin.com/HotelApp/index.php");
    driver.findElement(By.id("username")).sendKeys("Vinitha");
    driver.findElement(By.id("password")).sendKeys("Vini@1234");
    String s1=driver.findElement(By.id("username")).getAttribute("value");
    String s2=driver.findElement(By.id("password")).getAttribute("value");
   System.out.println(s1);
   System.out.println(s2);
}
}