package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setYear(1967);
        car1.setColour("Red");
        car1.setModel("Shelby Mustang");
        System.out.println(car1.getModel()+"    "+car1.getColour()+"    "+car1.getYear());
    }
}

class Car{
    private int year;
    private String colour;
    private String model;
    public void setYear(int carYear){
        year = carYear;
    }
    public int getYear(){
        return year;
    }
    public void setColour(String carColour){
        colour = carColour;
    }
    public String getColour(){
        return colour;
    }
    public void setModel(String carModel){
        model = carModel;
    }
    public String getModel(){
        return model;
    }
}
/*
Создать класс Автомобиль (англ. Car ), с полями “Год выпуска”, “Цвет”, “Модель”.
Создать get и set методы для каждого поля. Создать экземпляр класса Автомобиль,
задать сеттером каждое поле, вывести в консоль значение каждого поля геттером.
Созданный вами класс должен отвечать принципам инкапсуляции.
 */
