package Testing;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TodeletepositiSizeofWin {

	public static void main(String[] args) throws InterruptedException {
     WebDriver driver=new ChromeDriver();
     driver.get("https://www.google.com/");
     Thread.sleep(2000);
     driver.manage().deleteAllCookies();
    
     
     Dimension d = new Dimension(500, 500);
     driver.manage().window().setSize(d);
     Thread.sleep(2000);
     
     Point p=new Point(250,250);
     driver.manage().window().setPosition(p);
     Thread.sleep(2000);
     
     driver.manage().window().maximize();
	}

}
