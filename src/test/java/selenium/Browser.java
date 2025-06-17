package selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		String originalWindow = driver.getWindowHandle();

		/*
		 * driver.get("https://github.com/binaduwal");
		 * 
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 * driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		 * driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(15));
		 * System.out.println(driver.getCurrentUrl());
		 * System.out.println(driver.getTitle());
		 * 
		 * driver.navigate().back(); driver.navigate().forward();
		 * driver.navigate().refresh();
		

		Dimension size = driver.manage().window().getSize();
		System.out.println(size.getWidth());
		System.out.println(size.getHeight());

		driver.manage().window().setSize(new Dimension(800, 600));

		Point position = driver.manage().window().getPosition();
		System.out.println(position.getX());
		System.out.println(position.getY());
		driver.manage().window().setPosition(new Point(500, 100));
		
		 * driver.manage().window().maximize(); driver.manage().window().minimize();
		 * driver.manage().window().fullscreen();
		 * 
		 * 
		 * driver.switchTo().newWindow(WindowType.WINDOW);
		 * driver.switchTo().newWindow(WindowType.TAB);
		 * 
		 * File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		 * FileUtils.copyFile(srcFile, new File("./image.png"));
		 * 
		 * WebElement element = driver.findElement(By.cssSelector(".lnXdpd")); File
		 * srcFile1 = element.getScreenshotAs(OutputType.FILE);
		 * FileUtils.copyFile(srcFile1, new File("./image1.png"));
		 */
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement button=driver.findElement(By.name("btnI"));
		js.executeScript("arguments[0].click();",button);
		js.executeScript("console.log('Hello world...')");
		
		driver.switchTo().window(originalWindow);
//		driver.close(); // close current browser only
//		driver.quit();// close entire browser session

	}

}
