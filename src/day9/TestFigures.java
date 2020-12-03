package day9;

import static java.lang.Math.*;
public class TestFigures{

    public static void main(String[] args) {

        Figure[] figures = {
                new Triangle ( 10 , 10 , 10 , "Red" ),
                new Triangle ( 10 , 20 , 30 , "Green" ),
                new Triangle ( 10 , 20 , 15 , "Red" ),
                new Rectangle ( 5 , 10 , "Red" ),
                new Rectangle ( 40 , 15 , "Orange" ),
                new Circle ( 4 , "Red" ),
                new Circle ( 10 , "Red" ),
                new Circle ( 5 , "Blue" )
        };
        System.out.println(calculateRedPerimeter(figures));
        System.out.println(calculateRedArea(figures));
    }
        public static double calculateRedPerimeter(Figure[] figures){
            double sumRedPerimeter = 0;
            for (Figure figure : figures) {
                if (figure.getColour().equals("Red")) {
                    sumRedPerimeter += figure.perimeter();
                }
            }
            return sumRedPerimeter;
        }
        public static double calculateRedArea(Figure[] figures){
            double sumRedArea = 0;
            for (Figure figure : figures) {
                if (figure.getColour().equals("Red")) {
                    sumRedArea += figure.area();
                }
            }
            return sumRedArea;
        }
}

abstract class Figure{
    private String color;
    public Figure(String color){
        this.color = color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColour() {
        return this.color;
    }
    public abstract double area();
    public abstract double perimeter();
}

class Circle extends Figure{

    private int radius;

    public Circle(int radius, String color){
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI*pow(radius,2);
    }

    @Override
    public double perimeter() {
        return 2*PI*radius;
    }
}

class Rectangle extends Figure{

    private int length;
    private int height;

    public Rectangle(int length, int height, String color){
        super(color);
        this.length = length;
        this.height = height;
    }
    @Override
    public double area() {
        return height*length;
    }
    @Override
    public double perimeter() {
        return 2*(length+height);
    }
}

class Triangle extends Figure{

    private int length1;
    private int length2;
    private int length3;

    public Triangle(int length1, int length2, int length3,  String color){
        super(color);
        this.length1 = length1;
        this.length2 = length2;
        this.length3 = length3;
    }
    @Override
    public double area() {
        return sqrt((length1+length2+length3)/2*((length1+length2+length3)/2 - length1)*((length1+length2+length3)/2 - length2)*((length1+length2+length3)/2 - length3));
    }
    @Override
    public double perimeter() {
        return length1+length2+length3;
    }
}


/*
Создайте абстрактный класс Фигура (англ. Figure). Этот класс будет являться
абстрактным представлением геометрической фигуры в нашей программе.
У всех фигур в нашей программе есть цвет, поэтому в классе Фигура есть строковое
поле color . Создайте конструктор, геттер и сеттер для этого поля.
У класса Фигура определены два абстрактных метода:
public abstract double area();
public abstract double perimeter();
Реализация первого метода должна возвращать площадь фигуры, а реализация
второго метода должна возвращать периметр фигуры.
Создайте 3 геометрические фигуры: Круг (англ. Circle ), Прямоугольник (англ.
Rectangle ) и Треугольник (англ. Triangle ). Каждая из фигур должна наследоваться
от абстрактного класса Фигура (англ. Figure ).
У класса Круг будет одно поле - радиус окружности.
У класса Прямоугольник будет два поля - ширина и высота.
У класса Треугольник будет три поля - длина каждой из сторон.
Для каждого из этих трех классов необходимо реализовать конструктор, который
принимает на вход размерности фигуры и цвет фигуры.
В этих же классах, вам необходимо реализовать два метода ( area() и
perimeter() ). Реализация этих методов будет разной для каждой из геометрических
фигур. Формулы для вычисления площади и периметра легко находятся в интернете.
После того, как геометрические фигуры будут полностью реализованы, вам
необходимо будет реализовать еще один класс - TestFigures . В этом классе, в
методе main() должны быть созданы и помещены в массив следующие
геометрические фигуры:
Figure[] figures = {
new Triangle ( 10 , 10 , 10 , "Red" ),
new Triangle ( 10 , 20 , 30 , "Green" ),
new Triangle ( 10 , 20 , 15 , "Red" ),
new Rectangle ( 5 , 10 , "Red" ),
new Rectangle ( 40 , 15 , "Orange" ),
new Circle ( 4 , "Red" ),
new Circle ( 10 , "Red" ),
new Circle ( 5 , "Blue" )
};
В этом же классе реализуйте два метода:
public static double calculateRedPerimeter(Figure[] figures)
public static double calculateRedArea(Figure[] figures)
Первый метод, принимая на вход массив геометрических фигур, должен вернуть
сумму периметров красных фигур. Второй метод, принимая на вход массив
геометрических фигур, должен вернуть сумму площадей красных фигур.
Вызовите эти два метода на массиве figures и выведите результат в консоль.
 */
