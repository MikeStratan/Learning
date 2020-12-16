package day18;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sbNumber = new StringBuilder(scanner.nextLine());
        System.out.println(countSeven(sbNumber));
    }
    public static int countSeven(StringBuilder number){
        if (number.length() == 0){
            return 0;
        }
        if (Character.getNumericValue(number.charAt(number.length()-1))==7) {
            return 1+countSeven(number.deleteCharAt(number.length()-1));
        }
        else {
            return countSeven(number.deleteCharAt(number.length() - 1));
        }
    }
}
/*
Создайте рекурсивный метод, который принимает на вход единственный аргумент -
число, и возвращает количество цифр 7 в этом числе. Циклы использовать
запрещено , можно использовать только рекурсивные вызовы.
Пример:
System. out . println ( count7 ( 717771237 )); // 5
*В числе 717771237 ровно 5 раз используется цифра семь.
 */