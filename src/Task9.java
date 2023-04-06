import java.util.Scanner;

public class Task9 implements Runnable {
    @Override
    public void run() {


//Q # 9) Написать программу на Java для вычисления серии чисел Фибоначчи.
//        Ответ:
//        Ряд Фибоначчи — это такая серия чисел, где после первых двух чисел - каждое встречающееся число является суммой двух предыдущих чисел.
//        Пример: 0,1,1,2,3,5,8,13,21 ………
//        В этой программе мы снова использовали класс Scanner с nextInt (описывалось выше). Первоначально мы вводим (через командную строку) некое число, какое количество чисел Фибоначчи мы должны получить. Мы объявили целочисленные переменные number, x, y и z, инициализировали x и y нулем, а z - единицей. Затем мы использовали цикл for для итерации.
//        Процесс решения в цикле выглядит так – мы присваиваем x значение равное y (которое в первой итерации равно 0), затем y присваиваем значение переменной z (равное в первой итерации 1). Затем переменной z присваиваем значение равное сумме значений x и y.
        // ITVDN.com 9 из ТОП 20 тестовых заданий на интервью для Java разработчика

        int number, x = 0, y = 0, z = 1;

        Scanner scannerQ = new Scanner(System.in);

        System.out.println("Введите количество значений");

        number = scannerQ.nextInt();

        System.out.println("Серия чисел Фибоначчи: ");

        for (int i = 0; i <= number; i++) {

            x = y;

            y = z;

            z = x + y;

            System.out.println(x + "");    // если вы хотите вывести в текущей строке - используйте print()

        }


    }
}