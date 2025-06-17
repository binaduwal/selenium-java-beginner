package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://trytestingthis.netlify.app/");
		
		WebElement dropdown = driver.findElement(By.id("owc"));
		Select selectObject = new Select(dropdown);
		
		selectObject.selectByValue("option 1");
		Thread.sleep(1000);
		selectObject.selectByVisibleText("Option 2");
		Thread.sleep(1000);
		selectObject.deselectByIndex(3);	

		
//		List <WebElement> allOptions=driver.findElements(By.id("option"));
//		for(WebElement elements : allOptions)
//		{
//			System.out.println(elements.getText());
//		}
		
		driver.close();
	}

}
