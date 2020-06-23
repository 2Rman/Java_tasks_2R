package undertask_2;

import java.util.Scanner;

public class Dinosaur {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Сколько весит динозавр?");
        //Отделил логический блок
        
        int dino_kg = in.nextInt(); //Переменные в java называются в camelCase-стиле, то есть dinoKg
        double dino_t = (double) dino_kg / 1000; //Пробелы ;) + название переменной
        long dino_gr = (dino_kg * 1000); // название переменной
        long dino_mg = (dino_gr * 1000); //название переменной
        
        System.out.println("Значит он весит:\n" + dino_t + " тонн, \n" + dino_gr + " грамм, \n" + dino_mg + " миллиграмм!");
    }
}
