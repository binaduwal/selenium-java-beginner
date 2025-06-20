package selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		
		//JS alert
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Alert alert1=driver.switchTo().alert();
		Thread.sleep(2000);
		alert1.accept();
		
		if(driver.getPageSource().contains("You successfully clicked an alert"));
			System.out.println("You successfully clicked an alert");
			
			
		//JS confirmation
			driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
			Alert alert2=driver.switchTo().alert();
			Thread.sleep(2000);

			alert2.dismiss();
			
			if(driver.getPageSource().contains("You clicked: Cancel"));
				System.out.println("You clicked: Cancel");

				//JS Prompt
				driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
				Alert alert3=driver.switchTo().alert();
				Thread.sleep(2000);
				alert3.sendKeys("Bina Duwal");
				alert3.accept();
				
				if(driver.getPageSource().contains("You entered Bina Duwal"));
					System.out.println("You entered Bina Duwal");

		driver.close();
		
	}

}
