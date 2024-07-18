package ui;
import org.openqa.selenium.By ;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DemoAutomation {
	
	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver","C:\\browserdrivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[1]/a")).click();

		//driver.close();
		
        driver.get("https://the-internet.herokuapp.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@href=\"/basic_auth\"]")).click();
		
        driver.get("https://the-internet.herokuapp.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@href=\"/add_remove_elements/\"]")).click();
		
		driver.get("https://the-internet.herokuapp.com/");
			
		driver.manage().window().maximize();
			
		driver.findElement(By.xpath("/html/body/div[2]/div/ul/li[4]/a")).click();
		
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.manage().window().maximize();
			
		driver.findElement(By.xpath("//a[starts-with(@href,'/geo')]")).click();
		
        driver.get("https://the-internet.herokuapp.com/");
		
		driver.manage().window().maximize();
			
		driver.findElement(By.xpath("//a[contains(@href,'ver')]")).click();
		
		driver.get("https://the-internet.herokuapp.com/");
			
		driver.manage().window().maximize();
				
		driver.findElement(By.xpath("//a[text()= 'Infinite Scroll']")).click();
		
		
	}

}
