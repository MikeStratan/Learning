package day6;

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
}
  /*  Создать класс Самолет ( Airplane ) с полями:
            - producer (изготовитель)
- year (год выпуска)
- length (длина)
- weight (вес)
- fuel (количество топлива в баке) + геттер для этого поля
    Создать конструктор в классе Самолет, принимающий в качестве аргументов значения
    четырех полей класса (значение поля “количество топлива в баке” установить равным
            0). В конструкторе для передачи полям значений использовать ключевое слово this .
    Помимо этого, в классе необходимо реализовать метод info() , который выводит
    сообщение в следующем формате:
            “Изготовитель: … , год выпуска: … , длина: ..., вес: ..., количество топлива в баке: …”
    Также, необходимо реализовать метод fillUp() , который в качестве аргумента
    принимает число и заправляет топливный бак самолета на это значение.
    Создать новый объект класса Самолет с произвольными данными.
    Изменить год выпуска и длину с помощью сеттеров, вызвать метод fillUp() два
    раза, передав разные значения. Вызвать метод info() .

   */

