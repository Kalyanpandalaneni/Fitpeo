package automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Fit_peo {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.fitpeo.com/");

		Thread.sleep(4000);

		driver.findElement(By.xpath("//div[text()='Revenue Calculator']")).click();
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		jse.executeScript("window.scrollBy(0,300)", "");

		Thread.sleep(4000);

		WebElement rightpointer = driver.findElement(By.xpath("//span[@data-index='0']"));

		Actions act = new Actions(driver);
		// Thread.sleep(4000);

		act.dragAndDropBy(rightpointer, 94, 0).perform();

		Thread.sleep(3000);

		WebElement element = driver.findElement(By.xpath("//input[@id=':r0:']"));

		Thread.sleep(4000);

		element.clear();

		element.click();
		Thread.sleep(4000);
		element.sendKeys("560");

		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		Thread.sleep(4000);

		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();

		Thread.sleep(6000);
		driver.quit();

	}
}
