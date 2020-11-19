package day4;

import java.util.Arrays;

public class Task3 {
    public static void main(String [] args) {
        int[][]  number = new int [12][8];
        int sumMax = 0;
        int sumLine = 0;
        int pointer = 0;
        for (int i=0; i<12; i++){
            sumLine = 0;
            for (int j=0; j<8; j++){
                number[i][j] = (int) (Math.random() * 50);
                sumLine+=number[i][j];
            }
            if (sumMax<=sumLine){
                sumMax=sumLine;
                pointer = i+1;
            }
            System.out.println(Arrays.toString(number[i])+"    "+sumLine);
        }
        System.out.println("индекс строки, сумма чисел в которой максимальна: "+pointer);
    }
    /*
    Заполнить двумерный массив (матрицу) случайными числами от 0 до 50. Размер
матрицы задать m=12 , n=8 ( m - размерность по строкам, n - размерность по колонкам).
В консоль вывести индекс строки, сумма чисел в которой максимальна. Если таких
строк несколько, вывести индекс последней из них.
     */
}
