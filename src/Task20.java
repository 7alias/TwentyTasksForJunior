import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Task20 implements Runnable {
//
//Q # 20) Напишите Java-программу для чтения данных из таблицы Excel.
//        Ответ:
//        Эти типы программ обычно используются в рамках Selenium framework. Мы добавили подробные комментарии для каждого шага, чтобы сделать программу более понятной.
//        Логика начинается с того момента, как мы загрузили лист, на котором хранятся данные. Мы пытаемся импортировать электронную почту и пароль. Для этого мы извлекаем ячейку с помощью методов getRow() и getCell(). Допустим, у нас есть электронная почта и пароли в 1-й и 2-й ячейке.
//        Далее мы устанавливаем тип ячейки - строковой. После этого мы выполняем обычную операцию локатора веб-элемента (By.id), куда мы передали уникальные значения локатора, такие как «email» и «пароль», которые будут идентифицировать эти элементы.
//        Наконец, мы отправляем ключи, используя element.sendKeys, где cell.getStringCellValue() - это ключ. Эта операция вернет вам значение, сохраненное в ячейках № 1 и 2 соответственно.


    @Override
    public void run() {


        @Test


        public void ReadData () throws IOException {

            // импортируйте лист Excel из директории web диска c.

            //QurentSourceFile – это имя нужного файла excel

            File sourceFile = new File("C:\\web\\QurentSourceFile.xls");


// На этом шаге мы загружаем файл. Мы используем FileInputStream для чтения из

// файла excel. В случае если вы хотите проводить запись в файл -

// вам следует использовать FileOutputStream. Путь к файлу передается в качестве

// аргумента FileInputStream

            FileInputStream fileInput = new FileInputStream(sourceFile);


            // На этом шаге мы загружаем рабочую книгу excel с помощью HSSFWorkbook,

            // в который мы передаем fileInput в качестве аргумента

            HSSFWorkbook book = new HSSFWorkbook(fileInput);


            // На этом шаге мы загружаем конкретный лист excel, на котором хранятся данные.


            qurentSheet = book.getSheetAt(0);


            for (int i = 1; i <= qurentSheet.getLastRowNum(); i++) {

                // Import data for Email.

                qurentCell = qurentSheet.getRow(i).getCell(1);

                qurentCell.setCellType(Cell.CELL_TYPE_STRING);

                driver.findElement(By.id("email")).sendKeys(qurenrCell.getStringCellValue());


                // Импортируем данные из ячеек с паролями.

                qurentCell = qurentSheet.getRow(i).getCell(2);

                qurentCell.setCellType(Cell.CELL_TYPE_STRING);

                driver.findElement(By.id("password")).sendKeys(qurenrCell.getStringCellValue());


            }

        }
    }
}