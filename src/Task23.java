import java.util.Scanner;

public class Task23 implements Runnable {

    @Override
    public void run() {
//        Способ 3:
//        Это способ почти такой же, как способ 2, но здесь мы не используем метод split(). Мы используем класс Scanner и метод nextLine() для чтения входящей строки. Затем мы объявили целочисленную переменную stringLength, присваивая ей значение длины входящей строки.
//                После этого мы вывели строку в обратном порядке, используя цикл for. Однако мы использовали метод charAt(index), который будет возвращать символ по конкретному индексу. После каждой итерации символ будет добавлен в новую строку для получения перевернутого значения строковой переменной.
//                Затем, мы выводим переменную перевернутой строки.

        // ITVDN.com 2 из ТОП 20 тестовых заданий на интервью для Java разработчика

        String mainString, reverseString = "";

        System.out.println("Введите нужную строку, чтобы получить перевернутую:");

        Scanner scannerQ = new Scanner(System.in);

        mainString = scannerQ.nextLine();

        int stringLength = mainString.length();

        for (int x = stringLength - 1; x >= 0; x--) {

            reverseString = reverseString + mainString.charAt(x);   //используем встроенный метод charAt() чтобы перевернуть строку

        }

        System.out.println(reverseString);

    }

}

