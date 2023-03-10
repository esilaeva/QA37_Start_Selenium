import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class HomeworkFireFox {

    WebDriver wd;

    @BeforeClass
    public void setUp() {
        wd = new FirefoxDriver();
        wd.get("https://telranedu.web.app/login");
    }

    @Test
    public void cssLocators() {

        //by tag name
        WebElement el1 = wd.findElement(By.tagName("html"));
        WebElement element1 = wd.findElement(By.cssSelector("html"));
        WebElement xElem1 = wd.findElement(By.xpath("//html"));
        WebElement el2 = wd.findElement(By.tagName("head"));
        WebElement element2 = wd.findElement(By.cssSelector("head"));
        WebElement xElem2 = wd.findElement(By.xpath("//head"));
        WebElement el3 = wd.findElement(By.tagName("meta"));
        WebElement element3 = wd.findElement(By.cssSelector("meta"));
        WebElement xElem3 = wd.findElement(By.xpath("//meta"));
        WebElement el4 = wd.findElement(By.tagName("link"));
        WebElement element4 = wd.findElement(By.cssSelector("link"));
        WebElement xElem4 = wd.findElement(By.xpath("//link"));
        WebElement el5 = wd.findElement(By.tagName("title"));
        WebElement element5 = wd.findElement(By.cssSelector("title"));
        WebElement xElem5 = wd.findElement(By.xpath("//title"));
        WebElement el6 = wd.findElement(By.tagName("body"));
        WebElement element6 = wd.findElement(By.cssSelector("body"));
        WebElement xElem6 = wd.findElement(By.xpath("//body"));
        WebElement el7 = wd.findElement(By.tagName("div"));
        WebElement element7 = wd.findElement(By.cssSelector("div"));
        WebElement xElem7 = wd.findElement(By.xpath("//div"));
        WebElement el8 = wd.findElement(By.tagName("h1"));
        WebElement element8 = wd.findElement(By.cssSelector("h1"));
        WebElement xElem8 = wd.findElement(By.xpath("//h1"));
        WebElement el9 = wd.findElement(By.tagName("a"));
        WebElement element9 = wd.findElement(By.cssSelector("a"));
        WebElement xElem9 = wd.findElement(By.xpath("//a"));
        WebElement el10 = wd.findElement(By.tagName("form"));
        WebElement element10 = wd.findElement(By.cssSelector("form"));
        WebElement xElem10 = wd.findElement(By.xpath("//form"));
        WebElement el11 = wd.findElement(By.tagName("input"));
        WebElement element11 = wd.findElement(By.cssSelector("input"));
        WebElement xElem11 = wd.findElement(By.xpath("//input"));
        WebElement el12 = wd.findElement(By.tagName("br"));
        WebElement element12 = wd.findElement(By.cssSelector("br"));
        WebElement xElem12 = wd.findElement(By.xpath("//br"));
        WebElement el13 = wd.findElement(By.tagName("button"));
        WebElement element13 = wd.findElement(By.cssSelector("button"));
        WebElement xElem13 = wd.findElement(By.xpath("//button"));
        WebElement el14 = wd.findElement(By.tagName("script"));
        WebElement element14 = wd.findElement(By.cssSelector("script"));
        WebElement xElem14 = wd.findElement(By.xpath("//script"));
        List<WebElement> listEl1 = wd.findElements(By.tagName("meta"));
        List<WebElement> listElements1 = wd.findElements((By.cssSelector("meta")));
        List<WebElement> xListEl1 = wd.findElements(By.xpath("//meta"));
        List<WebElement> listEl2 = wd.findElements(By.tagName("link"));
        List<WebElement> listElements2 = wd.findElements((By.cssSelector("link")));
        List<WebElement> xListEl2 = wd.findElements(By.xpath("//link"));
        List<WebElement> listEl3 = wd.findElements(By.tagName("div"));
        List<WebElement> listElements3 = wd.findElements((By.cssSelector("div")));
        List<WebElement> xListEl3 = wd.findElements(By.xpath("//div"));
        List<WebElement> listEl4 = wd.findElements(By.tagName("input"));
        List<WebElement> listElements4 = wd.findElements((By.cssSelector("input")));
        List<WebElement> xListEl4 = wd.findElements(By.xpath("//input"));
        List<WebElement> listEl5 = wd.findElements(By.tagName("button"));
        List<WebElement> listElements5 = wd.findElements((By.cssSelector("button")));
        List<WebElement> xListEl5 = wd.findElements(By.xpath("//button"));

        //by class
        WebElement cl1 = wd.findElement(By.className("container"));
        WebElement class1 = wd.findElement(By.cssSelector(".container"));
        WebElement xClassElem1 = wd.findElement(By.xpath("//*[@class='container']"));
        WebElement cl2 = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement class2 = wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));
        WebElement xClassElem2 = wd.findElement(By.xpath("//*[@class='navbar-component_nav__1X_4m']"));
        WebElement cl3 = wd.findElement(By.className("active"));
        WebElement class3 = wd.findElement(By.cssSelector(".active"));
        WebElement xClassElem3 = wd.findElement(By.xpath("//*[@class='active']"));
        WebElement cl4 = wd.findElement(By.className("login_login__3EHKB"));
        WebElement class4 = wd.findElement(By.cssSelector(".login_login__3EHKB"));
        WebElement xClassElem4 = wd.findElement(By.xpath("//*[@class='login_login__3EHKB']"));

        //by id
        WebElement nav = wd.findElement(By.id("root"));
        WebElement nav1 = wd.findElement(By.cssSelector("#root"));
        WebElement xNav1 = wd.findElement(By.xpath("//*[@id='root']"));

        //by attribute
        WebElement divElem = wd.findElement(By.cssSelector("[name='email'"));
        WebElement inputEmail = wd.findElement(By.cssSelector("[placeholder='Email']"));
        WebElement xDivElem = wd.findElement(By.xpath("//*[@placeholder='Email']"));

        //one of elements find by attribute ===> start & end & contains value
        WebElement divElStart = wd.findElement(By.cssSelector("[placeholder ^='Em']"));
        WebElement divElStart1 = wd.findElement(By.xpath("//*[starts-with(@placeholder, 'Em')]"));
        WebElement xDivElEnd = wd.findElement(By.cssSelector("[placeholder $='il']"));
        WebElement divElContains = wd.findElement(By.cssSelector("[placeholder *='mai']"));
        WebElement xDivElContains = wd.findElement(By.xpath("//*[contains(@placeholder, 'ai')]"));

    }
}