package start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class HomeWork1 {
    WebDriver driver = new ChromeDriver();

    @Test
    public void PhoneBook1()
    {
        driver.get("https://telranedu.web.app/");
        driver.manage().window().maximize();
        pause(2000);

        WebElement linkLogin = driver.findElement(By.linkText("LOGIN"));
        linkLogin.click();
        pause(2000);

        WebElement pageLogin = driver.findElement(By.className("login_login__3EHKB"));
        System.out.println(pageLogin.getText());
        pause(2000);

        WebElement inputEmail = driver.findElement(By.cssSelector("input[name='email']"));
        inputEmail.click();
        pause(2000);

        WebElement inputPassword = driver.findElement(By.cssSelector("input[name='password']"));
        inputPassword.click();
        pause(2000);

        WebElement btnRegistration = driver.findElement(By.name("registration"));
        System.out.println(btnRegistration.getTagName());
        pause(2000);

        WebElement linkAbout = driver.findElement(By.cssSelector("div.navbar-component_nav__1X_4m a:nth-child(3)"));
        linkAbout.click();
        pause(2000);

        WebElement linkHome = driver.findElement(By.partialLinkText("HO"));
        linkHome.click();
        pause(2000);

        WebElement linkLogin1 = driver.findElement(By.cssSelector("div.navbar-component_nav__1X_4m a:last-child"));
        linkLogin1.click();
        pause(2000);

        WebElement btnLogin = driver.findElement(By.cssSelector("div.login_login__3EHKB button[name='login']"));
        System.out.println(btnLogin.getTagName());
        pause(2000);

        WebElement linkAbout1 = driver.findElement(By.linkText("ABOUT"));
        linkAbout1.click();
        pause(2000);

        driver.quit();
    }

    @Test
    public void ilCarro1()
    {
        driver.get("https://ilcarro.web.app//");
        driver.manage().window().maximize();
        pause(2000);

        WebElement divSearch = driver.findElement(By.className("search-container"));
        System.out.println(divSearch.getText());
        pause(2000);

        WebElement inputCity = driver.findElement(By.id("city"));
        inputCity.click();
        pause(2000);

        WebElement linkSignUp = driver.findElement(By.partialLinkText("up"));
        linkSignUp.click();
        pause(2000);

        WebElement inputFirstName = driver.findElement(By.cssSelector("input[autocomplete='name']"));
        inputFirstName.click();
        pause(2000);

        WebElement inputLastName = driver.findElement(By.cssSelector("div.input-container input[autocomplete='family-name']"));
        inputLastName.click();
        pause(2000);

        WebElement inputEmail = driver.findElement(By.cssSelector("*[autocomplete='email']"));
        inputEmail.click();
        pause(2000);

        WebElement inputPassword = driver.findElement(By.cssSelector("div.input-container input[autocomplete='new-password']"));
        inputPassword.click();
        pause(2000);

        WebElement linkLetCarWork = driver.findElement(By.cssSelector("a.navigation-link:nth-child(3)"));
        linkLetCarWork.click();
        pause(2000);

        WebElement linkSearch = driver.findElement(By.linkText("Search"));
        linkSearch.click();
        pause(2000);

        WebElement inputDates = driver.findElement(By.id("dates"));
        inputDates.click();
        pause(2000);

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
