package Myseleniumproject.Myseleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Vivarsh\\Downloads\\chromedriver_91\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
    	//driver.get("http://34.134.190.135:8004/index.php");
        driver.get("http://localhost:8082/addressbook/");
    	//System.out.println(driver.getTitle());
    	Thread.sleep(2000);
    	Thread.sleep(2000);
    	 //driver.findElement(By.xpath("//*[@id='About Us']")).click();	
    	//String exp = driver.findElement(By.cssSelector("p")).getText();
    	// String exp = driver.findElement(By.cssSelector("p")).getText();
    	
    	//"//*[@id='mp-tfa']/p"

    	 //String body = driver.findElement(By.tagName("body")).getText();
    	//  String title1 = driver.findElement(By.xpath("//*[@id=\"PID-ab2-pg\"]")).getText();
    	 // String title2 = driver.findElement(By.xpath("/html/body/p[2]")).getText();
    	  //String Expected = "This is about page. Lorem Ipsum Dipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum." ;
    	   
    			  //It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).";
    			   		  
    	  //System.out.println(exp);
    	  System.out.println("-------------------------------------------------------------------------");
    	  //System.out.println(body);
    	  //if (Expected.equalsIgnoreCase(body))
          //{
          	//System.out.println("Success");
          	
          //}
          //else
          //{
          	//System.out.println("Failed");
          //} driver.close();
    	 
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.className("v-button")).click();
		driver.findElement(By.id("gwt-uid-5")).sendKeys("Vivarsh");
		driver.findElement(By.id("gwt-uid-7")).sendKeys("Devops");
		driver.findElement(By.id("gwt-uid-9")).sendKeys("123456789");
		driver.findElement(By.id("gwt-uid-11")).sendKeys("abc@edureka.com");
		driver.findElement(By.id("gwt-uid-13")).sendKeys("01/02/2020");
		driver.findElement(By.className("v-button-primary")).click();
    }
}
