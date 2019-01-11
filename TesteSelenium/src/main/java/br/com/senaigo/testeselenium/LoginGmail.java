package br.com.senaigo.testeselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginGmail {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\AreaDeTrabalho\\Progamas\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://accounts.google.com/signin/v2/sl/pwd?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.id("identifierId"));
		element.sendKeys("suleimanmoraes@gmail.com");
//		WebElement element = driver.findElement(By.name("login-password"));
//		element.sendKeys("agr$#2016");
		
		driver.findElement(By.className("CwaK9")).click();
		
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		driver.findElement(By.name("password")).sendKeys("medianeiragotspntwdgrimm88");
//		WebElement element = driver.findElement(By.name("login-password"));
//		element.sendKeys("agr$#2016");
		
		driver.findElement(By.className("CwaK9")).click();
		
//		element.submit();
		String at = driver.getTitle();
		String et = "youtube";
//		driver.quit();
	}

}
