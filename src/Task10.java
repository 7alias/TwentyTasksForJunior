import java.util.ArrayList;
import java.util.Iterator;

public class Task10 implements Runnable{
    @Override
    public void run() {
//Q # 10) Напишите Java-программу для обхода ArrayList с использованием цикла for, while и улучшенного цикла for.
//        Ответ:
//        В этой программе мы добавили три элемента в ArrayList и вывели его размер.
//        Затем мы используем цикл While с итератором. Всякий раз, когда итератор получает следующий элемент, он будет отображать этот элемент, пока мы не достигнем конца списка. В нашем случае это будет повторяться три раза.
//        Аналогично, мы сделали для улучшенного цикла for, где мы создали объект o для ArrayList с именем testList. Затем вывели на экран значение объекта.
//        После этого мы создали цикла for, где итератор i установлен сначала на индекс 0, а затем увеличивается на 1 при каждой итерации, пока не будет достигнут предел ArrayList. Наконец, мы выводим на экран каждый элемент, используя метод get(index) для каждой итерации цикла for.
//
        // ITVDN.com 10 из ТОП 20 тестовых заданий на интервью для Java разработчика
        ArrayList testList = new ArrayList();
        testList.add("50");
        testList.add("60");
        testList.add("70");
        System.out.println(testList.size());
        System.out.println("Цикл While:");
        Iterator iter = testList.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
        System.out.println("Улучшенный цикл For:");
        for(Object o : testList) {
            System.out.println(o);
        }
        System.out.println("Цикл For:");
        for(int i=0; i< testList.size(); i++) {
            System.out.println(testList.get(i));
        }
    }
}