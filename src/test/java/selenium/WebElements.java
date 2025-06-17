package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
//		driver.get("https://google.com");
		
		/*
		//get active element
		WebElement activeElement=driver.switchTo().activeElement();
		activeElement.sendKeys("Hello Google");
		String title=activeElement.getAttribute("title");
		System.out.println(title);
		*/
		
		/*
		//get tagname,text,css
		WebElement searchBox=driver.findElement(By.name("q"));
		String tagName=searchBox.getTagName();
		String text=searchBox.getText();
		String cssValue=searchBox.getCssValue("font");
		
		System.out.println(tagName + "|" +text +"|" +cssValue);
		*/
		
		//enabled and disabled
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		WebElement checkbox=driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		System.out.println(checkbox.isEnabled());
		System.out.println(checkbox.isSelected());
		driver.close();
	}
	}

