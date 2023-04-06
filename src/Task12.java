
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebElement;






public class Task12 {

//Q # 12) Напишите Java-программу для демонстрации прокрутки вверх / вниз.
//        Ответ:
//
//        Все строки кодов легко соотносятся с кодом из предыдущего примера.
//        В код этой программы мы включили JavascriptExecutor jscript, который будет выполнять прокрутку. На последней строке кода мы передаём window.scrollBy(argument1, argument2).
//        Если нам нужно выполнить прокрутку вверх, тогда передаем некоторое значение в argument1, если нам нужно прокрутить вниз - передаем некоторое значение в argument2.




        // ITVDN.com 12 из ТОП 20 тестовых заданий на интервью для Java разработчика

        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");

        WebDriver qurentDriver = new ChromeDriver();

        JavascriptExecutor jscript = (JavascriptExecutor) qurentDriver;

        qurentDriver.manage().window().maximize();

        qurentDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        qurentDriver.get("https://www.google.com.ua");

        WebElement qurentElement = qurentDriver.findElement(By.name("q"));

        qurentElement.sendKeys("SoftwareTestingHelp");

        qurentElement.sendKeys(Keys.ENTER);

        jscript.executeScript("window.scrollBy(0,900)");



    }



}