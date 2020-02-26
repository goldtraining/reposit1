import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class myclass {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://google.com");
	  Thread.sleep(3000);
	  driver.quit();
  }
  
  @Test
  public void s() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://walla.co.il");
	  Thread.sleep(3000);
	  driver.quit();
  }
}
