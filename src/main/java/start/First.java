package start;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class First
{
    WebDriver driver = new ChromeDriver();


    @Test
    public void firstTest() {
        driver.manage().window().maximize();                // открыть окно в полном размере

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        //    максимальное время ожидания полной загрузки страницы.

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //    ожидание появления элементов на странице.
        pause(3000);

        driver.get("https://telranedu.web.app/home");        // открыть сайт
        WebElement btnAbout = driver.findElement(By.cssSelector("a[href='/about']"));
        btnAbout.click();

        //    driver.navigate().to("https://telranedu.web.app/home");
        //    driver.get("https://telranedu.web.app/about");      // открыть сайт на определенной вкладке
        pause(3000);

        driver.navigate().back();       // вернуть на предыдущую страницу назад (стрелка вперед)
        pause(3000);

        WebElement btnLogin = driver.findElement(By.cssSelector("a[href='/login']"));
        btnLogin.click();
        //    driver.navigate().forward();     // переход на следующую страницу (стрелка назад)
        pause(3000);

        WebElement btnHome = driver.findElement(By.cssSelector("*[href='/home']"));
        // * - любой элемент, a - только ссылка, href="/home" - адрес, куда ведёт ссылка

        // a[href='/home']
        // [href='/home']
        btnHome.click();

        driver.navigate().refresh();     // обновление страницы
        WebElement divRoot = driver.findElement(By.cssSelector("div[id='root']"));
        // By.cssSelector - найди тег div с id root.
        // div — это HTML-тег

        // #root - короткая запись
        // [id='root'] - элемент, у которого id равен root
        // * [id='root']
        System.out.println(divRoot.getTagName());  // получает название HTML-тега
        System.out.println(divRoot.getAttribute("class")); // получает значение атрибута

        WebElement divRoot1 = driver.findElement(By.id("root")); // поиск по id
        System.out.println(divRoot1.getTagName());

        WebElement divRoot2 = driver.findElement(By.className("container"));
        System.out.println(divRoot2.getAttribute("id")); // поиск по class
        pause(3000);

        driver.close();                  //  закрыть окно (крестик на окне)
        pause(3000);

        driver.quit();                   //  закрыть браузер полностью
    }

    @Test
    public void ilCarroTest(){
        driver.get("https://ilcarro.web.app/search");
        driver.manage().window().maximize();
        pause(3000);

        WebElement linkSearch = driver.findElement(By.cssSelector(".navigation-link"));
        // a[class='navigation-link']
        // a.navigation-link
        // *[class='navigation-link']
        // [class='navigation-link']
        // a[id='0']
        // #0
        // a#0.navigation-link
        // a#0.navigation-link[href='/search']
        linkSearch.click();
        pause(3000);

        WebElement linkTerms = driver.findElement(By.cssSelector("a.navigation-link[href='/terms-of-use']"));
        // ссылка + нужный класс + нужный адрес

        //[href='/terms-of-use']
        //a[href*='of-use'] включает в себя
        //a[href^='/terms'] начинается
        //a[href$='-use'] заканчивается
        linkTerms.click();
        pause(3000);

        WebElement linkSignUp = driver.findElement(By.cssSelector("div.header a.navigation-link:nth-child(5)"));
        // Найди пятую ссылку с классом navigation-link, которая находится внутри div с классом header
        linkSignUp.click();
        pause(3000);

        WebElement linkLogin = driver.findElement(By.cssSelector("div.header a.navigation-link:last-child"));
        linkLogin.click();
        pause(3000);

        WebElement logo = driver.findElement(By.cssSelector("div.header a:first-child"));
        // последний ребёнок внутри родителя.
        logo.click();
        pause(3000);

        WebElement linkLetTheCar = driver.findElement(By.linkText("Let the car work"));
        // поиск ссылки по её тексту
        linkLetTheCar.click();
        pause(3000);

        driver.navigate().back();
        pause(3000);

        WebElement linkLetTheCar1 = driver.findElement(By.partialLinkText("work"));
        // поиск ссылки, где есть слово
        linkLetTheCar1.click();
        pause(3000);

            driver.quit();
    }


    public void pause(int time)           // используется для искусственной паузы (время ожидания)
    {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
