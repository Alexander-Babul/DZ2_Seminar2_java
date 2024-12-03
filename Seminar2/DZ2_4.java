package Seminar2;
/*Задача 4. Логирование операций с массивом во время поиска
минимального и максимального элементов
Реализуйте метод поиска минимального и максимального элементов массива.
После нахождения каждого элемента (минимального и максимального),
сделайте запись в лог-файл log.txt в формате год-месяц-день
час:минуты {минимальный элемент}, {максимальный элемент}.
 */
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Logger;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class DZ2_4 {
    public static void main(String[] args) throws Exception {
        Logger logger = Logger.getLogger("DZ2_4");
        Scanner scanner = new Scanner(System.in);
        logger.info("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        for(int i = 0; i < size; i++){
            logger.info("Введите данные в массив: ");
            array[i] = scanner.nextInt();
        }
        int min = array[0];
        int max = array[0];

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        try(FileWriter fw = new FileWriter("log.txt", false)){
            for (int i : array) {
                fw.write(i + "\n");
            }
            for(int i : array){
                if (i < min){
                    min = i;
                    fw.write(String.format("%s {минимальный элемент: %d}, {максимальный элемент: %d}\n", 
                    LocalDateTime.now().format(formatter), min, max));
                }
                if (i > max){
                    max = i;
                    fw.write(String.format("%s {минимальный элемент: %d}, {максимальный элемент: %d}\n", 
                    LocalDateTime.now().format(formatter), min, max));
                }
            }
        } catch (IOException e) {
            logger.severe("Ошибка при записи в файл: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
