package undertask_4;


import java.util.Scanner;

/**
 * Число должно образовывать возрастающую последовательность
 */
//Грубое замечание по поводу именования.
//Название классов:
// 1) с большой буквы. +
// 2) Без нижних подчеркиваний. Если два слова, то стиль CamelCase +
// 3) Наименование должно быть существительным +
public class SequenceComparator {
    public static void main(String[] args) {
        System.out.println("---Проверяем, что цифры четырёхзначного числа образуют возрастающую или убывающую последовательность ---");
        System.out.println("Введите четырехзначное число...");

        Scanner numScan = new Scanner(System.in);
        String num = numScan.nextLine();

        //Желательно переделать через массив int[] и сделать через цикл. Помним, что у String, есть поле length,
        //которое возвращает длину строки
        //Подумай сам, исправлять не буду
        //-
        int fir = num.charAt(0);
        int sec = num.charAt(1);
        int thr = num.charAt(2);
        int fou = num.charAt(3);

        //Остальное в норме. Плюсик за то, что начал разбивать всё по блокам :)
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