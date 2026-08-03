package start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomeWork2
{
    WebDriver driver = new ChromeDriver();

    @Test
    public void ilCarroXpath()
    {
        driver.get("https://ilcarro.web.app/");
        driver.manage().window().maximize();
        pause(2000);

        WebElement linkSignUp = driver.findElement(By.xpath("//a[text()='Sign up']"));
        linkSignUp.click();
        pause(2000);

        WebElement inputName = driver.findElement(By.xpath("//input[@formcontrolname='firstName']"));
        inputName.sendKeys("Nastia");
        pause(2000);

        WebElement inputLastName = driver.findElement(By.xpath("//input[@autocomplete='family-name']"));
        inputLastName.sendKeys("Maliutin");
        pause(2000);

        WebElement inputEmail = driver.findElement(By.xpath("//input[@autocomplete='email']"));
        inputEmail.sendKeys("email@gmail.com");
        pause(2000);

        WebElement inputPassword = driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
        inputPassword.sendKeys("Qwerty123!");
        pause(2000);

        WebElement linkLetTheCar = driver.findElement(By.xpath("//a[@id='1']"));
        linkLetTheCar.click();
        pause(2000);

        WebElement inputModel = driver.findElement(By.xpath("//input[@id='model']"));
        inputModel.sendKeys("BMW");
        pause(2000);

        WebElement inputYear = driver.findElement(By.xpath("//input[@formcontrolname='year']"));
        inputYear.sendKeys("2024");
        pause(2000);

        WebElement buttonSabmit = driver.findElement(By.xpath("//button[@type='submit']"));
        buttonSabmit.click();
        System.out.println(buttonSabmit.getTagName());
        pause(2000);

        WebElement linkTermsOfUse = driver.findElement(By.xpath("//a[@href='/terms-of-use']"));
        linkTermsOfUse.click();
        pause(2000);

        WebElement privacyPolicy = driver.findElement(By.xpath("//a[text()='Privacy Policy']"));
        privacyPolicy.click();
        pause(2000);

        WebElement titleChIn = driver.findElement(By.xpath("//h2[text()=\"Children's Information\"]"));
        System.out.println(titleChIn.getText());
        pause(2000);

        WebElement linkSearch = driver.findElement(By.xpath("//a[@href='/search']"));
        linkSearch.click();
        pause(2000);

        WebElement inputCity = driver.findElement(By.xpath("//input[@id='city']"));
        inputCity.sendKeys("Holon");
        pause(2000);

        WebElement buttonOk = driver.findElement(By.xpath("//button[text()='OK']"));
        buttonOk.click();
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
