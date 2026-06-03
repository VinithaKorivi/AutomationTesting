package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgetPassLogin {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.get("https://adactin.com/HotelApp/index.php");
    driver.manage().window().maximize();
    
    WebElement x=driver.findElement(By.linkText("Forgot Password"));
    x.click();
	}

}
