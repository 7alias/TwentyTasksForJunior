import java.util.Scanner;

public class Task7 implements Runnable {
    @Override
    public void run() {


//    Q # 7) Напишите программу на Java, чтобы узнать, является ли число простым или нет.
//    Ответ:
//    Мы объявили две целочисленных переменных temp и number и использовали класс Scanner с nextInt (поскольку у нас может быть на рассмотрении только целое число).
//    Объявляем логическую переменную numberIsPrime и устанавливаем ее значение - true. После этого мы используем цикл for со значением переменной итератора, начинающемся с 2. Количество итераций, нужное нам, будет равно половине введенного числа. Счетчик итераций увеличивается на 1 после каждой итерации. В переменную tempNumber мы будем помещать остаток от деления значения введенного числа на значение счетчика. Если остаток от деления в одной из итераций будет равен 0, тогда numberIsPrime будет установлен в false, введенное число не будет простым, и мы выходим из цикла. Если во всех итерациях мы будем получать в temp некие остатки от деления, отличные от нуля – число будет простым.
//    Основываясь на значении numberIsPrime, мы приходим к выводу, является ли наше число простым или нет.
        // ITVDN.com ТОП 20 тестовых заданий на интервью для Java разработчика
        int tempNumber, number;
        boolean numberIsPrime = true;
        Scanner scannerQ = new Scanner(System.in);
        number = scannerQ.nextInt();
        scannerQ.close();
        for (int x = 2; x <= number / 2; x++) {

            tempNumber = number % x;

            if (tempNumber == 0) {

                numberIsPrime = false;

                break;

            }

        }

        if (numberIsPrime)

            System.out.println(number + " число является простым");

        else

            System.out.println(number + " число не является простым");


    }

}