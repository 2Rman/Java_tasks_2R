package undertask_6;

import java.util.Scanner;

public class revers {
    public static void main(String[] args) {

        System.out.println("Введите семизначное число");
        Scanner in = new Scanner(System.in);

        int b, a = in.nextInt();
        String strRev = "", str = Integer.toString(a);
        int[] numbers = new int[7];

        for (int i = 0; i < str.length(); i++){
            numbers[i] = (str.charAt(i) - '0');
        }

        for (int i = str.length() - 1; i >= 0; i--){
            strRev += numbers[i];
        }
        b = Integer.parseInt(strRev);
        System.out.println("Ваше число в обратной последовательности:\n" + b);
    }
}

