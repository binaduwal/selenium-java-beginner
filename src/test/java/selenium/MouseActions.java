package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		/*
		 * driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		 * WebElement boxA=driver.findElement(By.xpath("//li[text()='A']")); WebElement
		 * boxD=driver.findElement(By.xpath("//li[text()='D']"));
		 * 
		 * Actions actions=new Actions(driver);
		 * 
		 * actions.clickAndHold(boxA).moveToElement(boxD).release().build().perform();
		 * 
		 * 
		 * //Right click actions.contextClick(boxD).build().perform();
		 */

		// drag and drop

		driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");
		WebElement element1 = driver.findElement(By.id("draggable"));
		WebElement element2 = driver.findElement(By.id("droppable"));

		Actions actions = new Actions(driver);
		actions.dragAndDrop(element1, element2);
		actions.build().perform();

		driver.close();

		System.out.println("Done");

	}

}
