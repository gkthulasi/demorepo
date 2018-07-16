package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.Set;


//import com.gargoylesoftware.htmlunit.javascript.host.Set;

public class searchiteam {
	@Test
	public void setup() throws Exception {
		
						//set the path
						System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
						//create instance of driver
					    WebDriver driver =new ChromeDriver();
					   // navigating to url
					   driver.navigate().to("https://www.flipkart.com");
					    //maximize the browser
					    driver.manage().window().maximize();
					   //enter number
					  driver.findElement(By.xpath("//input[@type='text' and @class='_2zrpKA']")).sendKeys("9912344754");
					  	//enter password
					  driver.findElement(By.xpath("//input[@type='password' and @class='_2zrpKA _3v41xv']")).sendKeys("valimeera");
					  //click on login
					  driver.findElement(By.xpath("//button[@type='submit' and @class='_2AkmmA _1LctnI _7UHT_c']")).click();
					  Thread.sleep(5000);
					  //select search field then enter bajaj ironbox
					  driver.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[1]/div/div/div/div[1]/form/div/div[1]/div/input")).sendKeys("bajaj ironbox");
					  //click on search
					  driver.findElement(By.xpath("//*[@id=\"container\"]/div/header/div[1]/div/div/div/div[1]/form/div/div[2]")).click();
					  Thread.sleep(4000);
					  //click on high to low
					  driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[2]/div[1]/div[2]/div[1]/div/div[2]/div[4]"));
					  //driver.findElement(By.xpath("//[@id=\"container\"]/div/div[1]/div/div[2]/div[1]/div[2]/div[1]/div/div[2]/div[4]")).click();
					  Thread.sleep(4000);
					  //handling parent window
					  String parent= driver.getWindowHandle();
					  System.out.println("parent window id id"+ parent);
					 
					   //click on product ironbox
					  driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[2]/div[1]/div[2]/div[2]/div/div[1]/div/a[2]")).click();
					  Thread.sleep(3000);
					  String s=driver.getCurrentUrl();
						 System.out.println(s);
						 
						 //handling all child window
						 Set<String> allwindows =driver.getWindowHandles();
						 int count=allwindows.size();
						  System.out.println("all windows size is"+ count);
						  for(String child:allwindows) {
							  
							  if(!parent.equalsIgnoreCase(child)) {
								  
								  driver.switchTo().window(child);
								  //click on add to cart
								  driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div[1]/div/div[1]/div[2]/ul/li[1]/button")).click();
								  Thread.sleep(3000);
								  driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div[1]/div/div[3]/div/div/form/button/span")).click();
								 // driver.findElement(By.xpath("//*[@id=\"to-payment\"]/button")).click();
							  }
							//*[@id="container"]/div/div[1]/div/div/div[1]/div/div[1]/div[2]/ul/li[1]/button
							//*[@id="container"]/div/div[1]/div/div[1]/div/div[3]/div/div/form/button/span
						  }
						  
						  
						  
						driver.close();
					

					 
					  
					}
					
					
					

			}
				
				
				
				
				
				
				
				
				
				
				
				