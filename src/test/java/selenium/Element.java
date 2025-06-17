package selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Element {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
//		WebElement searchBox=driver.findElement(By.name("q"));
//		searchBox.sendKeys("Hi Bina",Keys.ENTER);
		
//		driver.navigate().to("http://trytestingthis.netlify.app/");
//		List <WebElement> options=driver.findElements(By.name("Optionwithcheck[]"));
//		for(WebElement element:options) {
//			System.out.println(element.getText());
//		}
//		
//		driver.findElement(By.cssSelector("#fname")).sendKeys("Bina");
//	
	
	driver.navigate().to("https://trytestingthis.netlify.app/");
	WebElement lastname = driver.findElement(By.name("lname"));

	WebElement usernameTextBox =
	    driver.findElement(
	      RelativeLocator.with(By.tagName("input"))
	                     .above(lastname)
	    );

	usernameTextBox.sendKeys("Admin");
	}


}
