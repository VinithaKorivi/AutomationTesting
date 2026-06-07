package Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorer {

	public static void main(String[] args) {
	    WebDriver driver=new InternetExplorerDriver();
	    driver.get("https://WWW.gmail.com/");
	    try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	    driver.close();
		}

}
