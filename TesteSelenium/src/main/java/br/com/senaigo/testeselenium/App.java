package br.com.senaigo.testeselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        System.out.println( "Hello World!" );
        System.setProperty("webdriver.chrome.driver", "C:\\AreaDeTrabalho\\Progamas\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.google.com/");
        
        WebElement element = driver.findElement(By.name("q"));
        
        element.sendKeys("Cheese!");
        
        element.submit();
        
        System.out.println("Título da página " + driver.getTitle());
        
        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
        	public Boolean apply(WebDriver d) {
        		return d.getTitle().toLowerCase().startsWith("cheese!");
        	}
		});
        
        System.out.println("Título da página é: " + driver.getTitle());
        
        driver.quit();
    }
}
