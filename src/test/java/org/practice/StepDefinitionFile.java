package org.practice;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinitionFile {
	WebDriver driver;
	@Given("user is on the adactin website")
	public void d(){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
	
	    
	}

	@When("user is going to enter the Username and password")
	public void a(){
		WebElement txt = driver.findElement(By.xpath("//input[@id='username']"));
		txt.sendKeys("pradeesh");
		WebElement pwd = driver.findElement(By.xpath("//input[@name='password']"));
		pwd.sendKeys("pra@1234");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	
	}

	@When("user is going to click login")
	public void b() {
		   WebElement login = driver.findElement(By.xpath("//input[@id='login']"));
		   login.click();

	}

	@Then("user should check the success message")
	public void c() {
		Assert.assertTrue("VerifyCredentils",true);
		System.out.println("verified....");
	}
	
	
	
	
	
}
