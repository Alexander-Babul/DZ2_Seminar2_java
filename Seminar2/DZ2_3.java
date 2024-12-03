/*Задача 3. Удаление пустых строк из текста
Дана строка с несколькими строками текста, разделенными переводами строки.
Напишите метод, который удаляет все пустые строки из текста.
Пример:
line1

line2

line3
Результат:
line1
line2
line3 */
package Seminar2;

public class DZ2_3 {
    public static void main(String[] args) {
        String a = "line1\n\nline2\n\nline3";
        System.out.println(remove_line_transitions(a));
    }

    static String remove_line_transitions(String a){
        StringBuilder result = new StringBuilder();
        String[] res = a.split("\n");
        for(int i =0; i < res.length; i++){
            if (!res[i].isEmpty()) {
                result.append(res[i]);
                result.append("\n");
            }
        }

        if (result.length() > 0) {
            result.setLength(result.length() - 1);
        }
        return result.toString();
        }
        
}
