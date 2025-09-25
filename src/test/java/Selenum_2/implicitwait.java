package Selenum_2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class implicitwait {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//        driver.findElement(By.id("name")).sendKeys("Mahade Ahmed");
//        driver.findElement(By.id("gender")).click();
//        Select sl = new Select(driver.findElement(By.id("state")));
//        sl.selectByVisibleText("Uttar Pradesh");
        //Thread.sleep(2000);
        driver.findElement(By.cssSelector("button[onclick='showAlert()']")).click();
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        System.out.println("Alert message: " + alert.getText()); // Print alert message
        alert.accept(); // Click OK on alert
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button[onclick='myPromp()']")).click();
        Thread.sleep(2000);
        alert.sendKeys("Mahade Ahmed");
        System.out.println("Alert message: " + alert.getText());
        Thread.sleep(2000);
        alert.accept();
        Thread.sleep(2000);
    }

}
