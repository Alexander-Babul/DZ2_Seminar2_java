package Seminar2;
import java.util.logging.Logger;
import java.util.Scanner;

/*3. Реализовать простой калькулятор + логирование*/
/*Инструкция:цифра-ввод-(+,-,*,/)-ввод-цифра-ввод-(=)-ввод*/
public class DZ2_5 {
    public static void main(String[] args) throws Exception {
        Logger logger = Logger.getLogger("DZ2_5");
        logger.info("Это калькулятор. Инструкция:цифра-ввод-(+,-,*,/)-ввод-цифра-ввод-(=)-ввод: ");
        calc();
    }

    static void calc(){
        Logger logger = Logger.getLogger("DZ2_5");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        String b = scanner.next();
        double c = scanner.nextDouble();
        String d = scanner.next();
        double result = 0;
        if(b.equals("+")){
            result = a + c;
        }
        if(b.equals("-")){
            result = a - c;
        }
        if(b.equals("*")){
            result = a * c;
        }
        if(b.equals("/")){
            result = a / c;
        }
        if(d.equals("=")){
            System.out.println(result);
        }
        scanner.close();
        logger.info("result");
        logger.info("Вычисления завершены!");
    }
}
