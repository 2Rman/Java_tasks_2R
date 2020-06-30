package undertask_5;

import java.util.Scanner;

public class aryph_geom {
    public static void main(String[] args) {

        System.out.println("Введите шестизначное число");
        Scanner in = new Scanner(System.in);

        int aryphm = 0, geom = 1, num = in.nextInt();
        String strFromNum = Integer.toString(num);
        int[] arrFromStr = new int[6];

        for (int i = 0; i < strFromNum.length(); i++){
            arrFromStr[i] = strFromNum.charAt(i) - '0';
        }

        for (int i = 0; i < arrFromStr.length; i++){
            aryphm += arrFromStr[i];
            geom *= arrFromStr[i];
        }

        double aryphmLast = (double)aryphm/arrFromStr.length;
        double geomLast = Math.pow(geom, 1.0/arrFromStr.length);
        System.out.println("Среднее арифметическое из этого всего:\n" + aryphmLast);
        System.out.println("Среднее геометрическое из этого всего:\n" + geomLast);
    }
}
