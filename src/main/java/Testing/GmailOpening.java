package Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailOpening {

	public static void main(String[] args) {
    WebDriver driver=new ChromeDriver();
    driver.get("https://WWW.gmail.com/");
    try {
		Thread.sleep(5000);
	}catch(InterruptedException e) {
		e.printStackTrace();
	}
    driver.close();
	}

}
