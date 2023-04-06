import java.util.Scanner;

public class Task22 implements Runnable {

    @Override
    public void run() {
//        Способ 2:
//        Это еще один способ выполнить задачу с переворотом последовательности символов в строке. В этом способе вы объявляете строковую переменную st, а затем используете класс Scanner, объявляя объект scannerQ для работы со стандартным потоком ввода данных.
//                В данном случае программа примет строковое значение через командную строку (при ее выполнении).
//                Далее мы использовали метод nextLine(), который прочитал нашу строку при вводе ее через консоль с пробелами между словами строки. После этого мы использовали метод split() для разделения строки на ее подстроки (здесь не указывается разделитель). Затем, мы выводим строку в обратном порядке, используя цикл for.
        // ITVDN.com 2 из ТОП 20 тестовых заданий на интервью для Java разработчика

        String st;

        Scanner scannerQ = new Scanner(System.in);

        System.out.println("Введите вашу строку:");

        st = scannerQ.nextLine();

        String[] temp = st.split("");    //используем метод split для вывода строки в обратном порядке

        for (int x = temp.length - 1; x >= 0; x--) {

            System.out.print(temp[x] + "");

        }
    }
}

