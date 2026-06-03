package Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//public class Demo {
//    public static void main(String[] args) {
//
//        WebDriver driver = new FirefoxDriver();
//
//        driver.get("https://www.facebook.com/");
//        try {
//            Thread.sleep(5000); // waits 5 seconds
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        driver.close();
//    }
//}

public class Demo{
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://in.search.yahoo.com/search?fr=mcafee&type=E210IN826G0&p=chrome");
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		driver.close();
	}
}