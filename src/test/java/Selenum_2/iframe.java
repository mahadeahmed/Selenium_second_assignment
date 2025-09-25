package Selenum_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class iframe {
    public static void main(String[] args) throws InterruptedException {
            WebDriver driver=new FirefoxDriver();
            driver.manage().window().maximize();
            driver.get("https://www.tutorialspoint.com/selenium/practice/frames.php");
            driver.switchTo().frame(0);
            driver.findElement(By.cssSelector("a[title='back to Selenium Tutorial']")).click();
            driver.switchTo().defaultContent();
            String originalwindow = driver.getWindowHandle();
            driver.switchTo().newWindow(WindowType.WINDOW);
            driver.get("https://www.tutorialspoint.com/selenium/practice/new-tab-sample.php");
            Thread.sleep(2000);
            driver.close();
            driver.switchTo().window(originalwindow);
            Thread.sleep(2000);

    }
}
