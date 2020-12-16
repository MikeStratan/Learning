package day18;


public class Task01 {
    public static void main(String[] args) {
        int [] numbers = { 1 , 10 , 1241 , 50402 , - 50 , 249 , 10215 , 665 , 2295 , 7 , 311 };
        System.out.println(recursionSum(numbers,numbers.length-1));
    }
    public static int recursionSum (int[] numbers, int i){
        if (i==0) {
            return numbers[0];
        }
        return numbers[i]+ recursionSum(numbers, i-1);
    }
}
/*
Вам дан числовой массив произвольного размера. Посчитайте сумму чисел в этом
массиве не используя циклы (необходимо использовать рекурсивные вызовы).
Пример:
int [] numbers = { 1 , 10 , 1241 , 50402 , - 50 , 249 , 10215 , 665 , 2295 , 7 , 311 };
System. out . println ( recursionSum ( ... )); // 65346
* recursionSum (...) - это ваш рекурсивный метод, который вернет сумму чисел в
массиве numbers .
 */
