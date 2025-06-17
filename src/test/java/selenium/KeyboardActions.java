package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://search.brave.com/");

		/*
		// keydown
		driver.findElement(By.name("q")).sendKeys("abcd" + Keys.ENTER);
		Actions action = new Actions(driver);
		Action keydown = action.keyDown(Keys.CONTROL).sendKeys("a").build();// perform CTRL + A
		keydown.perform();
*/
		
		//keyup
		Actions action =new Actions(driver);
		WebElement searchBox=driver.findElement(By.name("q"));
		action.keyDown(Keys.SHIFT).sendKeys(searchBox,"selenium")
		.keyUp(Keys.SHIFT).sendKeys("selenium").perform();
		
		searchBox.clear();
		
	}

}
