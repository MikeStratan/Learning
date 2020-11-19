package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a = s.nextDouble();
        double b = s.nextDouble();
        while (b != 0) {
            System.out.println(a / b);
            a = s.nextDouble();
            b = s.nextDouble();
        }
    }
}
