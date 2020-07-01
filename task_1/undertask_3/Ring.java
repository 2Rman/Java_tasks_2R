package undertask_3;

import java.util.Scanner;

/**
 * Это если хочешь добавлять описание к классу/полю/методу. Это называется - Java документация
 * Класс вычисляет площадь кольца, образованного кругами с общим центром и разными радиусами
 */
public class Ring {
    public static void main(String[] args) {
        double firstRadius; //было бессмысленно присваивать, достаточно объявить
        double secondRadius; //Да, желательно с каждой строки новое объявление.

        Scanner scanner = new Scanner(System.in); //не называй переменные с началом get (будем позже проходить)
        // + Сканнер есть сканнер, а не даватель радиусов :)

        //С do while идея хорошая, молодец :)
        //Маленький пробельчик после do
        do {
            System.out.println("ВВедите радиусы кругов 1 и 2 соответственно...\n"); //Блок должен повторяться, если ввели неправильно числа

            firstRadius = scanner.nextDouble();
            secondRadius = scanner.nextDouble();

            if (firstRadius < secondRadius) {
                System.out.println("Радиус первого круга меньше или равен радиусу второго круга");
                System.out.println("Невозможно создать кольцо...");
            }
        } while (firstRadius < secondRadius);

        System.out.println("Площадь образованного кольца: ");
        System.out.println((Math.PI * (firstRadius * firstRadius)) - (Math.PI * (secondRadius * secondRadius)));
        //В Java есть математический класс Math. В нем есть PI
    }
}

