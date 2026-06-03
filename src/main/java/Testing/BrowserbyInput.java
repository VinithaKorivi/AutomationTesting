package Testing;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class BrowserbyInput {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter browser name");
		String browser=scn.nextLine();
               WebDriver driver=null;
           if(browser.equals("Firefox")) {
        	   driver=new FirefoxDriver();
        	  
           }
           else if(browser.equals("Chrome")){
        	   driver=new ChromeDriver();
           }
           else if(browser.equals("InternetExplorer")){
        	   driver=new InternetExplorerDriver();
           }
           try {
   			Thread.sleep(5000);
   		}
           catch(InterruptedException e) {
   			e.printStackTrace();
   		}
           driver.close();
           
	}

}
