import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class Index {
    WebDriver wd;


    @BeforeClass
    public void setUp(){
        wd = new ChromeDriver();
        wd.get("file:///Users/aleksandr/Desktop/QA/21.index2.html");

    }

@Test
    public void cssLocators(){
        //by  tag name

    WebElement el = wd.findElement(By.tagName("button"));
    WebElement el1 = wd.findElement(By.cssSelector("button"));
    WebElement el2 = wd.findElement(By.tagName("a"));
    WebElement el3 = wd.findElement(By.cssSelector("a"));
    List<WebElement> list = wd.findElements(By.tagName("a"));
    int i = list.size();
    }

    // by class

    WebElement el4 = wd.findElement(By.className("container"));
    WebElement el5 = wd.findElement(By.cssSelector(".container"));
    WebElement el6 = wd.findElement(By.className("nav-item"));
    WebElement el7 = wd.findElement((By.cssSelector(".nav-item")));

    //by id

    WebElement el8 = wd.findElement(By.id("nav"));
    WebElement el9 = wd.findElement(By.cssSelector("#nav"));

    //by attribute

    WebElement el10 = wd.findElement(By.cssSelector("[class='container']"));
}
