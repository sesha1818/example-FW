package Group1.g1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class App 
{
	
	@Test
	public void openbrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/skumarigv/Practice/g1/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
         driver.navigate().to("https://www.nordstromrack.com/");

        Thread.sleep(1000);

        WebElement closeBtn = driver.findElement(By.xpath("//button[contains(@class,'email-collector')]"));

        JavascriptExecutor executor1 = (JavascriptExecutor) driver;
        executor1.executeScript("arguments[0].click();", closeBtn);
        Thread.sleep(1000);
        WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Log In / Sign Up')]"));

        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
        Thread.sleep(1000);
         driver.findElement(By.xpath("//button[contains(.,'Log In')]")).click();

        WebElement email = driver.findElement(By.xpath("//input[contains(@name,'email')]"));
        email.sendKeys("neethanm@yahoo.com");

        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));

        password.sendKeys("19821216na");
        driver.findElement(By.xpath("//div[@class='authentication-form__submit']/button[@type='submit']")).click();
        System.out.println("Logged in SuccessFully");
        WebElement ele = driver.findElement(By.xpath("//span[contains(.,'Bags & Accessories')]"));

        JavascriptExecutor executor3 = (JavascriptExecutor) driver;
        executor3.executeScript("arguments[0].click();", ele);

  driver.findElement(By.xpath("(//a[contains(.,'Backpacks')])[3]")).click();

        driver.findElement(By
               .xpath("//div[contains(text(),'Nike')]/following::div[contains(text(),'Gymsak Drawstring Backpack')]"))
                     .click();
        Thread.sleep(5000);
        System.out.println("Clicked on Nike Bag");
        WebElement onesize = driver.findElement(By.xpath("//span[text()='One Size']"));

        JavascriptExecutor executor4 = (JavascriptExecutor) driver;
        executor4.executeScript("arguments[0].click();", onesize);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[contains(.,'Add to Cart')]")).click();
        System.out.println("Clicked on Add Cart Button");
        Thread.sleep(1000);
  driver.findElement(By.xpath("(//a[@href='/checkout'])[2]")).click();
        System.out.println("Clicked on Checkout Button");
  driver.findElement(By.xpath("//button[contains(.,'Remove')]")).click();
  
	}
}
