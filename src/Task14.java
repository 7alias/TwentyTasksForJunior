



import java.awt.AWTException;

import java.awt.Robot;

import java.awt.event.KeyEvent;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;



public class Task14 {
}
//Q # 14) Напишите код для Selenium, чтобы перейти на предыдущую вкладку.
//        Ответ: Мы используем класс Robot. Этот пример является  достаточно важным, потому что, если вы знаете сочетания клавиш, вы можете использовать различную навигацию в браузере и его вкладках.
//        Например, если у вас в Chrome открыто три вкладки, и вы хотите перейти на среднюю вкладку, то вам нужно нажать + 2 на клавиатуре. То же самое можно достичь с помощью кода.
//        Применяйте следующий код (сразу после того, как мы увидим создание экземпляра класса Robot). Мы использовали объект qurentRobot класса Robot, с двумя встроенными методами keyPress(KeyEvenet.VK_ *) и keyRelease(KeyEvenet.VK_ *).


    public static void main(String[] args) {




        // ITVDN.com 14 из ТОП 20 тестовых заданий на интервью для Java разработчика

        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");

        WebDriver curentDriver = new ChromeDriver();

        curentDriver.manage().window().maximize();

        curentDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        curentDriver.get("https://www.google.com");

        WebElement firstElement = curentDriver.findElement(By.name("q"));

        firstElement.sendKeys("software testing help");

        firstElement.sendKeys(Keys.ENTER);

        String str = Keys.chord(Keys.CONTROL,Keys.RETURN);

        curentDriver.findElement(By.partialLinkText("Software Testing Help - A Must Visit Software Testing Portal")).sendKeys(str);

        Robot qurentRobot = new Robot(); // Инициализируем экземпляр класса Robot

        qurentRobot.keyPress(KeyEvent.VK_CONTROL); // применяя класс Robot вы легко можете получить необходимый результат если вы знаете нужные комбинации кнопок

        qurentRobot.keyPress(KeyEvent.VK_2); // тут мы нажимаем ctrl+2

        qurentRobot.keyRelease(KeyEvent.VK_CONTROL); // как только мы нажмем и отпустим ctrl+2, мы перейдем на вторую вкладку.

        qurentRobot.keyRelease(KeyEvent.VK_2); //если вы хотите снова вернуться к первой вкладке нажмите и отпустите vk_1

    }

}