package day8;

public class Task1 {
    public static void main(String[] args) {

        String string1 = "";
        for (int i=0;i<20001;i++){
            string1 = string1+i+" ";
        }
        System.out.println(string1);
        //Build completed successfully in 2 s 706 ms

        StringBuilder sb1 = new StringBuilder();
        for (int j=0;j<20001;j++){
            sb1.append(j).append(" ");
        }
        System.out.println(sb1);
        //Build completed successfully in 2 s 502 ms
    }
}
/*
1. Создать строку, состоящую из чисел от 0 до 20000. Важно понимать, что это одна
строка, полученная конкатенацией (“склеиванием”) чисел из диапазона через пробел
(0 + “ “ + 1 + “ “ + 2 + … + 20000).
После создания такой строки, вызов System.out.println() на этой строке должен
вывести в консоль сразу все числа из диапазона:
0 1 2 3 4 5 6 7 8 9 10 11 12 … 19995 19996 19997 19998 19999 20000
Для того, чтобы почувствовать разницу в производительности между конкатенацией
обычных строк (класс String ) и использовании StringBuilder , реализуйте
описанную задачу этими двумя способами, замеряя время работы программы.
 */
