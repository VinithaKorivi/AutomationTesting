package Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TogetTitleCurrentUrl {

	public static void main(String[] args) throws Exception {
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.google.com/");
    
    String title=driver.getTitle();
    System.out.println(title);
    
    String url=driver.getCurrentUrl();
    System.out.println(url);
    
    Thread.sleep(3000);
    driver.close();
	}

}
