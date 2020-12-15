package testingdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeAutomation {

	public static void main(String[] args) {
		
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ssss\\Desktop\\chromedriver.exe");	
		WebDriver skip = new ChromeDriver();
		skip.manage().window().maximize();
		skip.get("https://www.youtube.com/");
		skip.findElement(By.name("search_query")).sendKeys("Fear of the dark");
		skip.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]/yt-icon")).click();
       skip.findElement(By.xpath("//*[@id=\"video-title\"]")).click();
	}

}
