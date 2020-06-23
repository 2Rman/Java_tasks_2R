package undertask_1;

import org.w3c.dom.ls.LSInput; //Цэ шо?
import javax.swing.*; //Цэ зачем?
import java.sql.SQLOutput; //Цэ шо тоже?
import java.util.Scanner;

public class ABC_compare {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Введите числа a b c для сравнения");
        //Желательно отделять пустыми строками логические блоки. Например ниже три строки - логический блок объявления основных переменных
        
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        
        if (a != b) { //пробелы перед и после знака сравнения)
            System.out.println("a не равно b");
        } else {
            System.out.println("a равно b"); //Даже если в else строчка одна, желательно её обрамлять скобочками фигурными
        }
        
        if (b!=c) {
            System.out.println("b не равно c");
        } else {
            System.out.println("b равно c");
        }
        
        if (c!=a) {
            System.out.println("c не равно a");
        } else {
            System.out.println("c равно a");
        }
    }
}
