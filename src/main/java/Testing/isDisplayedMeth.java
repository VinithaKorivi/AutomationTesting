package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayedMeth {

	public static void main(String[] args) {
		 WebDriver driver =new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 boolean logo = driver.findElement(By.xpath("//input[@name='email']")).isDisplayed();
		 if(logo==true) {
			 System.out.println("logo is available");
		 }
		 else{
		 System.out.println("logo is not available");
		 }
		 
		
	}

}
