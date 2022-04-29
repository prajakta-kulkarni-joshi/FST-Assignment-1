package Assignment1.com.Java.Assignment1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

public class LoginPage {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","C:\\Prajakta\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.saucedemo.com");
		WebElement l = driver.findElement(By.name("user-name"));
		l.sendKeys("standard_user");
		WebElement p = driver.findElement(By.name("password"));
		p.sendKeys("secret_sauce");
		WebElement login=driver.findElement(By.name("login-button"));
		login.click();
		
		/*private static final String sAddToCart = "(//input[contains(@name,'Add to cart')])[1]";*/
		/*private static final String sViewCartXPath = "(//a[contains(.,'view cart')])[1]";*/
		 driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		 driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		 driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
		 driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
		 driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
		 driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
		 driver.findElement(By.id("shopping_cart_container")).click();
		 
		
    }
	
	

}
