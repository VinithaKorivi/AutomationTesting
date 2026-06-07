package Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsofWebDri {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.google.com/");
    String title=driver.getTitle();
    System.out.println(title);
    String urls=driver.getCurrentUrl();
    System.out.println(urls);
    Thread.sleep(5000);
    driver.close();
    }

}
