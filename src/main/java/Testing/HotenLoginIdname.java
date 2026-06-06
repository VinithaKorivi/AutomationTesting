package Testing;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class HotenLoginIdname {

	public static void main(String[] args) throws InterruptedException{
    WebDriver driver=new ChromeDriver();
    driver.get("https://adactin.com/HotelApp/index.php");
    driver.manage().window().maximize();
    
     WebElement x=driver.findElement(By.id("username"));
     x.sendKeys("Vinitha");
     
     WebElement x1=driver.findElement(By.name("Password"));
     x1.sendKeys("Vini@1234");
     
     WebElement x2=driver.findElement(By.id("login"));
     x2.click();
     
//     driver.navigate().refresh();
//     driver.navigate().back();
//     Thread.sleep(2000);
//     driver.close();
	}

}
