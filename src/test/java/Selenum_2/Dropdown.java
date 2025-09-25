package Selenum_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        driver.findElement(By.id("name")).sendKeys("Mahade Ahmed");
        driver.findElement(By.id("gender")).click();
        //WebElement date_input = driver.findElement(By.id("dob"));
        //date_input.click();
        //driver.findElement(By.cssSelector("#body > main:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > form:nth-child(1) > div:nth-child(4) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)")).click();
        Select s1 = new Select(driver.findElement(By.id("state")));
        s1.selectByIndex(4);
        Thread.sleep(2000);
        s1.selectByValue("Uttar Pradesh");
        Thread.sleep(2000);
        s1.selectByVisibleText("NCR");
        Thread.sleep(2000);
        Select s2 = new Select(driver.findElement(By.id("city")));
        s2.selectByIndex(1);
        Thread.sleep(2000);
//        List<WebElement>elements = s1.getOptions();
//        for(WebElement sl : elements)
//        {
//            System.out.println(sl.getText());
//        }




    }
}
