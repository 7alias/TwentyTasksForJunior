import java.util.Scanner;

public class Task8 implements Runnable {
    @Override
    public void run() {


//    Q # 8) Напишите Java-программу, чтобы определить, является ли строка или число палиндромом, или нет.
//    Ответ:
//    Чтобы проверить, является ли число или строка палиндромом или нет,
//    вы можете использовать любую переворачивающую строки программу, из описанных выше,.
//    Что вам нужно сделать, так это добавить один оператор if-else.
//    Если исходная строка равна перевернутой строке, то число является палиндромом, в противном случае - нет.
        // ITVDN.com ТОП 20 тестовых заданий на интервью для Java разработчика

        String inputString, reversedString = "";

        Scanner scannerQ = new Scanner(System.in);

        int stringLength;

        System.out.println("Введите число или строку");

        inputString = scannerQ.nextLine();

        stringLength = inputString.length();

        for (int x = stringLength - 1; x >= 0; x--) {

            reversedString = reversedString + inputString.charAt(x);

        }

        System.out.println("перевернутое значение: " + reversedString);


        if (inputString.equals(reversedString))

            System.out.println("Введенное значение является палиндромом");

        else

            System.out.println("Введенное значение не является палиндромом");


    }

}
