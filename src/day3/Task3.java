package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a;
        double b;
        for(int i=0; i<5; i++)  {
            a = s.nextDouble();
            b = s.nextDouble();
            if (b==0){
                System.out.println("Деление на 0");
                continue;
            }
            System.out.println(a / b);
        }
    }
}
