package vin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class vinmyx {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://practice.expandtesting.com/login#google_vignette");
WebElement user=driver.findElement(By.id("//input[@name='username']"));
WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
user.sendKeys("kalyani@gmail.com");
user.sendKeys("12345678");
driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
