import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.sql.DriverManager;
import java.util.List;

public class Homeworks {

    WebDriver wd;

   @BeforeClass
    public void setUp(){

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        wd = new ChromeDriver(options);
        wd.get("https://telranedu.web.app/login");
    }



    @Test
    public void cssLocators(){

        //by tag name
        WebElement el1 = wd.findElement(By.tagName("html"));
        WebElement element1 = wd.findElement(By.cssSelector("html"));
        WebElement elem1 = wd.findElement(By.xpath("//html"));
        WebElement el2 = wd.findElement(By.tagName("head"));
        WebElement element2 = wd.findElement(By.cssSelector("head"));
        WebElement elem2 = wd.findElement(By.xpath("//head"));
        WebElement el3 = wd.findElement(By.tagName("meta"));
        WebElement element3 = wd.findElement(By.cssSelector("meta"));
        WebElement elem3 = wd.findElement(By.xpath("//meta"));
        WebElement el4 = wd.findElement(By.tagName("link"));
        WebElement element4 = wd.findElement(By.cssSelector("link"));
        WebElement elem4 = wd.findElement(By.xpath("//link"));
        WebElement el5 = wd.findElement(By.tagName("title"));
        WebElement element5 = wd.findElement(By.cssSelector("title"));
        WebElement elem5 = wd.findElement(By.xpath("//title"));
        WebElement el6 = wd.findElement(By.tagName("body"));
        WebElement element6 = wd.findElement(By.cssSelector("body"));
        WebElement elem6 = wd.findElement(By.xpath("//body"));
        WebElement el7 = wd.findElement(By.tagName("div"));
        WebElement element7 = wd.findElement(By.cssSelector("div"));
        WebElement elem7 = wd.findElement(By.xpath("//div"));
        WebElement el8 = wd.findElement(By.tagName("h1"));
        WebElement element8 = wd.findElement(By.cssSelector("h1"));
        WebElement elem8 = wd.findElement(By.xpath("//h1"));
        WebElement el9 = wd.findElement(By.tagName("a"));
        WebElement element9 = wd.findElement(By.cssSelector("a"));
        WebElement elem9 = wd.findElement(By.xpath("//a"));
        WebElement el10 = wd.findElement(By.tagName("form"));
        WebElement element10 = wd.findElement(By.cssSelector("form"));
        WebElement elem10 = wd.findElement(By.xpath("//form"));
        WebElement el11 = wd.findElement(By.tagName("input"));
        WebElement element11 = wd.findElement(By.cssSelector("input"));
        WebElement elem11 = wd.findElement(By.xpath("//input"));
        WebElement el12= wd.findElement(By.tagName("br"));
        WebElement element12 = wd.findElement(By.cssSelector("br"));
        WebElement elem12 = wd.findElement(By.xpath("//br"));
        WebElement el13 = wd.findElement(By.tagName("button"));
        WebElement element13 = wd.findElement(By.cssSelector("button"));
        WebElement elem13 = wd.findElement(By.xpath("//button"));
        WebElement el14 = wd.findElement(By.tagName("script"));
        WebElement element14 = wd.findElement(By.cssSelector("script"));
        WebElement elem14 = wd.findElement(By.xpath("//script"));
        List<WebElement> listEl1 = wd.findElements(By.tagName("meta"));
        List<WebElement> listElements1 = wd.findElements((By.cssSelector("meta")));
        List<WebElement> listElem1 = wd.findElements(By.xpath("//meta"));
        List<WebElement> listEl2 = wd.findElements(By.tagName("link"));
        List<WebElement> listElements2 = wd.findElements((By.cssSelector("link")));
        List<WebElement> listElem2 = wd.findElements(By.xpath("//link"));
        List<WebElement> listEl3 = wd.findElements(By.tagName("div"));
        List<WebElement> listElements3 = wd.findElements((By.cssSelector("div")));
        List<WebElement> listElem3 = wd.findElements(By.xpath("//div"));
        List<WebElement> listEl4 = wd.findElements(By.tagName("input"));
        List<WebElement> listElements4 = wd.findElements((By.cssSelector("input")));
        List<WebElement> listElem4 = wd.findElements(By.xpath("//input"));
        List<WebElement> listEl5 = wd.findElements(By.tagName("button"));
        List<WebElement> listElements5 = wd.findElements((By.cssSelector("button")));
        List<WebElement> listElem5 = wd.findElements(By.xpath("//button"));

        //by class
        WebElement cl1 = wd.findElement(By.className("container"));
        WebElement class1 = wd.findElement(By.cssSelector(".container"));
        WebElement classElem1 = wd.findElement(By.xpath("//*[@class='container']"));
        WebElement cl2 = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement class2 = wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));
        WebElement classElem2 = wd.findElement(By.xpath("//*[@class='navbar-component_nav__1X_4m']"));
        WebElement cl3 = wd.findElement(By.className("active"));
        WebElement class3 = wd.findElement(By.cssSelector(".active"));
        WebElement classElem3 = wd.findElement(By.xpath("//*[@class='active']"));
        WebElement cl4 = wd.findElement(By.className("login_login__3EHKB"));
        WebElement class4 = wd.findElement(By.cssSelector(".login_login__3EHKB"));
        WebElement classElem4 = wd.findElement(By.xpath("//*[@class='login_login__3EHKB']"));

        //by id
        WebElement nav = wd.findElement(By.id("root"));
        WebElement nav1 = wd.findElement(By.cssSelector("#root"));
        WebElement navEl1 = wd.findElement(By.xpath("//*[@id='root']"));

        //by attribute
        WebElement divElm = wd.findElement(By.cssSelector("[name='email'"));
        WebElement inputEmail = wd.findElement(By.cssSelector("[placeholder='Email']"));
        WebElement divElem = wd.findElement(By.xpath("//*[@placeholder='Email']"));

        //one of elements find by attribute ===> start & end & contains value
        WebElement divElStart = wd.findElement(By.cssSelector("[placeholder ^='Em']"));
        WebElement divElStart1 = wd.findElement(By.xpath("//*[starts-with(@placeholder, 'Em')]"));
        WebElement divElEnd = wd.findElement(By.cssSelector("[placeholder $='il']"));
        WebElement divElContains = wd.findElement(By.cssSelector("[placeholder *='mai']"));
        WebElement divElContains1 = wd.findElement(By.xpath("//*[contains(@placeholder, 'ai')]"));

    }
}
