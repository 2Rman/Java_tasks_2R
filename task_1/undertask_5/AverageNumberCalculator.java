package undertask_5;

import java.util.Scanner;

//Наименование
public class AverageNumberCalculator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int arithm = 0;
        int geom = 1;
        int num;

        //Такая же проверка в прошлом должна быть :)
        do {
            System.out.println("Введите шестизначное число");
            num  = in.nextInt();
        } while (num > 999999 || num < 100000);

        String strFromNum = Integer.toString(num); //Достаточно грамотно. А можно еще вот так num + ""
        char[] arrFromStr = strFromNum.toCharArray(); //Очень удобный метод, который дробит строку на символы

//        - '0'? Выглядит достаточно загадочно, никогда не видел. Закомментил
//        for (int i = 0; i < strFromNum.length(); i++){
//            arrFromStr[i] = strFromNum.charAt(i) - '0';
//        }

        //С циклом сама идея вообще подсказала
        for (char c : arrFromStr) {
            arithm += Character.digit(c, 10); //По сути берет значение char в 10-чном представленнии
            geom *= Character.digit(c, 10); //Обычное приведение к int вернуло бы ASCII код
        }

        double averageArithm = (double) arithm/arrFromStr.length;
        double averageGeom = Math.pow(geom, 1.0/arrFromStr.length);

        System.out.println("Среднее арифметическое из этого всего:\n" + averageArithm);
        System.out.println("Среднее геометрическое из этого всего:\n" + averageGeom);
    }
}
