package undertask_4;
// Число должно образовывать возрастающую последовательность

import java.util.Scanner;

public class num_compare {
    public static void main(String[] args) {
        System.out.println("---Проверяем, что цифры четырёхзначного числа образуют возрастающую или убывающую последовательность ---");
        System.out.println("Введите четырехзначное число...");

        Scanner numScan = new Scanner(System.in);
        String num = numScan.nextLine();

        int fir = num.charAt(0);
        int sec = num.charAt(1);
        int thr = num.charAt(2);
        int fou = num.charAt(3);

        if ((fir > sec) && (fir > thr) && (fir > fou)) {
            if ((sec > thr) && (sec > fou)) {
                if (thr > fou) {
                    System.out.println("Число убывающее");
                }
            }
        } else if ((fir < sec) && (fir < thr) && (fir < fou)) {
            if ((sec < thr) && (sec < fou)) {
                if (thr < fou) {
                    System.out.println("Число возрастающее");
                }
            }
        } else {
            System.out.println("Это просто число");
        }
    }
}