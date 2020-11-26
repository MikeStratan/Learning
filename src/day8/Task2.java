package day8;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane ( "Boeing" , 2000 , 150 , 10000 );
        System. out . println (airplane);
    }
}

class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String producer, int year, int length, int weight){
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }
    public void setYear(int airplaneYear){
        year = airplaneYear;
    }
    public void setLength(int airplaneLength){
        length = airplaneLength;
    }
    void info(){
        System.out.println("Изготовитель: "+producer+", год выпуска: "+year+", длина: "+length+", вес: "+weight+", количество топлива в баке: "+fuel);
    }
    void fillUp(int addition){
        this.fuel+=addition;
    }

    public String toString(){
        return "Изготовитель: "+producer+", год выпуска: "+year+", длина: "+length+", вес: "+weight+", количество топлива в баке: "+fuel;
    }
}
/*
Скопируйте класс Самолет из задания дня 6.
Внесите изменения в класс таким образом, чтобы следующий код выводил
информацию о самолете, аналогично вызову метода info() .
Airplane airplane = new Airplane ( "Boeing" , 2000 , 150 , 10000 );
System. out . println (airplane);
 */