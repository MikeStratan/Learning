package day2;

import java.util.Scanner;
import static java.lang.Math.*;

public class Task3 {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите x3");
        double x = s.nextDouble();
        double y;
        if (x>=5) {
            y=(pow(x,2)-10)/(x+7);
        }else if(x>-3) {
            y=(x+3)*(pow(x,2)-2);
        }else {
            y=420;
        }
        System.out.print(y);
    }
}
