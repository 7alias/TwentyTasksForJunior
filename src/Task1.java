public class Task1 implements Runnable {


    // ITVDN.com 1 из ТОП 20 тестовых заданий на интервью для Java разработчика


    @Override
    public void run() {
        String st = "Задача1";

        StringBuilder stB = new StringBuilder();

        stB.append(st);

        stB = stB.reverse();       // используем StringBuilder для переворота строки

        System.out.println(stB);

    }
}

