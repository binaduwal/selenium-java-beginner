package selenium;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PageLoadingDemo {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NONE);//NORMAL,EAGER
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.quit();

	}

}
