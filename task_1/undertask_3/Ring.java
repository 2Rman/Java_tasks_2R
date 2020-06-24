package undertask_3;
// ВЫЧИСЛЯЕМ ПЛОЩАДЬ КОЛЬЦА, ОБРАЗОВАННОГО КРУГАМИ С ОБЩИМ ЦЕНТРОМ И РАЗНЫМИ РАДИУСАМИ
import java.util.Scanner;

public class Ring {
    public static void main(String[] args) {

        double rad1 = 0, rad2 = 1, pi = 3.14;
        Scanner getRad = new Scanner(System.in);

        System.out.println("ВВедите радиусы кругов 1 и 2 соответственно...\n");

        do{
            rad1 = getRad.nextDouble();
            rad2 = getRad.nextDouble();
            if (rad1 < rad2) {
                System.out.println("Радиус первого круга меньше или равен радиусу второго круга");
                System.out.println("Невозможно создать кольцо...");
            }
        } while (rad1 < rad2);
        System.out.println("Площадь образованного кольца: ");
        System.out.println((pi * (rad1 * rad1)) - (pi * (rad2 * rad2)));
    }
}

