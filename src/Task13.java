import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;


public class Task13 implements Runnable {
    @Override
    public void run() {


//Q # 13) Напишите программу на Java, чтобы открыть все ссылки на gmail.com.
//        Ответ:
//        Это типичный пример применения улучшенного цикла for, который мы видели в наших предыдущих примерах.
//        После того, как вы открыли веб-сайт, такой как Gmail, используя get() или navigate().to(), вы можете использовать локатор tagName, чтобы получить все ссылки на веб-сайте, имеющие одинаковые теги.
//        У нас есть улучшенный цикл for, в котором мы обходим все найденные ссылки по нашему тегу.  Для каждой ссылки типа WebElement в нашем листе ссылок, мы получаем сами ссылки через getAttribute(«href») и тексты через getText().

        // ITVDN.com 13 из ТОП 20 тестовых заданий на интервью для Java разработчика


        System.setProperty("webdriver.chrome.drive", "C:\\driver\\chromedriver.exe");

        WebDriver curentDriver = new ChromeDriver();

        curentDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        curentDriver.manage().window().maximize();

        curentDriver.get("https://www.gmail.com/");

        java.util.List<WebElement> linkList = curentDriver.findElements(By.tagName("a"));

        System.out.println(linkList.size());


        for (WebElement thisLink : linkList) {


            //выводим на экран ссылку http://google.com или https://www.gmail.com

            System.out.println(qurentLink.getAttribute("href"));


            //выводим на экран текст ссылки

            System.out.println(qurentLink.getText());

        }

    }

}