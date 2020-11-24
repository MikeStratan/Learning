package day5;

public class Task2 {
    public static void main(String[] args) {
        Motorcycle motorcycle1 = new Motorcycle(1994,"Red","Honda Steed");
        System.out.println(motorcycle1.getYear()+"  "+motorcycle1.getColour()+"  "+motorcycle1.getModel());
    }
}

class Motorcycle{
    private int year;
    private String colour;
    private String model;

    public Motorcycle(int year, String colour, String model){
        this.year = year;
        this.colour = colour;
        this.model = model;
    }
    public int getYear(){
        return year;
    }
    public String getColour(){
        return colour;
    }
    public String getModel(){
        return model;
    }
}
/*
Создать класс Мотоцикл (англ. Motorbike ), с полями “Год выпуска”, “Цвет”,
“Модель”. Создать экземпляр класса Мотоцикл, с помощью конструктора (сеттеры не
использовать). Придерживаться принципов инкапсуляции и использовать ключевое
слово this . Геттером получить год выпуска, цвет, модель, вывести значения в
консоль.
 */
