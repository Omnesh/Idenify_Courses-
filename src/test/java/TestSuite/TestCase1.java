package TestSuite;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Base;

public class TestCase1 extends Base {
	By search = By.xpath(
			"//*[@id=\"rendered-content\"]/div/header/div/div/div/div[1]/div[3]/div/form/div/div/div[1]/div[1]/input");
	By button = By.xpath(
			"//*[@id=\"rendered-content\"]/div/header/div/div/div/div[1]/div[3]/div/form/div/div/div[1]/button[2]/div");
	By apply = By.xpath("//span[text()='Apply']");
	By Beginner = By.xpath("//span[text()='Beginner']");
	By more = By.xpath("(//span[text()='Show more'])[4]");
	By english = By.xpath("//span[text()='English']");
	By name = By.xpath("//a/div/div[2]/h2");
	By rating = By.className("ratings-text");
	
	@Test(priority=1)
	public void test() throws IOException, InterruptedException{
		
		launchBrowser("chrome", "https://www.coursera.org/in");
		
		driver.findElement(search).sendKeys("Web Development");
		driver.findElement(button).click();
		driver.findElement(Beginner).click();
		driver.findElement(more).click();
		driver.findElement(english).click();
		driver.findElement(apply).click();
		Thread.sleep(5000);
		
		System.out.println("");
		System.out.println("The courses and their ratings are: ");
		System.out.println("");
		/*List<WebElement> names = driver.findElements(name);
		List<WebElement> ratings = driver.findElements(rating);
		for (int j = 0; j < 2; ++j) {
			System.out.println(names.get(j).getText() + " - " + ratings.get(j).getText());
		}
		System.out.println(driver.findElement(By.className("ratings-text")).getText());*/
		
	}

}
