import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.lang.annotation.Target;
import java.util.*;

public class Index {

    WebDriver wd;

    @BeforeClass
    public void setUp(){
        wd = new ChromeDriver();
        wd.navigate().to("file:///C:/Users/97253/Documents/QA/QA/index.html");
    }

    @Test
    public void cssLocators(){
        //by tag name
        WebElement el = wd.findElement(By.tagName("button"));
        WebElement element = wd.findElement(By.cssSelector("button"));
        List<WebElement> list = wd.findElements(By.tagName("a"));
        List<WebElement> list1 = wd.findElements((By.cssSelector("a")));

        //by class
        WebElement divcontainer = wd.findElement(By.className("container"));
        WebElement divcontainer1 = wd.findElement(By.cssSelector(".container"));
        List<WebElement> navlist = wd.findElements(By.className("nav-item"));
        List<WebElement> navlist1 = wd.findElements(By.cssSelector(".nav-item"));

        //by id
        WebElement nav = wd.findElement(By.id("nav"));
        WebElement nav1 = wd.findElement(By.cssSelector("#nav"));

        //by attribute
        WebElement divElm = wd.findElement(By.cssSelector("[class='container'"));
        WebElement inputEmail = wd.findElement(By.cssSelector("[placeholder='Type your name']"));

        //start
        wd.findElement(By.cssSelector("[placeholder ^='Type']"));
        //end
        wd.findElement(By.cssSelector("[placeholder $='Type']"));
        //contains
        wd.findElement(By.cssSelector("[placeholder *='Type']"));

    }





}
