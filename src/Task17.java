public class Task17 implements Runnable{
    @Override
    public void run() {

//Q # 17) Напишите Java-программу для проверки является ли введенное число - числом Армстронга.
//       Ответ:
//        Прежде всего, нам нужно понять, что такое число Армстронга. Число Армстронга это число, значение которого равно сумме цифр, из которых оно состоит, возведенных в степень, равную количеству цифр в этом числе. Как пример - число 371:
//        371 = 3*3*3 + 7*7*7 + 1*1*1 = 27 + 343 + 1 = 371
//        Если у вас число четырехзначное:
//        8208 = 8*8*8*8 + 2*2*2*2 + 0*0*0*0 + 8*8*8*8 = 4096 + 16 + 0 + 4096 = 8208
//        Выполняя решение, для начала мы объявляем целочисленные переменные tempNumber, x и y. Мы инициализировали переменную y значением 0. Затем мы создаем переменную qurentNumber и присваиваем ей целочисленное значение, которое мы собираемся проверить является ли оно числом Армстронга (в нашем случае это 371). Затем мы присвоили нашей переменной tempNumber то значение, которое хранится в проверяемой переменной qurentNumber.
//        Далее в цикле while мы переменной a присваиваем остаток от деления числа qurentNumber на 10 – и получим число единиц в изначальном числе qurentNumber. Затем мы заменяем значение переменной qurentNumber на результат деления введенного числа на 10. Нашей переменной y, значение которой изначально было установлено как 0, присваивается результат y + (x* x * x). Таким образом во время первой итерации в y попадет результат возведения в нужную степень значения числа единиц в изначальном числе, при следующей итерации в y к степени числа единиц добавится результат возведения в степень числа десятков, и так далее по всем разрядам до конца числа qurentNumber с права налево.
//        Наконец, мы используем оператор if-else для проверки, будет ли полученное значение переменной y равно значению переменной tempNumber (в которой хранится исходное число). Если y = tempNumber, то загаданное число является числом Армстронга, иначе - нет.

        // ITVDN.com 17 из ТОП 20 тестовых заданий на интервью для Java разработчика
        int y=0, x, tempNumber;
        int qurentNumber=371; //Данное число мы будем проверять на то, является ли оно числом Армстронга
        tempNumber = qurentNumber;
        while(qurentNumber >0)
        {
            x= qurentNumber %10;
            qurentNumber = qurentNumber /10;
            y=y+(x*x*x);
        }
        if(tempNumber ==y)
            System.out.println("Данное число является числом Армстронга");
        else
            System.out.println("Данное число не является числом Армстронга");
    }
}