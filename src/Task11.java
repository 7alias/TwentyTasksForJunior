

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;
public class Task11 {
}
Q # 11) Напишите программу на Java, чтобы продемонстрировать явную проверку условий ожидания.
        Ответ:

        В Selenium есть два основных типа ожидания – неявное(Implicit Wait) и явное (Explicit Wait). (Мы не рассматриваем явное (свободное) ожидание в этом примере).
        Неявное ожидание - объявляется один раз в коде вне операции поиска и действует до изменения.  Это ожидание выполняется независимо от какого-либо условия и применяется ко всем последующим операциям поиска неявно. В приведенной ниже программе вы можете видеть применение такого ожидания для Google Chrome.  Мы использовали несколько встроенных методов для установки свойства, максимизации окна, навигации по URL и поиска веб-элементов.

        WebDriverWait waitWD = new WebDriverWait(curentDriver, 20);
        WebElement secondElement = waitWD.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Тестирование программного обеспечения - Википедия")));
        secondElement.click();
        В приведенном выше фрагменте кода вы можете видеть, что мы создали объект waitWD для WebDriverWait, а затем мы выполнили поиск WebElement с именем secondElement.
        Условие установлено таким образом, что веб-драйверу придется ждать, пока мы не увидим ссылку «Тестирование программного обеспечения - Википедия» на веб-странице. Команда не выполнится, если не найдет эту ссылку. Если ссылка будет найдена, то веб-драйвер выполнит щелчок мышью по этой ссылке.





        package Codes;






        // ITVDN.com 10 из ТОП 20 тестовых заданий на интервью для Java разработчика

        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");

        ChromeOptions cOptions = new ChromeOptions();

        cOptions.addArguments("--disable-arguments");

        WebDriver curentDriver = new ChromeDriver();

        curentDriver.manage().window().maximize();

        curentDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        curentDriver.navigate().to("https://www.google.com.ua");

        WebElement curentElement = curentDriver.findElement(By.name("q"));

        curentElement.sendKeys("Testing");

        curentElement.submit();

        WebDriverWait waitWD = new WebDriverWait(curentDriver, 20);



        WebElement secondElement = waitWD.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Тестирование программного обеспечения - Википедия")));

        secondElement.click();

    }

}