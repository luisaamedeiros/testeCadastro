package page;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AcessoPage {
	private static WebDriver driver;

	public static  void acessarSite() {
		System.setProperty("webdriver.chrome.driver", "C:/drivers/browser/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://edenred.com.br/");
		driver.manage().window().maximize();
	}

	public void acessarAba() {
		int timeout = 05;
		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/a")).click();
		
	}

	public void cadastrarEmail() {
		int timeout = 05;
		driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div/section[12]/div/div/div/div/div/div/div/div/div[1]/form/input[2]")).sendKeys("Luisa");
		driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div/section[12]/div/div/div/div/div/div/div/div/div[1]/form/input[3]")).sendKeys("teste@yopmail.com");
	}

	public void efetuarCadastro() {

		driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div/section[12]/div/div/div/div/div/div/div/div/div[1]/form/div/button")).click();
	}
	
	

}
