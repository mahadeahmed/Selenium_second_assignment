package Selenum_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TABTEST {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tutorialspoint.com/selenium/practice/browser-windows.php");
        Thread.sleep(2000);
        String originalwindow = driver.getWindowHandle();
        driver.switchTo().newWindow(WindowType.TAB);
        Thread.sleep(2000);
        driver.get("https://www.tutorialspoint.com/selenium/practice/new-tab-sample.php");
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.cssSelector(".row.d-flex.justify-content-center.logindiv.bg-white.rounded")).getText());
        driver.findElement(By.cssSelector("a[title='back to Selenium Tutorial']")).click();
        Thread.sleep(4000);
        driver.close();
        driver.switchTo().window(originalwindow);
        Thread.sleep(2000);

        //For new window
        String originalwindow1 = driver.getWindowHandle();
        driver.switchTo().newWindow(WindowType.WINDOW);
        Thread.sleep(2000);
        driver.get("https://www.tutorialspoint.com/selenium/practice/new-window.php");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("a[title='back to Selenium Tutorial']")).click();
        Thread.sleep(4000);
        driver.switchTo().window(originalwindow);
        driver.quit();
    }
}
