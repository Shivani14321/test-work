package com.test1.work;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class frameSwitch {
public static void main(String[] args) {
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://demo.guru99.com/test/guru99home/");  
	    driver.manage().window().maximize();
	    //driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	    /*int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Hello" +size);

	    for(int i=0; i<=size; i++){
		driver.switchTo().frame(i);
		int total=driver.findElements(By.xpath("html/body/a/img")).size();
		System.out.println("total" +total);
	    driver.switchTo().defaultContent();}*/

//Commented the code for finding the index of the element
driver.switchTo().frame(1); //Switching to the frame
System.out.println("********We are switched to the iframe*******");
driver.findElement(By.xpath("html/body/a/img")).click();

//Clicking the element in line with Advertisement
System.out.println("*********We are done***************");
driver.switchTo().defaultContent();
driver.switchTo().parentFrame();


    }
}


