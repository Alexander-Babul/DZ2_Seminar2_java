/*Задание 1. Формирование URL с параметрами
Дана строка базового URL:
https://example.com/search?
Сформируйте полный URL, добавив к нему параметры для поиска. Параметры
передаются в виде строки, где ключи и значения разделены =, а пары
ключ-значение разделены &. Если значение null, то параметр не должен
попадать в URL.
Пример:
params = "query=java&sort=desc&filter=null"
Результат:
https://example.com/search?query=java&sort=desc
 */
package Seminar2;

public class DZ2_1 {
    public static void main(String[] args) {
        String baseURL = "https://example.com/search?";
        String params = "query=java&sort=desc&filter=null";
        System.out.println(buildURL(baseURL, params));
    }
    static String buildURL(String baseURL, String params) {
        StringBuilder url = new StringBuilder(baseURL);
        String[] pairs = params.split("&");
        for (int i = 0; i < pairs.length; i++) {
            String[] keyValue = pairs[i].split("=");
            if (!"null".equals(keyValue[1])) {
                if (i > 0) {
                url.append("&");
                }
                url.append(keyValue[0]).append("=").append(keyValue[1]);
            }
        }
        return url.toString();
        
}
}
