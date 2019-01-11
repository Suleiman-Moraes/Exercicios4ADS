package br.com.senaigo.testeselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginObjeto {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\AreaDeTrabalho\\Progamas\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.portal.agr.go.gov.br/ouvidoria/login.jsp");
		driver.manage().window().maximize();
		
		driver.findElement(By.className("close")).click();
		
		WebElement element = driver.findElement(By.id("login-username"));
		element.sendKeys("root");
//		WebElement element = driver.findElement(By.name("login-password"));
//		element.sendKeys("agr$#2016");
		
		driver.findElement(By.id("login-password")).sendKeys("agr$#2016");
//		WebElement element = driver.findElement(By.name("login-password"));
//		element.sendKeys("agr$#2016");
		
		driver.findElement(By.id("btn-login")).click();
		
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(driver.findElement(By.id("fo-pesquisa-protocolo:totalRegistros")).getText());
		System.out.println(driver.getPageSource());
		
//		element.submit();
		String at = driver.getTitle();
		String et = "youtube";
//		driver.quit();
	}

}
