package undertask_1;

//Убрал лишние импорты
import java.util.Scanner;

public class ABC_compare {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Введите числа a b c для сравнения");
        //+

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        //+
        if (a != b) {
            System.out.println("a не равно b");
        } else {
            System.out.println("a равно b");
        }

        if (b != c) {
            System.out.println("b не равно c");
        } else {
            System.out.println("b равно c");
        }

        if (c != a) {
            System.out.println("c не равно a");
        } else {
            System.out.println("c равно a");
        }
    }
}
