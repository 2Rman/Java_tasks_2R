package undertask_6;

import java.util.Scanner;

public class Reverser {
    public static void main(String[] args) {

        System.out.println("Введите семизначное число");
        Scanner in = new Scanner(System.in);

        //Проверка на семизначность?

        int b;
        int a = in.nextInt();

        String reversedStr = "";
        String str = Integer.toString(a);
        int[] numbers = new int[7];

        //Выглядит всё ещё страшно)
        for (int i = 0; i < str.length(); i++) {
            numbers[i] = (str.charAt(i) - '0');
        }

        //Отлично)
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += numbers[i];
        }

        b = Integer.parseInt(reversedStr);
        System.out.println("Ваше число в обратной последовательности:\n" + b);
    }
}

