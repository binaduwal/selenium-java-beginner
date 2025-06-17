package selenium;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProxyDemo {

	public static void main(String[] args) {
		Proxy proxy = new Proxy();
		proxy.setAutodetect(false);
		proxy.setSslProxy("localhost:8080");

		ChromeOptions options = new ChromeOptions(); //customize or configure the behavior of the Chrome browse
		options.setCapability("proxy", proxy);
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://google.com");
		driver.quit();
	}

}
