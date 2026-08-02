package start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

public class SelectorsXpath {
    WebDriver driver = new ChromeDriver();

    @Test
    public void phoneBookXpathTest(){
        driver.get("https://telranedu.web.app/home");
        driver.manage().window().maximize();
        pause(2000);

        WebElement btnAbout = driver.findElement(By.xpath("//a[@href='/about']"));
        btnAbout.click();
        pause(2000);
        System.out.println(btnAbout.isEnabled());
        System.out.println(btnAbout.isDisplayed());

        WebElement btnLogin = driver.findElement(By.xpath("//*[text() = 'LOGIN']"));
        btnLogin.click();
        pause(2000);

        WebElement inputEmail = driver.findElement(By.xpath("//div/form/input[contains(@name, 'em')]"));
        inputEmail.sendKeys("email@gmail.com");
        WebElement inputPassword = driver.findElement(By.xpath("//div/form/input[last()]"));
        inputPassword.sendKeys("Qwerty123!");
        pause(2000);

        List<WebElement> buttons = driver.findElements(By.xpath("//button"));
        System.out.println(buttons);
        System.out.println(buttons.get(0).getText());
        pause(2000);
        buttons.get(1).click();
        pause(2000);

        driver.quit();
    }

    @Test
    public void ilCarroXPathTest()
    {
        driver.get("https://ilcarro.web.app/registration?url=%2Fsearch");
        driver.manage().window().maximize();
        pause(3000);
//        WebElement inputFirstName = driver.findElement(By.className("ng-pristine"));
//        inputFirstName.sendKeys("Sveta");

//        WebElement el1 = driver.findElement(By.cssSelector("[formcontrolname='firstName']"));
//        WebElement el2 = driver.findElement(By.xpath("//*[@formcontrolname='firstName']"));
//        WebElement el3 = driver.findElement(By.cssSelector("[formcontrolname='first']"));
//        WebElement el4 = driver.findElement(By.xpath("//*[starts-with(@formcontrolname,'first')]"));
//        WebElement el5 = driver.findElement(By.xpath("//input[@formcontrolname='firstName']"));
//        pause(2000);
        WebElement el6 = driver.findElement(By.xpath("//input[@id='name']/../../../../h2"));
        System.out.println(el6.getText());

        driver.quit();
    }

    public void pause(int time)
    {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
