package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {

		 public static void main(String[] args) {

		        WebDriverManager.chromedriver().setup();
		        WebDriver driver = new ChromeDriver();

		        driver.manage().window().maximize();
///	        driver.get("https://the-internet.herokuapp.com");

		        driver.get("https://the-internet.herokuapp.com/login");

		        driver.findElement(By.id("username")).sendKeys("tomsmith");
		        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");

		        driver.findElement(By.cssSelector("button[type='submit']")).click();

		        System.out.println(driver.getTitle());

		        driver.quit();
	}

}
